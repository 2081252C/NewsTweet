package models;

import play.mvc.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.validation.Constraints;
import javax.persistence.*;
import io.ebean.*;
import models.TwitterUser;
import models.Interest;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Persona extends Model{

	@Id
	public Long id;

	public String personaName;
	
	@ManyToOne()
    public TwitterUser twitter_user;

    @OneToMany(mappedBy = "persona")
    public List<Interest> interests = new ArrayList<>();

	public Persona(String personaName, TwitterUser twitter_user){
    	this.personaName = personaName;
    	this.twitter_user = twitter_user;
    }

    public static final Finder<Long, Persona> find = new Finder<>(Persona.class);
}