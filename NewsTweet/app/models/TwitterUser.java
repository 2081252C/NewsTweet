package models;

import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class TwitterUser extends Model {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;

    public String username;
    public String accessToken;

    public TwitterUser(Long id, String username, String accessToken){
    	this.id = id;
    	this.username = username;
    	this.accessToken = accessToken;

    }

    public static final Finder<Long, TwitterUser> find = new Finder<>(TwitterUser.class);
}