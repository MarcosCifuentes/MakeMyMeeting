package services;

import java.util.Date;

import javax.persistence.EntityManager;

import entities.Meeting;


public class DAOMeeting {
	
	private static DAOMeeting daoMeeting;
	
	private DAOMeeting(){
	}
	
	public static DAOMeeting getInstance() {
		if(daoMeeting == null)
			daoMeeting = new DAOMeeting();
		return daoMeeting;
	}
	
	public static void createMeeting(String name, Date dateStart, Date dateEnd, int idSite, int idCalendar, int idHost, EntityManager em) {
		em.getTransaction( ).begin( );
		Meeting newMeeting = new Meeting (name, dateStart, dateEnd, idSite, idCalendar, idHost, false, false);
		em.persist(newMeeting);
		em.getTransaction().commit();
	}	

}
