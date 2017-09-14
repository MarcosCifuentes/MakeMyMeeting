package servicios;

public class DAOReunion {
	
	private static DAOReunion daoReunion;
	
	private DAOReunion(){
	}
	
	public static DAOReunion getInstance() {
		if(daoReunion == null)
			daoReunion = new DAOReunion();
		return daoReunion;
	}
	

}
