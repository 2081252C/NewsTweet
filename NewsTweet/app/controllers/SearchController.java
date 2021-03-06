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
import controllers.NLP;

import twitter4j.Twitter;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.DirectMessage;
import twitter4j.User;
import twitter4j.Status;
import twitter4j.MediaEntity;
import twitter4j.TwitterFactory;
import twitter4j.QueryResult;
import twitter4j.Query;
import twitter4j.IDs;
import twitter4j.TwitterException;
import twitter4j.conf.ConfigurationBuilder;
import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.asList; 
import twitter4j.PagableResponseList; 

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
//import org.json.JSON;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.aliasi.util.Files;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Month;
import java.time.Instant;
import java.time.Period;
import java.time.ZoneOffset;
import java.util.Date;


import play.*;
import play.mvc.*;
import play.data.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;


public class SearchController extends Controller {

    //private Form<Search> searchForm = Form.form(Search.class);
	@Inject FormFactory formFactory;

	public List<Status> tweets = new ArrayList<Status>();
	public List<String> tID = new ArrayList<String>();
	public List<String> mostRecent = new ArrayList<>();
	public List<String> mostRecent1 = new ArrayList<>();
	public List<String> mostRecent2 = new ArrayList<>();
	public ArrayList<Status> popStatus = new ArrayList<>();
	public ArrayList<String> allPop = new ArrayList<>();
	public ArrayList<Status> allRecent = new ArrayList<>();
	public List<String> media = new ArrayList<>();
	public List<String> media1 = new ArrayList<>();
	public List<String> media2 = new ArrayList<>();

	private static File TRAINING_DIR
        = new File("/home/carly/Documents/Project/NewsTweet/NewsTweet/app/controllers/POLARITY_DIR/txt_sentoken");

    private static String[] CATEGORIES
        = { "neg", "pos", "neut" };

    private static int NGRAM_SIZE = 8;

    List<String> neg = new ArrayList<>();
    List<String> pos = new ArrayList<>();
    List<String> neut = new ArrayList<>();
    List<Status> sentiment = new ArrayList<>();
    String term = "";
    String searchType="";
    int loggedInBool =1;
	String uri = "";


    public Twitter appLogin(TwitterUser t){
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        		configurationBuilder.setOAuthConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH")
                .setOAuthConsumerSecret("NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD")
                .setOAuthAccessToken(t.accessToken)
                .setOAuthAccessTokenSecret(t.accessTokenSecret)
                .setTweetModeExtended(true);

        Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance();
        return twitter;
    }

    public Twitter appLogin(){
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
            configurationBuilder.setOAuthConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH")
            .setOAuthConsumerSecret("NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD")
            .setOAuthAccessToken("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n")
            .setOAuthAccessTokenSecret("tFeSn3QIssVrT8OAH42hl7RX8gYpmJX9uj2hMByLjdK8c")
            .setTweetModeExtended(true);

        Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance();
        return twitter;
    }

    List<String> personaNames = new ArrayList<>();
	List<String> interests = new ArrayList<>();

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
	     
	            
    //stopwords from https://github.com/Yoast/YoastSEO.js/blob/acd077ca44d904632d8ae7fa5699bdcb76741379/js/config/stopwords.js (with altertions)
    private List<String> stopwords = asList("a", "about", "above", "after", "again", "against", "all", "am", "an", "and", "any", "are", "around", "as", "at", 
    		"be", "because", "been", "before", "being", "below", "between", "both", "but", "by", "can", "could", "did", "do", "does", "doing", 
    		"down", "during", "each", "few", "followers", "follower", "for", "from", "further", "got", "had", "has", "have", "having", "he", "he'd", "he'll", "he's", 
    		"her", "here", "here's", "hers", "herself", "him", "himself", "his", "how", "how's", "i", "i'd", "i'll", "i'm", "i've", 
    		"if", "in", "into", "is", "it", "it's", "its", "itself", "let's", "me", "more", "most", "my", "myself", "nor", "of", "on", 
    		"once", "only", "or", "other", "ought", "our", "ours", "ourselves", "out", "over", "own", "retweet", "rt", "same", "she", "she'd", "she'll", 
    		"she's", "should", "so", "some", "such", "still", "than", "that", "that's", "the", "their", "theirs", "them", "themselves", "then", 
    		"there", "there's", "these", "they", "they'd", "they'll", "they're", "they've", "this", "those", "through", "to", "too", 
    		"under", "until", "up", "very", "was", "we", "we'd", "we'll", "we're", "we've", "were", "what", "what's", "when", "when's", 
    		"where", "where's", "which", "while", "who", "who's", "whom", "why", "why's", "with", "would", "you", "you'd", "you'll", 
    		"you're", "you've", "your", "yours", "yourself", "yourselves");


	public Result searchResults() {
			uri = request().uri();

			System.out.println("hello i'm signed in " + session("id"));

			tweets.clear();
			tID.clear();
			allPop.clear();
			popStatus.clear();
			mostRecent.clear();
			mostRecent1.clear();
			mostRecent2.clear();
			media.clear();
			media1.clear();
			media2.clear();

            Form<Message> messageForm = formFactory.form(Message.class).bindFromRequest();

			Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        term = searchForm.field("searchTerm").value();
	        searchType = searchForm.field("searchType").value();
	        Search newSearch = new Search(term, searchType);
	        searchForm = searchForm.fill(newSearch);

	        Form<Track> trackForm = formFactory.form(Track.class).bindFromRequest();
	        String search = trackForm.field("term").value();
	        String interestTrack = trackForm.field("interest").value();

	        //get user ID cookie
	        String userID = session("id");
	        if(userID==null){
	        	userID="1";
	        	loggedInBool=0;
	        }
	        else{
            	loggedInBool=1;
        	}

	        // use ID to find user info
	        Long id = Long.parseLong(userID);
		    TwitterUser twitterUserID = TwitterUser.find.byId(id);
			String twitterUsername = twitterUserID.username;
	        String twitterProfilePic = twitterUserID.imgUrl;
	        findUserInformation(userID);

		    Twitter twitter = appLogin();
		    
		    Query query = new Query(term);
		    query.lang("en");

		    // adjust query if query type is user or hashtag
		    if(searchType.compareTo("User")==0){
		    	term = "from:"+term;
		    	query = new Query(term);
		    }
		    else if(searchType.compareTo("Hashtag")==0){
		    	term = term.replace(" ", "");
		    	term = "#"+term;
		    	query = new Query(term);
		    }

		    // find popular results for query
			try{
				query.setCount(100);
				query.setResultType(Query.POPULAR);
		    	QueryResult result = twitter.search(query);

			    for (Status status : result.getTweets()) {
			    	if(status.isRetweet()){ 
			    		status = status.getRetweetedStatus();
			    	}
			    	String tweetUserID = Long.toString(status.getId())+ "p-" + status.getUser().getScreenName();
			    	if(!allPop.contains(tweetUserID)){
			    		allPop.add(tweetUserID);
			    		popStatus.add(status);
			    	}
			    }
			}
			catch (TwitterException e){
				return ok("error");
			}

			// find recent results for query
			allRecent = new ArrayList<>();
			try{
				query.setCount(100);
				query.setResultType(Query.RECENT);
		    	QueryResult result = twitter.search(query);

			    for (Status status : result.getTweets()) {
			    	if(status.isRetweet()){ 
			    		status = status.getRetweetedStatus();
			    	}
			    	if(!allRecent.contains(status)){
			    		allRecent.add(status);
			    	}		        	
			    }

			    // split recent tweets into three lists of ~30
		        for(int i=0; i<allRecent.size(); i++){
		        	Status status = allRecent.get(i);
		        	String tweetUserID = Long.toString(status.getId())+ "-" + status.getUser().getScreenName();
		        	if(i<30){
		        		mostRecent.add(tweetUserID);
		        	}
		        	else if(i<60){
		        		mostRecent1.add(tweetUserID);
		        	}
		        	else{
		        		mostRecent2.add(tweetUserID);
		        	}
		        }
			}
			catch (TwitterException e){
				return ok("error");
			}

			ArrayList<Status> allPopAndRecent = getAllTweets();

			// get all the tweets containing photo, video or links
			for(int i=0; i<allPopAndRecent.size(); i++){	
				Status status = allPopAndRecent.get(i);
	        	String tweetUserID = Long.toString(status.getId())+ "a-" + status.getUser().getScreenName();
	        	if(status.getMediaEntities().length>0){
	        		if(!media.contains(tweetUserID)){
	        			if(i<30){
		        		media.add(tweetUserID);
			        	}
			        	else if(i<60){
			        		media1.add(tweetUserID);
			        	}
			        	else{
			        		media2.add(tweetUserID);
			        	}
	        		}
			    }
			}

			return ok(views.html.searchResults.render(searchForm, trackForm, messageForm, twitterUsername, loggedInBool, allPop, mostRecent, mostRecent1, mostRecent2, media, media1, media2, twitterProfilePic, term, personaNames, interests));
    }

    public ArrayList<Status> getAllTweets(){
    	    ArrayList<Status> allTweets = popStatus;
			for (Status status: allRecent){
				if(!allTweets.contains(status))
					allTweets.add(status);
			}
			return allTweets;
    }

    public ArrayList<String> getTweetString(ArrayList<Status> tweets, String trackedTerm){
    	ArrayList<String> tweetStrings = new ArrayList<>();
    	for(Status s: tweets){
    		// get since of tweet creation
    		Date date = s.getCreatedAt();
        	Instant instant = date.toInstant();
        	LocalDateTime ldt = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
        	DateTimeFormatter sdfr = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        	// string format: interest - tweetID - tweet author - time since creation
    		String tweetInfo = trackedTerm +"-"+s.getId() + "-" + s.getUser().getScreenName() + "-" + ldt.format(sdfr);
    		tweetStrings.add(tweetInfo);
    	}
    	return tweetStrings;
    }

    public Result trackSearch(String uri) {
			//get user ID cookie
	        String userID = session("id");
	        if(userID==null){
	        	userID="1";
	        	loggedInBool=0;
	        }
	        else{
            	loggedInBool=1;
        	}

	        // use ID to find user info
	        Long id = Long.parseLong(userID);
		    TwitterUser twitterUserID = TwitterUser.find.byId(id);
			String twitterUsername = twitterUserID.username;
	        String twitterProfilePic = twitterUserID.imgUrl;

		    Twitter twitter = appLogin(twitterUserID);

		    // track form fields
	        Form<Track> trackForm = formFactory.form(Track.class).bindFromRequest();
	        String search = trackForm.field("term").value();
	        String interestTrack = trackForm.field("interest").value();
	        String newPersona = trackForm.field("newPersonaName").value();
	        String existingPersona = trackForm.field("personaName").value();

	        Form<Message> messageForm = formFactory.form(Message.class).bindFromRequest();

			Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        term = searchForm.field("searchTerm").value();
	        searchType = searchForm.field("searchType").value();
	        Search newSearch = new Search(term, searchType);
	        searchForm = searchForm.fill(newSearch);

	        // if no interest selected create a new interest
	        if(interestTrack==null){
	        	interestTrack = trackForm.field("newInterestName").value();

	        	// if no persona selected create a new persona
	        	if(existingPersona==null){
	        		Persona newPersonaObj = new Persona(newPersona, twitterUserID);
	        		newPersonaObj.save();
	        		Interest newInterest = new Interest(interestTrack, newPersonaObj);
	        		newInterest.save();
	        		interestTrack+=" - " +newPersona;

	        	// else save new interest to selected persona
	     		}else{
	     			List<Persona> existingPersonas = Persona.find.query().where()
                                        .ilike("twitter_user", userID)
                                        .ilike("persona_name", existingPersona)
                                        .setFirstRow(0)
                                        .setMaxRows(25)
                                        .findPagedList()
                                        .getList();

                	Persona existingPersonaObj = existingPersonas.get(0);
                	Interest newInterest = new Interest(interestTrack, existingPersonaObj);
                	newInterest.save();
                	interestTrack+=" - "+existingPersona;
	     		}
	        }
	        String[] strArray = interestTrack.split(" - ");
	        interestTrack = strArray[0];
	        String personaOfInterest = strArray[1];

	        findUserInformation(userID);

	        // find persona to save tracked search
   			List<Persona> personaSaveInterest = Persona.find.query().where()
                                    .ilike("twitter_user", Long.toString(id))
                                    .ilike("persona_name", personaOfInterest)
                                    .setFirstRow(0)
                                    .setMaxRows(25)
                                    .findPagedList()
                                    .getList();

            Persona persona = personaSaveInterest.get(0);
            Long pID = persona.id;
            
            // find interest in persona to save tracked search
            List<Interest> trackedInterest = Interest.find.query().where()
                                    .ilike("persona_id", Long.toString(pID))
                                    .ilike("interest_name", interestTrack)
                                    .setFirstRow(0)
                                    .setMaxRows(25)
                                    .findPagedList()
                                    .getList();

            Interest interestID = trackedInterest.get(0);

            ArrayList<Status> allTweets = getAllTweets();

            ArrayList<String> tweetInfo = getTweetString(allTweets, search);

            Track track = new Track(search, interestID);
            track.save();

            if(tweetInfo!=null){
            	track.updateTweets(tweetInfo);
            	track.update();
            }
		    return redirect(uri);
			
    }

    public Result sendMessage(String uri) {
        	Form<Message> messageForm = formFactory.form(Message.class).bindFromRequest();
	        String recipient = messageForm.field("recipientName").value();
	        String message = messageForm.field("message").value();

	        Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        Search newSearch = new Search(term, searchType);
	        searchForm = searchForm.fill(newSearch);

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

	        Twitter twitter = appLogin(twitterUserID);

            try{
            	DirectMessage dm = twitter.sendDirectMessage(recipient, message);
            }
            catch (TwitterException e){

            	e.printStackTrace(System.out);
            	return ok("problem sending message");
            }

			    return redirect(uri);
			
    }

    public Result searchAnalytics() throws TwitterException {
    		

    		ArrayList<Status> analytics = new ArrayList<>();
    		ArrayList<Status> analyticsID = new ArrayList<>();

    		ArrayList<String> negText = new ArrayList<>();
        	ArrayList<String> neutText = new ArrayList<>();
        	ArrayList<String> posText = new ArrayList<>();

    		pos.clear();
        	neg.clear();
        	neut.clear();

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

	        Twitter twitter = appLogin(twitterUserID);

        	Query query = new Query(term);
		    query.lang("en");

    		// tweet sample from query
    		try{
		    	query.setCount(30);
		    	QueryResult result = twitter.search(query);
			    for (Status status : result.getTweets()) {
			    	if(status.isRetweet()){ 
			    		status = status.getRetweetedStatus();
			    	}
			    	if(!analytics.contains(status)){
			    		analytics.add(status);
			    	}
			    }
			}
			catch (TwitterException e){
				return ok("error");
			}
		    
			Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        String searchType = searchForm.field("searchType").value();
	        Search newSearch = new Search(term, searchType);
	        searchForm = searchForm.fill(newSearch);

	        // sentiment analysis
            NLP.init();
			for(Status tweet : analytics) {
				if(tweet.isRetweet()){ 
			    	tweet = tweet.getRetweetedStatus();
			    }
				String tweetText = tweet.getText();
				String tweetID = Long.toString(tweet.getId());
				String author= tweet.getUser().getScreenName();

				int sentiment = NLP.findSentiment(tweetText);

				if(sentiment==1 || sentiment == 0){
                    if(!negText.contains(tweetText)){
                        neg.add(tweetID+"-"+author);
                        negText.add(tweetText);
                    }
                }
                else if(sentiment==3 || sentiment==4){
                    if(!posText.contains(tweetText)){
                        pos.add(tweetID+"-"+author);
                        posText.add(tweetText);
                    }
                }
                else if(sentiment==2){
                	if(!neutText.contains(tweetText)){
                        neut.add(tweetID+"-"+author);
                        neutText.add(tweetText);
                    }
                }
            }

            //percentages for sentiment chart
	        double posSize = ((double) pos.size())/((double) analytics.size()) *100;
			double negSize = ((double) neg.size())/((double) analytics.size()) *100;
			double neutSize = ((double) neut.size())/((double) analytics.size()) *100;

			//find most popular users for force graph
			ArrayList<User> mostPopularUsers = new ArrayList<>();
			ArrayList<User> users = new ArrayList<>();
			for(Status t: analytics){
				User user = t.getUser();
				if(!users.contains(user))
					users.add(user);
			}

			mostPopularUsers = maxFollowers(users, mostPopularUsers);

			JSONObject child = new JSONObject();
			ArrayList<JSONObject> JSONlist = new ArrayList<>();

			String user = "";
			for(User popUser: mostPopularUsers){
				// get follower list
				try {
					PagableResponseList<User> followers = twitter.getFollowersList(popUser.getScreenName(),-1);
					ArrayList<User> allFollowers = new ArrayList<>();
					for(User follower: followers){
						allFollowers.add(follower);
					}
					ArrayList<User> popFollowers = new ArrayList<>();
					popFollowers = maxFollowers(allFollowers, popFollowers);
				    //create JSONlist of JSON objects
					ArrayList<JSONObject> listOfFollowers = new ArrayList<>();
					for(User popFoll: popFollowers){
						JSONObject popFollower = new JSONObject();
						popFollower.put("name", popFoll.getScreenName());
						popFollower.put("img", popFoll.getBiggerProfileImageURL());
						popFollower.put("followers", popFoll.getFollowersCount());
						popFollower.put("link", "http://twitter.com/" + popFoll.getScreenName());
						listOfFollowers.add(popFollower);
					}

					//add list to twitteruser object
					JSONObject twitteruser = new JSONObject();
					twitteruser.put("name", popUser.getScreenName());
					twitteruser.put("img", popUser.getBiggerProfileImageURL());
					twitteruser.put("followers", popUser.getFollowersCount());
					twitteruser.put("link", "http://twitter.com/" + popUser.getScreenName());
					twitteruser.put("children", listOfFollowers);
					JSONlist.add(twitteruser);	

				}
				catch (TwitterException e){
					System.out.println("Error retrieving followers.");
				}
			}

			//primary node
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("children", JSONlist);
			jsonObj.put("name", null);
			String json = jsonObj.toString();

			//wordcloud
			String wordcloudData = findFrequency(analytics);
			
			return ok(views.html.dataAnalytics.render(searchForm, twitterUsername, loggedInBool, pos, posSize, neg, negSize, neut, neutSize, twitterProfilePic, term, personaNames, interests, json, wordcloudData));
			
    }

    public ArrayList<User> maxFollowers(ArrayList<User> users, ArrayList<User> mostPopular) {
    	int max = 0;
    	User maxUsername = null;
    	for(User user: users){
    		if(user.getFollowersCount() > max){
    			max = user.getFollowersCount();
    			maxUsername = user;
    		}
    	}
    	users.remove(maxUsername);
    	mostPopular.add(maxUsername);
    	if (mostPopular.size()<5){
    		maxFollowers(users, mostPopular);
    	}
    	return mostPopular;
    }

    public Result showSentiment(String sentiment) {
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

        Twitter twitter = appLogin(twitterUserID);

		Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
        String searchType = searchForm.field("searchType").value();
        Search newSearch = new Search(term, searchType);
        searchForm = searchForm.fill(newSearch);

        Form<Message> messageForm = formFactory.form(Message.class).bindFromRequest();

		if(sentiment.compareTo("neutral") == 0){
			return ok(views.html.neutralSentiment.render(searchForm, messageForm, twitterUsername, loggedInBool, pos, neg, neut, twitterProfilePic, term, personaNames, interests));
		}
		if(sentiment.compareTo("positive") == 0){
			return ok(views.html.positiveSentiment.render(searchForm, messageForm, twitterUsername, loggedInBool, pos, neg, neut, twitterProfilePic, term, personaNames, interests));
		}
		if(sentiment.compareTo("negative") == 0){
			return ok(views.html.negativeSentiment.render(searchForm, messageForm, twitterUsername, loggedInBool, pos, neg, neut, twitterProfilePic, term, personaNames, interests));
		}
		return ok("error");	
    }

    public String findFrequency(List<Status> tweets) {
    	//parsing
    	ArrayList<String> words = new ArrayList<>();
    	ArrayList<String> singleWords = new ArrayList<>();
    	for(Status tweet: tweets) {
    		String text = tweet.getText();
    		text = text.replaceAll("[^a-zA-Z #@]","");
    		String[] arrayOfWords = text.split(" ");
    		for(String word: arrayOfWords) {
    			word = word.toLowerCase();
    			if(!stopwords.contains(word) && !word.startsWith("http")){
	    			words.add(word);
	    			if(!singleWords.contains(word)) {
	    				singleWords.add(word);
	    			}
    			}
    		}
    	}

    	//calc freq and create string to hold words + frequencies
		String JSON = "[";

		for(String word: singleWords){
			JSONObject wordsWithFrequencies = new JSONObject();
			int count=0;
			for(String otherWord: words) {
				if(word.compareTo(otherWord)==0) {
					count++;
				}
			}
			wordsWithFrequencies.put("size", count);
			wordsWithFrequencies.put("text", word);
			String wwf = wordsWithFrequencies.toString();
			JSON+= wwf + ",";	
		}
		
		JSON = JSON.substring(0,JSON.length() - 1);
		JSON+="]";
		
		return JSON;
    }
    
    public void classifier(List<Status> classify) throws ClassNotFoundException, IOException {
        pos.clear();
        neg.clear();
        neut.clear();

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
                    for(String stopword: stopwords){
                		text = text.replace(stopword, "");
                	}
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

        ArrayList<String> negText = new ArrayList<>();
        ArrayList<String> neutText = new ArrayList<>();
        ArrayList<String> posText = new ArrayList<>();
        for(int i = 0; i < CATEGORIES.length; ++i) {
            //File classDir = new File(TESTING_DIR,CATEGORIES[i]);
            for (int j=0; j<classify.size();  ++j) {
                String textTweet = classify.get(j).getText();
                String text = textTweet.toLowerCase();
                text = text.replace("^a-zA-Z ", " ");
                for(String stopword: stopwords){
                	text = text.replace(" "+stopword+" ", " ");
                }
                System.out.println(text);
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
                    if(!negText.contains(textTweet)){
                        neg.add(tweetID);
                        negText.add(textTweet);
                    }
                }
                else if(bestCategory.compareTo("pos")==0){
                    if(!posText.contains(textTweet)){
                        pos.add(tweetID);
                        posText.add(textTweet);
                    }
                }
                else if(bestCategory.compareTo("neut")==0){
                	// 

                	if(!neutText.contains(textTweet)){
                        neut.add(tweetID);
                        neutText.add(textTweet);
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
