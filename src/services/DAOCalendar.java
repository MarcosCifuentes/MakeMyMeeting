package services;

import javax.persistence.EntityManager;

import entities.Calendar;

public class DAOCalendar {
	
	private static DAOCalendar daoCalendar;
	
	private DAOCalendar(){
	}
	
	public static DAOCalendar getInstance() {
		if(daoCalendar == null)
			daoCalendar = new DAOCalendar();
		return daoCalendar;
	}
	
	public static void createCalendar(String name, int idUser, EntityManager em) {
		em.getTransaction( ).begin( );
		Calendar newCalendar = new Calendar (name, idUser);
		em.persist(newCalendar);
		em.getTransaction().commit();
	}
}
