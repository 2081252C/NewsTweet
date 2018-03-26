package controllers;

import twitter4j.conf.ConfigurationBuilder;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import models.*;
import javax.inject.Inject;
import com.aliasi.classify.Classification;
import com.aliasi.classify.Classified;
import com.aliasi.classify.ConfusionMatrix;
import com.aliasi.classify.DynamicLMClassifier;
import com.aliasi.classify.JointClassification;
import com.aliasi.classify.JointClassifier;
import com.aliasi.classify.JointClassifierEvaluator;
import com.aliasi.classify.LMClassifier;
import com.aliasi.util.Files;
import com.aliasi.lm.NGramProcessLM;
import com.aliasi.util.AbstractExternalizable;
import java.io.File;
import java.io.IOException;
import twitter4j.*;
import play.*;
import play.mvc.*;
import play.data.*;


public class HomeController extends Controller{

	@Inject FormFactory formFactory;

    // lock thread to stoBeCategorisedIDs stream
	private final Object lock = new Object();

    // training directory for LingPipe
	private static File TRAINING_DIR
        = new File("/home/carly/Documents/Project/NewsTweet/NewsTweet/app/controllers/classifyTweets/categories-train");
    private static String[] CATEGORIES
        = { "entertainment", "sport", "music", "news", "tech" };

    private static int NGRAM_SIZE = 2;

    private int loggedInBool=1;

    // category tweet objects, tweet IDs and tweet text
    List<String> toBeCategorisedIDs = new ArrayList<>();
    List<String> text = new ArrayList<>();
    List<Status> tweetsToBeCategorised = new ArrayList<>();

    // user personas (interest categories) and interests
    List<String> interests = new ArrayList<>();
    List<String> personaNames = new ArrayList<>();

    // category tweets to be displayed
    List<String> news = new ArrayList<>();
    List<String> entertainment = new ArrayList<>();
    List<String> sport = new ArrayList<>();
    List<String> music = new ArrayList<>();
    List<String> tech = new ArrayList<>();

    public void findUserInformation(String id){
        personaNames.clear();
        interests.clear();

        List<Persona> personas = Persona.find.query().where()
                                .ilike("twitter_user", id)
                                .setFirstRow(0)
                                .setMaxRows(25)
                                .findPagedList()
                                .getList();
        for(Persona p: personas){
            personaNames.add(p.personaName);
            List<Interest> interestsFromDB = Interest.find.query().where()
                                    .ilike("persona_id", Long.toString(p.id))
                                    .setFirstRow(0)
                                    .setMaxRows(25)
                                    .findPagedList()
                                    .getList();
            for(Interest i: interestsFromDB){
                interests.add(i.interestName + " - " + p.personaName);
            }
        }
    }

    public Twitter appLogin(){
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
            configurationBuilder.setOAuthConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH")
            .setOAuthConsumerSecret("NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD")
            .setOAuthAccessToken("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n")
            .setOAuthAccessTokenSecret("tFeSn3QIssVrT8OAH42hl7RX8gYpmJX9uj2hMByLjdK8c");

        Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance();
        return twitter;
    }

    public void addToCategory(List<String> accounts, Twitter twitter){
        // get 30 tweets, check for duplicates, add to list
        for(String value: accounts){
            Query query = new Query(value);
            query.count(30);
            query.lang("en");
            List<Status> tweets = new ArrayList<Status>();
            try{
                QueryResult result = twitter.search(query);
                for (Status status : result.getTweets()) {
                    if(!tweetsToBeCategorised.contains(status) && !toBeCategorisedIDs.contains(Long.toString(status.getId())) && !text.contains(status.getText())){
                        toBeCategorisedIDs.add(Long.toString(status.getId()));
                        tweetsToBeCategorised.add(status);
                        text.add(status.getText());
                    }
                }
            }
            catch (TwitterException e){
                e.printStackTrace();
            }
        }

        try{
            //classify these tweets to make sure they are relevant to category
            classifier(tweetsToBeCategorised);
        } catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

	public Result index() throws ClassNotFoundException, IOException{
        // user ID 
        String userID = session("id");

        if(userID==null){
            userID="1"; // guest user
            loggedInBool=0;
        }
        else{
            loggedInBool=1;
        }
        
        // find twitter user by ID and get information
        Long id = Long.parseLong(userID);
        TwitterUser twitterUserID = TwitterUser.find.byId(id);
        String twitterUsername = twitterUserID.username;
        String twitterProfilePic = twitterUserID.imgUrl;
        findUserInformation(userID);

        // clear lists
        toBeCategorisedIDs.clear();
        tweetsToBeCategorised.clear();

        // search form - available on every page
		Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
        String term = searchForm.field("searchTerm").value();

        // app twitter instance for stream
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
            configurationBuilder.setOAuthConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH")
            .setOAuthConsumerSecret("NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD")
            .setOAuthAccessToken("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n")
            .setOAuthAccessTokenSecret("tFeSn3QIssVrT8OAH42hl7RX8gYpmJX9uj2hMByLjdK8c");

	    TwitterStream twitterStream = new TwitterStreamFactory(configurationBuilder.build()).getInstance();

        // begin stream and retrieve statuses
			StatusListener listener = new StatusListener() {
            @Override
            public void onStatus(Status status) {
                if(!tweetsToBeCategorised.contains(status) && !toBeCategorisedIDs.contains(Long.toString(status.getId()))) {
                	toBeCategorisedIDs.add(Long.toString(status.getId()));
                	tweetsToBeCategorised.add(status);
                }

                // only retrieve 10 tweets at a time
		        if (toBeCategorisedIDs.size() == 10) {
		          synchronized (lock) {
		            lock.notify();
		          }
		        }
            }

            @Override
            public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
                System.out.println("Got a status deletion notice id:" + statusDeletionNotice.getStatusId());
            }

            @Override
            public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
                System.out.println("Got track limitation notice:" + numberOfLimitedStatuses);
            }

            @Override
            public void onScrubGeo(long userId, long upToStatusId) {
                System.out.println("Got scrub_geo event userId:" + userId + " upToStatusId:" + upToStatusId);
            }

            @Override
            public void onStallWarning(StallWarning warning) {
                System.out.println("Got stall warning:" + warning);
            }

            @Override
            public void onException(Exception ex) {
                ex.printStackTrace();
            }
    	};

        twitterStream.addListener(listener);

        // only retrieve tweets in English
        twitterStream.sample("en");

        try {
	      synchronized (lock) {
	        lock.wait();
	      }
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	    twitterStream.shutdown();
		
        return ok(views.html.index.render(searchForm, twitterUsername, loggedInBool, twitterProfilePic, personaNames, interests));
    }

    public Result musicCategory(){
        // search form - available on every page
    	Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
        String term = searchForm.field("searchTerm").value();

        Form<Message> messageForm = formFactory.form(Message.class).bindFromRequest();

        toBeCategorisedIDs.clear();
        tweetsToBeCategorised.clear();
        text.clear();

        //some specific music queries
        List<String> values = new ArrayList<>(Arrays.asList(
                "from:spotify", "from:applemusic", "from:vmas", "gig", "band"));

        Twitter twitter = appLogin();
        
        addToCategory(values, twitter);

        // user ID 
        String userID = session("id");
        if(userID==null){
            userID="1"; // guest user
            loggedInBool=0;
        }
        else{
            loggedInBool=1;
        }
        
        // find twitter user by ID and get information
        Long id = Long.parseLong(userID);
        TwitterUser twitterUserID = TwitterUser.find.byId(id);
        String twitterUsername = twitterUserID.username;
        String twitterProfilePic = twitterUserID.imgUrl;
        findUserInformation(userID);
        
        return ok(views.html.music.render(searchForm, messageForm, twitterUsername, loggedInBool, twitterProfilePic, personaNames, interests, music));	
    }

    public Result entertainmentCategory(){
    	Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
        String term = searchForm.field("searchTerm").value();

        Form<Message> messageForm = formFactory.form(Message.class).bindFromRequest();

        toBeCategorisedIDs.clear();
        tweetsToBeCategorised.clear();
        text.clear();

        List<String> values = new ArrayList<>(Arrays.asList(
                "from:ew", "from:etweekly", "from:thr", "reality show", "celebrity"));

        Twitter twitter = appLogin();
        
        addToCategory(values, twitter);

        // user ID 
        String userID = session("id");
        if(userID==null){
            userID="1"; // guest user
            loggedInBool=0;
        }
        else{
            loggedInBool=1;
        }
        
        // find twitter user by ID and get information
        Long id = Long.parseLong(userID);
        TwitterUser twitterUserID = TwitterUser.find.byId(id);
        String twitterUsername = twitterUserID.username;
        String twitterProfilePic = twitterUserID.imgUrl;
        findUserInformation(userID);
        
        return ok(views.html.entertainment.render(searchForm, messageForm, twitterUsername, loggedInBool, twitterProfilePic, personaNames, interests, entertainment));  
    }

    public Result techCategory(){
    	Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
        String term = searchForm.field("searchTerm").value();

        Form<Message> messageForm = formFactory.form(Message.class).bindFromRequest();

        toBeCategorisedIDs.clear();
        tweetsToBeCategorised.clear();
        text.clear();

        List<String> values = new ArrayList<>(Arrays.asList(
                "from:wired", "from:techcrunch", "from:mashable", "technology", "digital"));

        Twitter twitter = appLogin();
        
        addToCategory(values, twitter);

        // user ID 
        String userID = session("id");
        if(userID==null){
            userID="1"; // guest user
            loggedInBool=0;
        }
        else{
            loggedInBool=1;
        }
        
        // find twitter user by ID and get information
        Long id = Long.parseLong(userID);
        TwitterUser twitterUserID = TwitterUser.find.byId(id);
        String twitterUsername = twitterUserID.username;
        String twitterProfilePic = twitterUserID.imgUrl;
        findUserInformation(userID);
        
        return ok(views.html.tech.render(searchForm, messageForm, twitterUsername, loggedInBool, twitterProfilePic, personaNames, interests, tech));  
    }

    public Result sportCategory(){
    	Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
        String term = searchForm.field("searchTerm").value();

        Form<Message> messageForm = formFactory.form(Message.class).bindFromRequest();

        toBeCategorisedIDs.clear();
        tweetsToBeCategorised.clear();
        text.clear();

        List<String> values = new ArrayList<>(Arrays.asList(
                "from:bbcsport", "from:skysportsnews", "from:scotsunnews", "football", "rugby"));

        Twitter twitter = appLogin();
        
        addToCategory(values, twitter);

        // user ID 
        String userID = session("id");
        if(userID==null){
            userID="1"; // guest user
            loggedInBool=0;
        }
        else{
            loggedInBool=1;
        }
        
        // find twitter user by ID and get information
        Long id = Long.parseLong(userID);
        TwitterUser twitterUserID = TwitterUser.find.byId(id);
        String twitterUsername = twitterUserID.username;
        String twitterProfilePic = twitterUserID.imgUrl;
        findUserInformation(userID);
        
        return ok(views.html.sport.render(searchForm, messageForm, twitterUsername, loggedInBool, twitterProfilePic, personaNames, interests, sport)); 
    }

    public Result newsCategory(){
    	Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
        String term = searchForm.field("searchTerm").value();

        Form<Message> messageForm = formFactory.form(Message.class).bindFromRequest();

        toBeCategorisedIDs.clear();
        tweetsToBeCategorised.clear();
        text.clear();

        List<String> values = new ArrayList<>(Arrays.asList(
                "from:bbcbreaking", "from:cnnbrk", "from:wsjbreakingnews", "breaking news", "news"));

        Twitter twitter = appLogin();
        
        addToCategory(values, twitter);

        // user ID 
        String userID = session("id");
        if(userID==null){
            userID="1"; // guest user
            loggedInBool=0;
        }
        else{
            loggedInBool=1;
        }
        
        // find twitter user by ID and get information
        Long id = Long.parseLong(userID);
        TwitterUser twitterUserID = TwitterUser.find.byId(id);
        String twitterUsername = twitterUserID.username;
        String twitterProfilePic = twitterUserID.imgUrl;
        findUserInformation(userID);
        
        return ok(views.html.news.render(searchForm, messageForm, twitterUsername, loggedInBool, twitterProfilePic, personaNames, interests, news)); 
    }

    public void classifier(List<Status> classify) throws ClassNotFoundException, IOException {

        news.clear();
        entertainment.clear();
        sport.clear();
        music.clear();
        tech.clear();

        DynamicLMClassifier<NGramProcessLM> classifier
            = DynamicLMClassifier.createNGramProcess(CATEGORIES,NGRAM_SIZE);

            for(int i=0; i<CATEGORIES.length; ++i) {
            File classDir = new File(TRAINING_DIR,CATEGORIES[i]);
            if (!classDir.isDirectory()) {
                String msg = "Could not find training directory="
                    + classDir
                    + "\nHave you unpacked 4 newsgroups?";
                System.out.println(msg); // in case exception gets lost in shell
                throw new IllegalArgumentException(msg);
            }

                String[] trainingFiles = classDir.list();
                for (int j = 0; j < trainingFiles.length; ++j) {
                    File file = new File(classDir,trainingFiles[j]);
                    String text = Files.readFromFile(file,"ISO-8859-1");
                   // System.out.println("Training on " + CATEGORIES[i] + "/" + trainingFiles[j]);
                    Classification classification
                        = new Classification(CATEGORIES[i]);
                    Classified<CharSequence> classified
                        = new Classified<CharSequence>(text,classification);
                    classifier.handle(classified);
                }
            }

        @SuppressWarnings("unchecked") // we created object so know it's safe
        JointClassifier<CharSequence> compiledClassifier
            = (JointClassifier<CharSequence>)
            AbstractExternalizable.compile(classifier);

        boolean storeCategories = true;
        JointClassifierEvaluator<CharSequence> evaluator
            = new JointClassifierEvaluator<CharSequence>(compiledClassifier,
                                                         CATEGORIES,
                                                         storeCategories);
        for(int i = 0; i < CATEGORIES.length; ++i) {
            //File classDir = new File(TESTING_DIR,CATEGORIES[i]);
            for (int j=0; j<classify.size();  ++j) {
                String text = classify.get(j).getText();
                String tweetID = Long.toString(classify.get(j).getId());
                String author = classify.get(j).getUser().getScreenName();
                //System.out.print("Testing on " + CATEGORIES[i] + "/" + text + " ");
                Classification classification
                    = new Classification(CATEGORIES[i]);
                Classified<CharSequence> classified
                    = new Classified<CharSequence>(text,classification);
                evaluator.handle(classified);
                JointClassification jc =
                    compiledClassifier.classify(text);
                String bestCategory = jc.bestCategory();
                String details = jc.toString();
                // System.out.println("Got best category of: " + bestCategory);
                // System.out.println(jc.toString());
                // System.out.println("---------------");

                if(bestCategory.compareTo("news")==0){
                    if(!news.contains(tweetID+"-"+author)){
                        news.add(tweetID+"-"+author);
                    }
                }
                else if(bestCategory.compareTo("entertainment")==0){
                    if(!entertainment.contains(tweetID+"-"+author)){
                        entertainment.add(tweetID+"-"+author);
                    }
                }
                else if(bestCategory.compareTo("music")==0){
                    if(!music.contains(tweetID+"-"+author)){
                        music.add(tweetID+"-"+author);
                    }
                }
                else if(bestCategory.compareTo("tech")==0){
                    if(!tech.contains(tweetID+"-"+author)){
                        tech.add(tweetID+"-"+author);
                    }
                }
                else if(bestCategory.compareTo("sport")==0){
                    if(!sport.contains(tweetID+"-"+author)){
                        sport.add(tweetID+"-"+author);
                    }
                }
            }
        }
        ConfusionMatrix confMatrix = evaluator.confusionMatrix();
        System.out.println("Total Accuracy: " + confMatrix.totalAccuracy());

        System.out.println("\nFULL EVAL");
        System.out.println(evaluator);
    }
}
