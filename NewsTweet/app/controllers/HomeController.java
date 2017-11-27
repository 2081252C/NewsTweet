package controllers;

import play.mvc.*;
import models.TwitterUser;
import models.Search;
import play.data.Form;
import play.data.FormFactory;
import javax.inject.Inject;

import twitter4j.Twitter;
import twitter4j.User;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;
import twitter4j.auth.AccessToken;
import twitter4j.Twitter;
import twitter4j.User;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.Authorization;
import models.TwitterUser;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.conf.ConfigurationBuilder;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */

public class HomeController extends Controller {
	@Inject FormFactory formFactory;

    public Result index() {
    		Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        String term = searchForm.field("searchTerm").value();
	        String str = session("id");
	        if(str!=null){
		        Long id = Long.parseLong(str);
		        TwitterUser t = TwitterUser.find.byId(id);
				String s = t.username;
			    return ok(views.html.index.render(searchForm, s, 1));
			}
		    else{
		        	return ok(views.html.index.render(searchForm, "", 0));
		        }
    }
}
