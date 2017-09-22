package services;

import java.util.Date;

import javax.persistence.EntityManager;

import entities.Calendar;
import entities.Meeting;
import entities.Site;
import entities.User;


public class DAOMeeting {
	
	private static DAOMeeting daoMeeting;
	
	private DAOMeeting(){
	}
	
	public static DAOMeeting getInstance() {
		if(daoMeeting == null)
			daoMeeting = new DAOMeeting();
		return daoMeeting;
	}
	
	public static void createMeeting(String name, Date dateStart, Date dateEnd, int idSite, int idCalendar, int idUser, EntityManager em) {
		em.getTransaction( ).begin( );
		User user = DAOUser.getUser(idUser, em);
		Site site = DAOSite.getSite(idSite, em);
		Calendar calendar = DAOCalendar.getCalendar(idCalendar, em);
		Meeting newMeeting = new Meeting (name, dateStart, dateEnd, site, calendar, user, false, false);
		em.persist(newMeeting);
		em.getTransaction().commit();
	}	

}
