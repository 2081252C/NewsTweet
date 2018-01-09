package controllers;

import play.mvc.*;
import models.TwitterUser;
import models.*;
import play.data.Form;
import play.data.FormFactory;
import models.Search;
import javax.inject.Inject;
import views.html.main;
import play.data.Form.*;

import twitter4j.Twitter;
import twitter4j.User;
import twitter4j.Status;
import twitter4j.TwitterFactory;
import twitter4j.QueryResult;
import twitter4j.Query;
import twitter4j.TwitterException;
import twitter4j.conf.ConfigurationBuilder;
import java.util.List;
import java.util.ArrayList;

import com.aliasi.classify.Classification;
import com.aliasi.classify.Classified;
import com.aliasi.classify.ConfusionMatrix;
import com.aliasi.classify.DynamicLMClassifier;
import com.aliasi.classify.JointClassification;
import com.aliasi.classify.JointClassifier;
import com.aliasi.classify.JointClassifierEvaluator;
import com.aliasi.classify.LMClassifier;

import com.aliasi.lm.NGramProcessLM;

import com.aliasi.util.AbstractExternalizable;

import java.io.File;
import java.io.IOException;

import com.aliasi.util.Files;


import play.*;
import play.mvc.*;
import play.data.*;

public class SearchController extends Controller {

    //private Form<Search> searchForm = Form.form(Search.class);
	@Inject FormFactory formFactory;

	public List<Status> tweets = new ArrayList<Status>();
	public List<String> tID = new ArrayList<String>();
	public List<String> mostPopular = new ArrayList<>();
	public List<String> mostRecent = new ArrayList<>();

	private static File TRAINING_DIR
        = new File("/home/carly/Documents/Project/NewsTweet/NewsTweet/app/controllers/POLARITY_DIR/txt_sentoken");

    private static String[] CATEGORIES
        = { "neg", "pos" };

    private static int NGRAM_SIZE = 8;

    List<String> neg = new ArrayList<>();
    List<String> pos = new ArrayList<>();
    List<Status> sentiment = new ArrayList<>();

	public Result searchResults() {
			 ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        		configurationBuilder.setOAuthConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH")
                .setOAuthConsumerSecret("NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD")
                .setOAuthAccessToken("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n")
                .setOAuthAccessTokenSecret("tFeSn3QIssVrT8OAH42hl7RX8gYpmJX9uj2hMByLjdK8c");

			Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        String term = searchForm.field("searchTerm").value();
	        String searchType = searchForm.field("searchType").value();
	        Search newSearch = new Search(term);
	        searchForm = searchForm.fill(newSearch);

	        Form<Persona> personaForm = formFactory.form(Persona.class).bindFromRequest();
	        String name = personaForm.field("personaName").value();
	        //List interests = personaForm.field("interests").value();

	        Form<Interest> interestForm = formFactory.form(Interest.class).bindFromRequest();
	        String interestName = interestForm.field("interestName").value();

	        Form<Track> trackForm = formFactory.form(Track.class).bindFromRequest();
	        String search = trackForm.field("term").value();
	        String interestTrack = trackForm.field("interest").value();

		    Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance();
		    
		    Query query = new Query(term);
		    query.setSince("2017-06-01");

		    if(searchType.compareTo("User")==0){
		    	term = "from:"+term;
		    	query = new Query(term);
		    }
		    else if(searchType.compareTo("Hashtag")==0){
		    	term = term.replace(" ", "");
		    	term = "#"+term;
		    	query = new Query(term);
		    }

		    try{
		    	QueryResult result = twitter.search(query);
			    for (Status status : result.getTweets()) {
			    	sentiment.add(status);
			        tID.add(Long.toString(status.getId()));
			    }
			}
			catch (TwitterException e){
				return ok("error");
			}

			try{
				query.setResultType(Query.POPULAR);
		    	QueryResult result = twitter.search(query);
			    for (Status status : result.getTweets()) {
			    	if(!mostPopular.contains(Long.toString(status.getId()))){
			        	mostPopular.add(Long.toString(status.getId()));
			    	}
			    }
			}
			catch (TwitterException e){
				return ok("error");
			}

			try{
				query.setResultType(Query.RECENT);
		    	QueryResult result = twitter.search(query);
			    for (Status status : result.getTweets()) {
			    	if(!mostRecent.contains(Long.toString(status.getId()))){
			        	mostRecent.add(Long.toString(status.getId()));
			        }
			    }
			}
			catch (TwitterException e){
				return ok("error");
			}


	        //System.out.println(term);
	         String str = session("id");
	         List<String> personaNames = new ArrayList<>();
            List<String> interests = new ArrayList<>();
	        if(str!=null){
		        Long id = Long.parseLong(str);
		        TwitterUser t = TwitterUser.find.byId(id);
		        List<Persona> personas = Persona.find.query().where()
                                        .ilike("twitter_user", Long.toString(id))
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
				String s = t.username;
			    return ok(views.html.searchResults.render(searchForm, trackForm, s, 1, tID, mostPopular, mostRecent, personaForm, t.imgUrl, interestForm, term, personaNames, interests, ""));
			}
		    else{
		        	return ok(views.html.searchResults.render(searchForm, null, "", 0, tID, mostPopular, mostRecent, personaForm, "", interestForm, term, personaNames, interests, ""));
		        }
    }

    public Result searchAnalytics() {
			 ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        		configurationBuilder.setOAuthConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH")
                .setOAuthConsumerSecret("NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD")
                .setOAuthAccessToken("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n")
                .setOAuthAccessTokenSecret("tFeSn3QIssVrT8OAH42hl7RX8gYpmJX9uj2hMByLjdK8c");

			Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        String term = searchForm.field("searchTerm").value();
	        String searchType = searchForm.field("searchType").value();
	        Search newSearch = new Search(term);
	        searchForm = searchForm.fill(newSearch);

	        Form<Persona> personaForm = formFactory.form(Persona.class).bindFromRequest();
	        String name = personaForm.field("personaName").value();
	        //List interests = personaForm.field("interests").value();

	        Form<Interest> interestForm = formFactory.form(Interest.class).bindFromRequest();
	        String interestName = interestForm.field("interestName").value();

	        Form<Track> trackForm = formFactory.form(Track.class).bindFromRequest();
	        String search = trackForm.field("term").value();
	        String interestTrack = trackForm.field("interest").value();

		    Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance();

		     try{
	            classifier(sentiment);
	        } catch(IOException e){
	            return ok("error");
	        } catch (ClassNotFoundException e){
	            return ok("error");
	        }

	        double posSize = ((double) pos.size())/((double) sentiment.size()) *100;
			double negSize = ((double) neg.size())/((double) sentiment.size()) *100;

	        
	         String str = session("id");
	         List<String> personaNames = new ArrayList<>();
            List<String> interests = new ArrayList<>();
	        if(str!=null){
		        Long id = Long.parseLong(str);
		        TwitterUser t = TwitterUser.find.byId(id);
		        List<Persona> personas = Persona.find.query().where()
                                        .ilike("twitter_user", Long.toString(id))
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
				String s = t.username;
			    return ok(views.html.dataAnalytics.render(searchForm, trackForm, s, 1, tID, pos, posSize, neg, negSize, personaForm, t.imgUrl, interestForm, term, personaNames, interests, ""));
			}
		    else{
		        	return ok(views.html.dataAnalytics.render(searchForm, null, "", 0, tID, pos, posSize, neg, negSize, personaForm, "", interestForm, term, personaNames, interests, ""));
		        }
    }


    public Result showSentiment(String sentiment) {
			 ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        		configurationBuilder.setOAuthConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH")
                .setOAuthConsumerSecret("NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD")
                .setOAuthAccessToken("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n")
                .setOAuthAccessTokenSecret("tFeSn3QIssVrT8OAH42hl7RX8gYpmJX9uj2hMByLjdK8c");

			Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        String term = searchForm.field("searchTerm").value();
	        String searchType = searchForm.field("searchType").value();
	        Search newSearch = new Search(term);
	        searchForm = searchForm.fill(newSearch);

	        Form<Persona> personaForm = formFactory.form(Persona.class).bindFromRequest();
	        String name = personaForm.field("personaName").value();
	        //List interests = personaForm.field("interests").value();

	        Form<Interest> interestForm = formFactory.form(Interest.class).bindFromRequest();
	        String interestName = interestForm.field("interestName").value();

	        Form<Track> trackForm = formFactory.form(Track.class).bindFromRequest();
	        String search = trackForm.field("term").value();
	        String interestTrack = trackForm.field("interest").value();

		    Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance();
	        
	         String str = session("id");
	         List<String> personaNames = new ArrayList<>();
            List<String> interests = new ArrayList<>();
	        if(str!=null){
		        Long id = Long.parseLong(str);
		        TwitterUser t = TwitterUser.find.byId(id);
		        List<Persona> personas = Persona.find.query().where()
                                        .ilike("twitter_user", Long.toString(id))
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
				String s = t.username;
				if(sentiment.compareTo("positive") == 0){
					return ok(views.html.positiveSentiment.render(searchForm, trackForm, s, 1, tID, pos, neg, personaForm, t.imgUrl, interestForm, term, personaNames, interests, ""));
				}
				else{
					return ok(views.html.negativeSentiment.render(searchForm, trackForm, s, 1, tID, pos, neg, personaForm, t.imgUrl, interestForm, term, personaNames, interests, ""));
				}   
			}
		    else{
		    	if(sentiment.compareTo("positive") == 0){
					return ok(views.html.positiveSentiment.render(searchForm, null, "", 0, tID, pos, neg, personaForm, "", interestForm, term, personaNames, interests, ""));
				}
				else{
					return ok(views.html.negativeSentiment.render(searchForm, null, "", 0, tID, pos, neg, personaForm, "", interestForm, term, personaNames, interests, ""));
				} 
			}
    }


    public void classifier(List<Status> classify) throws ClassNotFoundException, IOException {

        pos.clear();
        neg.clear();

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
                    System.out.println("Training on " + CATEGORIES[i] + "/" + trainingFiles[j]);
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
                System.out.print("Testing on " + CATEGORIES[i] + "/" + text + " ");
                Classification classification
                    = new Classification(CATEGORIES[i]);
                Classified<CharSequence> classified
                    = new Classified<CharSequence>(text,classification);
                evaluator.handle(classified);
                JointClassification jc =
                    compiledClassifier.classify(text);
                String bestCategory = jc.bestCategory();
                String details = jc.toString();
                System.out.println("Got best category of: " + bestCategory);
                System.out.println(jc.toString());
                System.out.println("---------------");

                if(bestCategory.compareTo("neg")==0){
                    if(!neg.contains(tweetID)){
                        neg.add(tweetID);
                    }
                }
                else if(bestCategory.compareTo("pos")==0){
                    if(!pos.contains(tweetID)){
                        pos.add(tweetID);
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
