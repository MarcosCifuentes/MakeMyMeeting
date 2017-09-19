package services;

public class DAOCalendar {
	
	private static DAOCalendar daoCalendar;
	
	private DAOCalendar(){
	}
	
	public static DAOCalendar getInstance() {
		if(daoCalendar == null)
			daoCalendar = new DAOCalendar();
		return daoCalendar;
	}
}
