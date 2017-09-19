package services;

public class DAOSite {
	
	private static DAOSite daoSite;
	
	private DAOSite(){
	}
	
	public static DAOSite getInstance() {
		if(daoSite == null)
			daoSite = new DAOSite();
		return daoSite;
	}
}
