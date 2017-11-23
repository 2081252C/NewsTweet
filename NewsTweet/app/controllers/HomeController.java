package controllers;

import play.mvc.*;
import models.TwitterUser;
import models.Search;
import play.data.Form;
import play.data.FormFactory;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */

public class HomeController extends Controller {
	@Inject FormFactory formFactory;

    public Result index() {
    		Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        String term = searchForm.field("searchTerm").value();
	        System.out.println(term);
            return ok(views.html.index.render(searchForm));
    }
}
