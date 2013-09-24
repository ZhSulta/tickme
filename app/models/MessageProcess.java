package models;

import java.util.*;

import javax.persistence.*;

import play.data.validation.Email;
import play.data.validation.MaxSize;
import play.data.validation.MinSize;
import play.data.validation.Required;
import play.db.jpa.*;

@Entity
@Table(name = "_MessageProcess")
public class MessageProcess extends Model{
	boolean delivered;
	
	@ManyToOne
	public Message message;
}
