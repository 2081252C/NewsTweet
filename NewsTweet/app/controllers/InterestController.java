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

public class InterestController extends Controller {

    //private Form<Search> searchForm = Form.form(Search.class);
	@Inject FormFactory formFactory;

	public Result addInterest() {
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
	                                        .ilike("persona", Long.toString(p.id))
	                                        .setFirstRow(0)
	                                        .setMaxRows(25)
	                                        .findPagedList()
	                                        .getList();
	                for(Interest i: interestsFromDB){
	                    interests.add(i.interestName + " - " + p.personaName);
	                }
	            }

	   			List<Persona> personaSaveInterest = Persona.find.query().where()
                                        .ilike("twitter_user", Long.toString(id))
                                        .ilike("persona_name", personaName)
                                        .setFirstRow(0)
                                        .setMaxRows(25)
                                        .findPagedList()
                                        .getList();

                Persona pID = personaSaveInterest.get(0);
                
                Interest i = new Interest(interestName, pID);
		        i.save();

				String s = t.username;
			    return redirect("/");
			}
		    else{
		        	return ok(views.html.index.render(searchForm, "", 0, personaForm, "", interestForm, personaNames, interests, ""));
		        }
    }

    public Result showInterest(String tt) {
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
	        HashMap<String, List<String>> interestMap = new HashMap<String, List<String>>();
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
	                                        .ilike("persona", Long.toString(p.id))
	                                        .setFirstRow(0)
	                                        .setMaxRows(25)
	                                        .findPagedList()
	                                        .getList();
	                for(Interest i: interestsFromDB){
	                    interests.add(i.interestName + " - " + p.personaName);
	                    List<Track> tracksFromDB = Track.find.query().where()
	                    					.ilike("interest", Long.toString(i.id))
	                                        .setFirstRow(0)
	                                        .setMaxRows(25)
	                                        .findPagedList()
	                                        .getList();

	                    List<String> tracks = new ArrayList<>();                  
	                    for(Track track: tracksFromDB){
	                    	tracks.add(track.trackedTerm);
	                    	trackedTerms.add(track.trackedTerm + " " + i.interestName);
	                    }

	                    interestTerms.add(tracks);
	                    interestMap.put(i.interestName, tracks);
	                    
	                }
	            }

				String s = t.username;

				List<String> values = interestMap.get(tt);

				//get list of associated search terms
				List<String> trackTweets = new ArrayList<>();
				List<String> allTweets = new ArrayList<>();
				List<String> text = new ArrayList<>();
				for(String v: values){
				    Query query = new Query(v);
				    query.lang("en");
					List<Status> tweets = new ArrayList<Status>();
				    
				    try{
				    	QueryResult result = twitter.search(query);
					    for (Status status : result.getTweets()) {
					    	if(!trackTweets.contains(v + "%" + Long.toString(status.getId())) && !text.contains(status.getText())){
					    		trackTweets.add(v + "%" + Long.toString(status.getId()));
					    		text.add(status.getText());
					    	}
					    }
					}
					catch (TwitterException e){
						return ok("error");
					}
	        	}

	        	text.clear();

				for(String v: values){
				    Query query = new Query(v);
				    query.lang("en");
					List<Status> tweets = new ArrayList<Status>();
				    
				    try{
				    	QueryResult result = twitter.search(query);
					    for (Status status : result.getTweets()) {
					        if(!allTweets.contains(Long.toString(status.getId())) && !text.contains(status.getText())){
					        	allTweets.add(Long.toString(status.getId()));
					        	text.add(status.getText());
					        }
					    }
					}
					catch (TwitterException e){
						return ok("error");
					}
	        	}

			    return ok(views.html.interest.render(searchForm, s, 1, personaForm, t.imgUrl, interestForm, personaNames, interests, trackTweets, tt, trackedTerms, allTweets, values));
			}
		    else{
		        	return ok(views.html.index.render(searchForm, "", 0, personaForm, "", interestForm, personaNames, interests, ""));
		        }
    }

}
