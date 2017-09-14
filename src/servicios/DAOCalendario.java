package servicios;

public class DAOCalendario {
	
	private static DAOCalendario daoCalendario;
	
	private DAOCalendario(){
	}
	
	public static DAOCalendario getInstance() {
		if(daoCalendario == null)
			daoCalendario = new DAOCalendario();
		return daoCalendario;
	}
}
