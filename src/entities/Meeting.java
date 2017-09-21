package entities;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Meeting")
public class Meeting {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private Date dateStart;
	private Date dateEnd;
	@OneToOne
	private int idSite;
	private List<User> guests;
	@OneToOne
	private int idCalendar;
	@OneToOne
	private int idUser;
	private boolean personal;
	private boolean remember;
	
	public Meeting(String name, Date dateStart, Date dateEnd, int idSite, int idCalendar, int idUser, boolean personal, boolean remember) {
		this.name = name;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.idSite = idSite;
		this.guests = new ArrayList <User> ();
		this.idCalendar = idCalendar;
		this.idUser = idUser;
		this.personal = personal;
		this.remember = remember;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public int getSite() {
		return idSite;
	}

	public List<User> getGuests() {
		return guests;
	}

	public int getCalendar() {
		return idCalendar;
	}

	public int getUser() {
		return idUser;
	}

	public boolean isPersonal() {
		return personal;
	}

	public boolean isRemember() {
		return remember;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public void setSite(int idSite) {
		this.idSite = idSite;
	}

	public void setGuests(List<User> guests) {
		this.guests = guests;
	}

	public void setCalendar(int idCalendar) {
		this.idCalendar = idCalendar;
	}

	public void setHost(int idUser) {
		this.idUser = idUser;
	}

	public void setPersonal(boolean personal) {
		this.personal = personal;
	}

	public void setRemember(boolean remember) {
		this.remember = remember;
	}

	@Override
	public String toString() {
		return "Meeting [name=" + name + "]";
	}
	
	
	
}
