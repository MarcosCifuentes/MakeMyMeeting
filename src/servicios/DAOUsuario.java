package servicios;

import java.util.Date;

public class DAOUsuario {
	
	private static DAOUsuario daoUsuario;
	
	private DAOUsuario(){
	}
	
	public static DAOUsuario getInstance() {
		if(daoUsuario == null)
			daoUsuario = new DAOUsuario();
		return daoUsuario;
	}
	
	private boolean disponibilidadUsuario(Date fechaInicio, Date fechaFin) {
		//la consulta se realiza a la bdd
		return true;
	}
}
