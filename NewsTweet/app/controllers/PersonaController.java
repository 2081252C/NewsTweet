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

import play.*;
import play.mvc.*;
import play.data.*;

public class PersonaController extends Controller {

    //private Form<Search> searchForm = Form.form(Search.class);
	@Inject FormFactory formFactory;

	public Result addPersona() {
			Form<Persona> personaForm = formFactory.form(Persona.class).bindFromRequest();
	        String name = personaForm.field("personaName").value();
	        //List interests = personaForm.field("interests").value();

	        Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        String term = searchForm.field("searchTerm").value();

	        Form<Interest> interestForm = formFactory.form(Interest.class).bindFromRequest();
	        String interestName = interestForm.field("interestName").value();

	        String str = session("id");
	        if(str!=null){
		        Long id = Long.parseLong(str);
		        TwitterUser t = TwitterUser.find.byId(id);
		        Persona p = new Persona(name, t);
		        p.save();
				String s = t.username;
				List<Persona> personas = Persona.find.query().where()
                                        .ilike("twitter_user", Long.toString(id))
                                        .setFirstRow(0)
                                        .setMaxRows(25)
                                        .findPagedList()
                                        .getList();
            List<String> personaNames = new ArrayList<>();
            List<Long> personaID = new ArrayList<>();
            for(Persona persona: personas){
                personaNames.add(persona.personaName);
                personaID.add(persona.id);
            }
			    return ok(views.html.index.render(searchForm, s, 1, personaForm, t.imgUrl, interestForm, personaNames, personaID));
			}
		    else{
		        	return ok(views.html.index.render(searchForm, "", 0, personaForm, "", interestForm, null, null));
		        }
    }
}
