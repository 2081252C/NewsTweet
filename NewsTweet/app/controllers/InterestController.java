package controllers;

import models.*;
import javax.inject.Inject;
import views.html.main;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.Date;

import twitter4j.Twitter;
import twitter4j.User;
import twitter4j.Status;
import twitter4j.TwitterFactory;
import twitter4j.QueryResult;
import twitter4j.Query;
import twitter4j.TwitterException;
import twitter4j.conf.ConfigurationBuilder;

import play.*;
import play.mvc.*;
import play.data.*;

import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Month;
import java.time.Instant;
import java.time.Period;
import java.time.ZoneOffset;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterestController extends Controller {

    //private Form<Search> searchForm = Form.form(Search.class);
	@Inject FormFactory formFactory;

	public Interest interestTrack;
	int loggedInBool=1;

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

    public Result showInterest(String persona, String tt) {
    		String interestPersona = tt+ " (" + persona + ")";
    		Form<Message> messageForm = formFactory.form(Message.class).bindFromRequest();

	        Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        String term = searchForm.field("searchTerm").value();

	        //get user ID cookie
	        String userID = session("id");
	        if(userID==null){
	        	userID="1";
	        	loggedInBool=0;
	        }

	        // use ID to find user info
	        Long id = Long.parseLong(userID);
		    TwitterUser twitterUserID = TwitterUser.find.byId(id);
			String twitterUsername = twitterUserID.username;
	        String twitterProfilePic = twitterUserID.imgUrl;

	        Twitter twitter = appLogin(twitterUserID);

	        List<String> personaNames = new ArrayList<>();
	        List<String> interests = new ArrayList<>();
	        List<String> trackedTerms = new ArrayList<>();
	        List<List<String>> interestTerms = new ArrayList<>();
	        List<Track> tracksFromDB = new ArrayList<>();
	        HashMap<String, List<String>> interestMap = new HashMap<String, List<String>>();

	        // find all of user's interests and tracked searches
	        List<Persona> personas = Persona.find.query().where()
                                    .ilike("twitter_user", userID)
                                    .setFirstRow(0)
                                    .setMaxRows(25)
                                    .findPagedList()
                                    .getList();
            
            for(Persona p: personas){
                personaNames.add(p.personaName);
                List<Interest> interestsFromDB = Interest.find.query().where()
                                        .ilike("persona", Long.toString(p.id))
                                        .setFirstRow(0)
                                        .setMaxRows(25)
                                        .findPagedList()
                                        .getList();
                for(Interest i: interestsFromDB){
                    interests.add(i.interestName + " - " + p.personaName);
                    tracksFromDB = Track.find.query().where()
                    					.ilike("interest", Long.toString(i.id))
                                        .setFirstRow(0)
                                        .setMaxRows(25)
                                        .findPagedList()
                                        .getList();

                    List<String> tracks = new ArrayList<>();                  
                    for(Track track: tracksFromDB){
                    	tracks.add(Long.toString(track.id));
                    	trackedTerms.add(track.trackedTerm + "-" + i.interestName + " (" + p.personaName +")");
                    }

                    interestTrack = i;
                    interestTerms.add(tracks);
                    String key = i.interestName + "-" + p.personaName;
                    interestMap.put(key, tracks);
                }
            }

            //get list of associated search terms
			List<String> values = interestMap.get(tt+"-"+persona);

			// tweets for tracked searches
			ArrayList<String> trackTweets = new ArrayList<>();

			// all tweets in one list
			List<String> allTweets = new ArrayList<>();

			//tweet text to check for duplicates
			List<String> text = new ArrayList<>();

			for(String v: values){
				// create new search with tracked term
				Track tracked = Track.find.byId(Long.parseLong(v));
			    Query query = new Query(tracked.trackedTerm);
			    query.lang("en");
			    query.setCount(20);
				ArrayList<String> tweets = new ArrayList<>();
			    
			    try{
			    	QueryResult result = twitter.search(query);
				    for (Status status : result.getTweets()) {
				    	if(status.isRetweet()){ 
				    		status = status.getRetweetedStatus();
				    	}
				        if(!allTweets.contains(Long.toString(status.getId())) && !text.contains(status.getText())){
				        	text.add(status.getText());

				        	// find time since tweet creation
				        	Date date = status.getCreatedAt();
				        	Instant instant = date.toInstant();
				        	LocalDateTime ldt = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
				        	DateTimeFormatter sdfr = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

				        	//tweets to be displayed in format: interest - tweet ID - tweet author - time since creation
				        	tweets.add(tracked.trackedTerm + "-" + Long.toString(status.getId())+ "-" + status.getUser().getScreenName() + "-" + ldt.format(sdfr));
				            allTweets.add(Long.toString(status.getId())+ "-" + status.getUser().getScreenName() + "-" + ldt.format(sdfr)); 
				        }
				    }
				    // add tweets to database
				    tracked.updateTweets(tweets);
				    tracked.update();

				}
				catch (TwitterException e){
					return ok("error");
				}
        	}


	        text.clear();

	        // list of tracked terms to serve as tabs
	        ArrayList<String> headers = new ArrayList<>();
			
			for(String v: values){
				Track track = Track.find.byId(Long.parseLong(v));
				headers.add(track.trackedTerm);
			    String[] tweetInfo = track.tweetsAsString.split(", ");

	        	LocalDateTime currentTime = LocalDateTime.now();

	        	for(String tweet: tweetInfo){
	        		String[] info = tweet.split("-");

	        		//find time since creation
	        		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
					LocalDateTime dateTime = LocalDateTime.parse(info[3], formatter);
					int days = (int) dateTime.until(currentTime, ChronoUnit.DAYS);

					//rejoin tweet
 					String parsedTweet = info[0] + "-" + info[1] + "-" + info[2] + "-";

 					if(days==0){
 						parsedTweet+="today";
 					}
 					else if(days<7){
 						parsedTweet+="week";
 					}
 					else if(days<28){
 						parsedTweet+="month";
 					}
 					else{
 						parsedTweet+="older";
 					}

 					//list of tweets in form interest - tweet ID - tweet author - time since creation
 					trackTweets.add(parsedTweet);
 					
	        	}
	        }

	        interestPersona = tt+ " (" + persona + ")";

        	return ok(views.html.interest.render(searchForm, twitterUsername, loggedInBool, twitterProfilePic, personaNames, interests, trackTweets, interestPersona, trackedTerms, allTweets, headers, messageForm));
    }

}
