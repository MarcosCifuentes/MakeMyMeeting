package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String lastname;
	private String email;
	private List<Meeting> invitations;

	public User(String name, String lastname, String email) {
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.setInvitations(new ArrayList<Meeting>());
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

	public void setName(String nombre) {
		this.name = nombre;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String apellido) {
		this.lastname = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Meeting> getInvitations() {
		return invitations;
	}

	public void setInvitations(List<Meeting> invitaciones) {
		this.invitations = invitaciones;
	}
}
