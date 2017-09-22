package entities;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Meeting {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private Date dateStart;
	private Date dateEnd;
	@OneToOne
	private Site site;
	@ManyToMany
	private List<User> guests;
	@OneToOne
	private Calendar calendar;
	@OneToOne
	private User user;
	private boolean personal;
	private boolean remember;

	public Meeting(String name, Date dateStart, Date dateEnd, Site site, Calendar calendar, User user, boolean personal, boolean remember) {
		this.name = name;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.site = site;
		this.guests = new ArrayList <User> ();
		this.calendar = calendar;
		this.user = user;
		this.personal = personal;
		this.remember = remember;
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

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<User> getGuests() {
		return guests;
	}

	public void setGuests(List<User> guests) {
		this.guests = guests;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isPersonal() {
		return personal;
	}

	public void setPersonal(boolean personal) {
		this.personal = personal;
	}

	public boolean isRemember() {
		return remember;
	}

	public void setRemember(boolean remember) {
		this.remember = remember;
	}

	@Override
	public String toString() {
		return "Meeting [name=" + name + "]";
	}



}
