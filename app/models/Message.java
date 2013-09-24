package models;

import java.util.*;

import javax.persistence.*;

import play.data.validation.Email;
import play.data.validation.MaxSize;
import play.data.validation.MinSize;
import play.data.validation.Required;
import play.db.jpa.*;

@Entity
@Table(name = "_Message")
public class Message extends Model{
	String username;
	Date createDate;
	Date reminddate;
	
	@ManyToOne
	public Group group;
	
	@OneToMany(mappedBy="message", cascade=CascadeType.ALL)
	public Set<MessageProcess> messageProcesses;
}
