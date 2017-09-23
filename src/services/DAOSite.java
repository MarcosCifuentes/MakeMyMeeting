package services;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Site;
import entities.User;

public class DAOSite {
	
	private static DAOSite daoSite;
	
	private DAOSite(){
	}
	
	public static DAOSite getInstance() {
		if(daoSite == null)
			daoSite = new DAOSite();
		return daoSite;
	}
	
	public static void createSite(String name, String address, EntityManager em) {
		em.getTransaction( ).begin( );
		Site newSite = new Site (name, address);
		em.persist(newSite);
		em.getTransaction().commit();
	}
	
	public static Site getSite(int idSite, EntityManager em) {
		String jpql = "SELECT s FROM Site s WHERE s.id = ?1"; 
		Query query = em.createQuery(jpql); 
		query.setParameter(1, idSite);
		return (Site) query.getSingleResult();
		 
	}
}
