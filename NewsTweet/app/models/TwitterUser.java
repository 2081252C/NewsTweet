package models;

import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import java.util.List;
import java.util.ArrayList;

@Entity
public class TwitterUser extends Model {

    @Id
	public Long id;

    public String username;
    public String imgUrl;
    public String accessToken;
    public String accessTokenSecret;

    @OneToMany(mappedBy = "twitter_user")
    public List<Persona> personas = new ArrayList<>();


    public TwitterUser(Long id, String username, String imgUrl, String accessToken, String accessTokenSecret){
    	this.id = id;
    	this.username = username;
        this.imgUrl = imgUrl;
    	this.accessToken = accessToken;
        this.accessTokenSecret = accessTokenSecret;

    }

    public void setImg(String imgUrl){
        this.imgUrl = imgUrl;
    }

    public void setUsername(String username){
        this.username = username;
    }


    public static final Finder<Long, TwitterUser> find = new Finder<>(TwitterUser.class);
}