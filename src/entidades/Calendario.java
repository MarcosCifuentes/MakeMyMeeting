package entidades;

import java.util.ArrayList;
import java.util.List;

public class Calendario {

	private int id;
	private String nombre;
	private List<Reunion> reuniones;
	private Usuario dueño;
	
	public Calendario(int id, String nombre, Usuario dueño) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.reuniones = new ArrayList<Reunion>();
		this.dueño = dueño;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Reunion> getReuniones() {
		return reuniones;
	}
	//	public void setReuniones(List<Reunion> reuniones) {
	//		this.reuniones = reuniones;
	//	}
	public Usuario getDueño() {
		return dueño;
	}
	public void setDueño(Usuario dueño) {
		this.dueño = dueño;
	}



}
