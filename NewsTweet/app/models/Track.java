package models;

import play.mvc.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.validation.Constraints;
import javax.persistence.*;
import io.ebean.*;
import models.*;
import java.util.ArrayList;

@Entity
public class Track extends Model{

	@Id
	public Long id;

	public String trackedTerm;

    public String tweetsAsString="";

	@ManyToOne()
    public Interest interest;

	public Track(String trackedTerm){
    	this.id = id;
    	this.trackedTerm = trackedTerm;
    }

    public Track(String trackedTerm, Interest interest){
        this.id = id;
        this.trackedTerm = trackedTerm;
        this.interest = interest;

    }

    public void updateTweets(ArrayList<String> newTweets){
        for(String tweet: newTweets){
            if(!tweetsAsString.contains(tweet)){
                tweetsAsString += tweet+", ";
            }
        }
    }

    public static final Finder<Long, Track> find = new Finder<>(Track.class);
}