package services;

import javax.persistence.EntityManager;

import entities.Calendar;
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
	
	private void createUser(EntityManager em, String name, String lastName, String email) {
		em.getTransaction( ).begin( );	
		User newUser = new User(name,lastName,email);
		em.persist(newUser);
		em.getTransaction().commit();
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
