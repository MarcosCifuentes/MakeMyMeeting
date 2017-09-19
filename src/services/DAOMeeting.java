package services;

public class DAOMeeting {
	
	private static DAOMeeting daoMeeting;
	
	private DAOMeeting(){
	}
	
	public static DAOMeeting getInstance() {
		if(daoMeeting == null)
			daoMeeting = new DAOMeeting();
		return daoMeeting;
	}
	

}
