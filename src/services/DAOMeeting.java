package services;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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
		Meeting newMeeting = new Meeting (name, dateStart, dateEnd, site, calendar, user, 0, 0);
		em.persist(newMeeting);
		em.getTransaction().commit();
	}	

	public static void getMeetingData(EntityManager em) {
		String jpql = "SELECT m FROM Meeting m"; 
		Query query = em.createQuery(jpql); 
		List<Meeting> resultados = query.getResultList();
		
		for(Meeting  m : resultados) { 
            System.out.println(m.toString()); 
        } 		
	}
	
	public static void getOverlapMeetings(int idUser, int idMeeting, EntityManager em) {
		String jpql = "SELECT m FROM Meeting m JOIN Meeting m2 ON (m2.id = ?1)"
					+ "WHERE (m.user.id = ?2"
					+ " AND m.dateStart <= m2.dateStart"
					+ " AND m2.dateStart <= m.dateEnd"
					+ " OR m.dateStart <= m2.dateEnd"
					+ " AND m2.dateStart <= m.dateStart)"
					+ " AND m.id != ?1"; 
		Query query = em.createQuery(jpql); 
		query.setParameter(1, idMeeting);
		query.setParameter(2, idUser);
		List<Meeting> resultados = query.getResultList(); 
		for(Meeting  m : resultados) { 
			System.out.println(m.toStringName()); 
		}
	}
}
