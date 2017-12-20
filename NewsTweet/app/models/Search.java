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

public class Search extends Model{

	public String searchTerm;

	public Search() {
    }

	public Search(String searchTerm){
		this.searchTerm = searchTerm;
	}
}