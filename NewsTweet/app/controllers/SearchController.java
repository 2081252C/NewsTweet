package controllers;

import play.mvc.*;
import models.TwitterUser;
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

		    Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance();
		    //twitter.setOAuthConsumer("AfZgXUsXP3v9F3DYIMVx2q7KH", "NoIVu1Vq4ggGOnJk0zvUoaGBuIBS3AuxN607zoah5D44PNKLgD");
		    Query query = new Query(term);
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
	        //System.out.println(term);
	         String str = session("id");
	        if(str!=null){
		        Long id = Long.parseLong(str);
		        TwitterUser t = TwitterUser.find.byId(1561842786L);
				String s = t.username;
			    return ok(views.html.searchResults.render(searchForm, s, 1, tID));
			}
		    else{
		        	return ok(views.html.searchResults.render(searchForm, "", 0, tID));
		        }
    }
}
