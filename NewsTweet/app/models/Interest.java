package models;

import play.mvc.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.validation.Constraints;
import javax.persistence.*;
import io.ebean.*;
import models.TwitterUser;
import models.Persona;

@Entity
public class Interest extends Model{

	@Id
	public Long id;

	public String interestName;

	@ManyToOne()
    public Persona persona;

	public Interest(Long id, String interestName){
    	this.id = id;
    	this.interestName = interestName;

    }

    public static final Finder<Long, Persona> find = new Finder<>(Persona.class);
}