package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Calendar")
public class Calendar {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToOne
	private int idUser;
	
	public Calendar(String name, int idUser) {
		this.name = name;
		this.idUser = idUser;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUser() {
		return idUser;
	}

	public void setUser(int idUser) {
		this.idUser = idUser;
	}




}
