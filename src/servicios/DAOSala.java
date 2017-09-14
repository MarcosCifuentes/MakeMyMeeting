package servicios;

public class DAOSala {
	
	private static DAOSala daoSala;
	
	private DAOSala(){
	}
	
	public static DAOSala getInstance() {
		if(daoSala == null)
			daoSala = new DAOSala();
		return daoSala;
	}
}
