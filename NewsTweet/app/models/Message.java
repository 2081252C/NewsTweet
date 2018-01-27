package models;

import play.mvc.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.validation.Constraints;

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

public class Message extends Model{

	public String recipientName;

	public String message;

	public Message() {
    }

	public Message(String recipientName, String message){
		this.recipientName = recipientName;
		this.message = message;
	}
}