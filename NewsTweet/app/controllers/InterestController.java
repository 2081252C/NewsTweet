package controllers;

import play.mvc.*;
import models.Persona;
import models.TwitterUser;
import play.data.Form;
import play.data.FormFactory;
import models.*;
import javax.inject.Inject;
import views.html.main;
import play.data.Form.*;

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
	int bool=1;

	// public Result addInterest() {
	// 		Form<Interest> interestForm = formFactory.form(Interest.class).bindFromRequest();
	//         String interestName = interestForm.field("interestName").value();
	//         String personaName = interestForm.field("personaName").value();

	//         Form<Persona> personaForm = formFactory.form(Persona.class).bindFromRequest();
 //        	String name = personaForm.field("personaName").value();

	//         Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	//         String term = searchForm.field("searchTerm").value();

	//         String str = session("id");
	//         List<String> personaNames = new ArrayList<>();
	//             List<String> interests = new ArrayList<>();

	//         if(str==null){
	//         	str="1";
	//         	bool=0;
	//         }
	// 	        Long id = Long.parseLong(str);
	// 	        TwitterUser t = TwitterUser.find.byId(id);
	// 	        List<Persona> personas = Persona.find.query().where()
 //                                        .ilike("twitter_user", Long.toString(id))
 //                                        .setFirstRow(0)
 //                                        .setMaxRows(25)
 //                                        .findPagedList()
 //                                        .getList();
	            
	//             for(Persona p: personas){
	//                 personaNames.add(p.personaName);
	//                 List<Interest> interestsFromDB = Interest.find.query().where()
	//                                         .ilike("persona", Long.toString(p.id))
	//                                         .setFirstRow(0)
	//                                         .setMaxRows(25)
	//                                         .findPagedList()
	//                                         .getList();
	//                 for(Interest i: interestsFromDB){
	//                     interests.add(i.interestName + " - " + p.personaName);
	//                 }
	//             }

	//    			List<Persona> personaSaveInterest = Persona.find.query().where()
 //                                        .ilike("twitter_user", Long.toString(id))
 //                                        .ilike("persona_name", personaName)
 //                                        .setFirstRow(0)
 //                                        .setMaxRows(25)
 //                                        .findPagedList()
 //                                        .getList();

 //                Persona pID = personaSaveInterest.get(0);
                
 //                Interest i = new Interest(interestName, pID);
	// 	        i.save();

	// 			String s = t.username;
	// 		    return ok(views.html.index.render(searchForm, s, bool, personaForm, t.imgUrl, interestForm, personaNames, interests, ""));
 //    }

    public Result showInterest(String persona, String tt) {
    		String interestPersona = tt+ " (" + persona + ")";
    		LoadingFrame frame = new LoadingFrame();
		    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		    frame.setSize(200, 100);
		    frame.setLocationRelativeTo(null);
		    frame.setUndecorated(true);
		    frame.startLoading();
		    frame.setVisible(true);
    		Form<Message> messageForm = formFactory.form(Message.class).bindFromRequest();

    		ConfigurationBuilder cb = new ConfigurationBuilder();
        		cb.setOAuthConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH")
                .setOAuthConsumerSecret("NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD")
                .setOAuthAccessToken("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n")
                .setOAuthAccessTokenSecret("tFeSn3QIssVrT8OAH42hl7RX8gYpmJX9uj2hMByLjdK8c");

             Twitter twitter = new TwitterFactory(cb.build()).getInstance();

			Form<Interest> interestForm = formFactory.form(Interest.class).bindFromRequest();
	        String interestName = interestForm.field("interestName").value();
	        String personaName = interestForm.field("personaName").value();

	        Form<Persona> personaForm = formFactory.form(Persona.class).bindFromRequest();
        	String name = personaForm.field("personaName").value();

	        Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        String term = searchForm.field("searchTerm").value();

	        String str = session("id");
	        List<String> personaNames = new ArrayList<>();
	        List<String> interests = new ArrayList<>();
	        List<String> trackedTerms = new ArrayList<>();
	        List<List<String>> interestTerms = new ArrayList<>();
	        List<Track> tracksFromDB = new ArrayList<>();
	        HashMap<String, List<String>> interestMap = new HashMap<String, List<String>>();
	        if(str==null){
	        	str="1";
	        	bool=0;
	        }
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
	                    System.out.println(interestMap);
	                    
	                }
	            }

				String s = t.username;

				List<String> values = interestMap.get(tt+"-"+persona);

				//get list of associated search terms
				ArrayList<String> trackTweets = new ArrayList<>();
				List<String> allTweets = new ArrayList<>();
				List<String> text = new ArrayList<>();

				for(String v: values){
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
					        	Date date = status.getCreatedAt();
					        	Instant instant = date.toInstant();
					        	LocalDateTime ldt = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
					        	DateTimeFormatter sdfr = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
					        	tweets.add(tracked.trackedTerm + "-" + Long.toString(status.getId())+ "-" + status.getUser().getScreenName() + "-" + ldt.format(sdfr));
					            allTweets.add(Long.toString(status.getId())+ "-" + status.getUser().getScreenName() + "-" + ldt.format(sdfr)); 
					        	System.out.println(status.getCreatedAt());
					        }
					    }
					    tracked.updateTweets(tweets);
					    tracked.update();

					}
					catch (TwitterException e){
						return ok("error");
					}
	        	}


		        text.clear();

		        ArrayList<String> headers = new ArrayList<>();
				
				for(String v: values){
					Track track = Track.find.byId(Long.parseLong(v));
					headers.add(track.trackedTerm);
				    String[] tweetInfo = track.tweetsAsString.split(", ");

		        	LocalDateTime currentTime = LocalDateTime.now();

		        	for(String tweet: tweetInfo){
		        		String[] info = tweet.split("-");
		        		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
						LocalDateTime dateTime = LocalDateTime.parse(info[3], formatter);
						int days = (int) dateTime.until(currentTime, ChronoUnit.DAYS);
	 					//int days = (int) intervalPeriod.getDays();
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
	 					trackTweets.add(parsedTweet);
	 					
		        	}
		        }
		        frame.setVisible(false);

		        interestPersona = tt+ " (" + persona + ")";

	        	 return ok(views.html.interest.render(searchForm, s, bool, personaForm, t.imgUrl, interestForm, personaNames, interests, trackTweets, interestPersona, trackedTerms, allTweets, headers, messageForm));
    }

}
