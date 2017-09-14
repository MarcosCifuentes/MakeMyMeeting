package entidades;

import java.util.ArrayList;
import java.util.List;

public class Calendario {

	private int id;
	private String nombre;
	private List<Reunion> reuniones;
	private Usuario due�o;
	
	public Calendario(int id, String nombre, Usuario due�o) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.reuniones = new ArrayList<Reunion>();
		this.due�o = due�o;
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
	public Usuario getDue�o() {
		return due�o;
	}
	public void setDue�o(Usuario due�o) {
		this.due�o = due�o;
	}



}
