package models;

import java.util.*;

import javax.persistence.*;

import play.data.validation.Email;
import play.data.validation.MaxSize;
import play.data.validation.MinSize;
import play.data.validation.Required;
import play.db.jpa.*;

@Entity
@Table(name = "_User")
public class User extends Model{
	String username;
	String pwd1;
	String pwd2;
	Date createDate;
	Date birthdayDate;
	Date editDate;
	
	@ManyToMany(mappedBy = "users")
    public List<Group> groups = new ArrayList<Group>();
}
