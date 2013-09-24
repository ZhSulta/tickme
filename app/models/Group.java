package models;

import java.util.*;

import javax.persistence.*;

import play.data.validation.Email;
import play.data.validation.MaxSize;
import play.data.validation.MinSize;
import play.data.validation.Required;
import play.db.jpa.*;

@Entity
@Table(name = "Groups")
public class Group extends Model{
	String name;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<User> users = new ArrayList<User>();
    
	@OneToMany(mappedBy="group", cascade=CascadeType.ALL)
	public Set<Message> messages;
}
