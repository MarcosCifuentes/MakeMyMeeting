package services;

import java.util.Date;

import javax.persistence.*;

public class MyApp {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("makemymeeting");
		EntityManager em = emf.createEntityManager();
		
		DAOSite.createSite("Sala nro 1", "san martin 154", em);
		DAOSite.createSite("Sala nro 2", "pinto 959", em);

		
		DAOUser.createUser(em, "Marcelo", "Rodriguez","marcelo@gmail.com" );
		DAOUser.createUser(em,"Mateo", "Darin", "mateo@gmail.com");
		DAOUser.createUser(em,"Lionel", "Messi", "lionel@gmail.com");
		
		DAOCalendar.createCalendar("Escolar", 1, em);
		
		DAOMeeting.createMeeting("Peña",new Date(100, 12, 25, 10, 00, 00), new Date(100, 12, 25, 12, 00, 00), 1, 1, 1, em);//si
		DAOMeeting.createMeeting("Morfi",new Date(100, 12, 25, 11, 00, 00), new Date(100, 12, 25, 15, 00, 00), 2,2,2, em);//no xq se superpone
		
//		List<Meeting> reuniones = new ArrayList<Meeting>();
//		reuniones = DAOMeeting.getMettingByUserAndDay(4, new Date(100, 12, 25, 10, 00, 00), em);
//		
//		System.out.println(reuniones.toString());
		
		em.close();
		emf.close();
	}
}
