package entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	private List<User> guests;
	@OneToOne
	private Calendar calendar;
	@OneToOne
	private User host;
	private boolean personal;
	private boolean remember;
	
	public Meeting(int id, String name, Date dateStart, Date dateEnd, Site site, List<User> guests, Calendar calendar,
			User host, boolean personal, boolean remember) {
		this.name = name;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.site = site;
		this.guests = guests;
		this.calendar = calendar;
		this.host = host;
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

	public Site getSite() {
		return site;
	}

	public List<User> getGuests() {
		return guests;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public User getHost() {
		return host;
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

	public void setSite(Site site) {
		this.site = site;
	}

	public void setGuests(List<User> guests) {
		this.guests = guests;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public void setHost(User host) {
		this.host = host;
	}

	public void setPersonal(boolean personal) {
		this.personal = personal;
	}

	public void setRemember(boolean remember) {
		this.remember = remember;
	}
	
}
