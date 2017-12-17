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

public class TrackController extends Controller {

    //private Form<Search> searchForm = Form.form(Search.class);
	@Inject FormFactory formFactory;

	public Result trackSearch() {
			Form<Interest> interestForm = formFactory.form(Interest.class).bindFromRequest();
	        String interestName = interestForm.field("interestName").value();
	        String personaName = interestForm.field("personaName").value();

	        Form<Persona> personaForm = formFactory.form(Persona.class).bindFromRequest();
        	String name = personaForm.field("personaName").value();

	        Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest();
	        String term = searchForm.field("searchTerm").value();

	        Form<Track> trackForm = formFactory.form(Track.class).bindFromRequest();
	        String search = trackForm.field("term").value();
	        String interestTrack = trackForm.field("interest").value();
	        String[] strArray = interestTrack.split(" ");
	        interestTrack = strArray[0];
	        String personaOfInterest = strArray[1];

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
	                    interests.add(i.interestName + " " + p.personaName);
	                }
	            }

	   			List<Persona> personaSaveInterest = Persona.find.query().where()
                                        .ilike("twitter_user", Long.toString(id))
                                        .ilike("persona_name", personaOfInterest)
                                        .setFirstRow(0)
                                        .setMaxRows(25)
                                        .findPagedList()
                                        .getList();

                Persona persona = personaSaveInterest.get(0);
                Long pID = persona.id;
                
                List<Interest> trackedInterest = Interest.find.query().where()
                                        .ilike("persona_id", Long.toString(pID))
                                        .ilike("interest_name", interestTrack)
                                        .setFirstRow(0)
                                        .setMaxRows(25)
                                        .findPagedList()
                                        .getList();

                Interest interestID = trackedInterest.get(0);

                Track track = new Track(search, interestID);
                track.save();

				String s = t.username;
			    return redirect("/");
			}
		    else{
		        	return ok(views.html.index.render(searchForm, "", 0, personaForm, "", interestForm, personaNames, interests));
		        }
    }
}
