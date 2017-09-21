package services;

import javax.persistence.EntityManager;

import entities.Site;

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
}
