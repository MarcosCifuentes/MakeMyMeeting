package services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import entities.*;
import services.*;

public class MyApp {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Meetings");
		EntityManager em = emf.createEntityManager();
		
		DAOSite.createSite("Sala nro 1", "san martin 154", em);
		DAOSite.createSite("Sala nro 2", "pinto 959", em);

		
		DAOUser.createUser("Marcelo", "Rodriguez", em);
		DAOUser.createUser("Mateo", "Darin", em);
		DAOUser.createUser("Lionel", "Messi", em);
		
		DAOCalendar.createCalendar("Escolar", 4, em);
		
		DAOMeeting.createMeeting(new Date(100, 12, 25, 10, 00, 00), new Date(100, 12, 25, 12, 00, 00), 1, 5, em);//si
		DAOMeeting.createMeeting(new Date(100, 12, 25, 11, 00, 00), new Date(100, 12, 25, 15, 00, 00), 1, 10, em);//no xq se superpone
		
		List<Meeting> reuniones = new ArrayList<Meeting>();
		reuniones = DAOMeeting.getMettingByUserAndDay(4, new Date(100, 12, 25, 10, 00, 00), em);
		
		System.out.println(reuniones.toString());
		
		em.close();
		emf.close();
	}
}
