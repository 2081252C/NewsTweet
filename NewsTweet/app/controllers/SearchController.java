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


import play.*;
import play.mvc.*;
import play.data.*;

public class SearchController extends Controller {

    //private Form<Search> searchForm = Form.form(Search.class);
	@Inject FormFactory formFactory;

	public Result searchResults() {
			 ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        		configurationBuilder.setOAuthConsumerKey("AfZgXUsXP3v9F3DYIMVx2q7KH")
                .setOAuthConsumerSecret("NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD")
                .setOAuthAccessToken("1561842786-RaR4w59MNxCD9aL9n6qxygJjx90NKhYZZTdJy3n")
                .setOAuthAccessTokenSecret("tFeSn3QIssVrT8OAH42hl7RX8gYpmJX9uj2hMByLjdK8c");

			Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        String term = searchForm.field("searchTerm").value();
	        String searchType = searchForm.field("searchType").value();


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
		    	term = "#"+term;
		    	query = new Query(term);
		    }

		    List<Status> tweets = new ArrayList<Status>();
		    List<String> tID = new ArrayList<String>();
		    try{
		    	QueryResult result = twitter.search(query);
			    for (Status status : result.getTweets()) {
			        tID.add(Long.toString(status.getId()));
			    }
			}
			catch (TwitterException e){
				return ok("error");
			}

			List<String> mostPopular = new ArrayList<>();
			try{
				query.setResultType(Query.POPULAR);
		    	QueryResult result = twitter.search(query);
			    for (Status status : result.getTweets()) {
			        mostPopular.add(Long.toString(status.getId()));
			    }
			}
			catch (TwitterException e){
				return ok("error");
			}

			List<String> mostRecent = new ArrayList<>();
			try{
				query.setResultType(Query.RECENT);
		    	QueryResult result = twitter.search(query);
			    for (Status status : result.getTweets()) {
			        mostRecent.add(Long.toString(status.getId()));
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
                    interests.add(i.interestName + " " + p.personaName);
                }
            }
				String s = t.username;
			    return ok(views.html.searchResults.render(searchForm, trackForm, s, 1, tID, mostPopular, mostRecent, personaForm, t.imgUrl, interestForm, term, personaNames, interests, ""));
			}
		    else{
		        	return ok(views.html.searchResults.render(searchForm, null, "", 0, tID, mostPopular, mostRecent, personaForm, "", interestForm, term, personaNames, interests, ""));
		        }
    }
}
