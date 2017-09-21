package services;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Meeting;
import entities.User;

public class DAOUser {

	private static DAOUser daoUser;

	private DAOUser(){
	}

	public static DAOUser getInstance() {
		if(daoUser == null)
			daoUser = new DAOUser();
		return daoUser;
	}

	public static void createUser(EntityManager em, String name, String lastName, String email) {
		em.getTransaction( ).begin( );	
		User newUser = new User(name,lastName,email);
		em.persist(newUser);
		em.getTransaction().commit();
	}

	public static void getUser(int idUser, EntityManager em) {
		em.getTransaction( ).begin( );
		String jpql = "SELECT u FROM User u"; 
		Query query = em.createQuery(jpql); 
		User u = (User) query.getSingleResult();
		u.toString();
		em.getTransaction().commit();
	}

	public static void getMeetingsByUserAndDay(int idUser, Date fecha, EntityManager em) {
		em.getTransaction( ).begin( );
		int day =fecha.getDay();
		int month =fecha.getMonth();
		int year =fecha.getYear();
		String jpql = "SELECT * FROM Meeting m where (m.idUser = ?1) and extract(day from m.dateStart) = ?2"
				+ " and extract(month from m.dateStart) = ?3"
				+ " and extract(year from m.dateStart) = ?4"; 
		Query query = em.createQuery(jpql);
		query.setParameter(1, idUser);
		query.setParameter(2, day);
		query.setParameter(3, month);
		query.setParameter(4, year);
		List<Meeting> resultados = query.getResultList(); 
		for(Meeting  m : resultados) { 
			System.out.println(m.toString()); 
			em.getTransaction().commit();
		}
	}
	
	public static void getMeetingsByUserBetweenDates(int idUser, Date fecha1, Date fecha2, EntityManager em) {
		em.getTransaction( ).begin( );
		
		String jpql = "SELECT * FROM Meeting m where (m.idUser = ?1) and m.dateStart BETWEEN ?2 AND ?3"; 
		Query query = em.createQuery(jpql);
		query.setParameter(1, idUser);
		query.setParameter(2, fecha1);
		query.setParameter(3, fecha2);
		List<Meeting> resultados = query.getResultList(); 
		for(Meeting  m : resultados) { 
			System.out.println(m.toString()); 
			em.getTransaction().commit();
		}
	}

	//	private boolean disponibilidadUsuario(Date fechaInicio, Date fechaFin) {
	//	 boolean disponible= false;
	//		
	//		String jpql = "SELECT a FROM Alumno a"; 
	//        Query query = entityManager.createQuery(jpql);
	//        	if (query==null) {
	//        	disponible=true;}
	//		entityManager.close();
	//		
	//		return disponible;
	//		
	//	}
}
