package entidades;

import java.sql.Date;
import java.util.List;

public class Reunion {

	private int id;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private Sala lugar;
	private List<Usuario> invitados;
	private Calendario calendario;
	private Usuario anfitrion;
	private boolean privado;
	private boolean recordar;
	
	public Reunion(int id, String nombre, Date fechaI, Date fechaF, Sala lugar, List<Usuario> invitados, Calendario calendario,
			Usuario anfitrion, boolean privado, boolean recordar) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaInicio = fechaI;
		this.fechaFin = fechaF;
		this.lugar = lugar;
		this.invitados = invitados;
		this.calendario = calendario;
		this.anfitrion = anfitrion;
		this.privado = privado;
		this.recordar = recordar;
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
	public Date getFechaIncio() {
		return this.fechaInicio;
	}
	public void setFechaInicio(Date fecha) {
		this.fechaInicio = fecha;
	}
	public Date getFechaFin() {
		return this.fechaFin;
	}
	public void setFechaFin(Date fecha) {
		this.fechaFin = fecha;
	}
	public Sala getLugar() {
		return lugar;
	}
	public void setLugar(Sala lugar) {
		this.lugar = lugar;
	}
	public List<Usuario> getInvitados() {
		return invitados;
	}
	public void setInvitados(List<Usuario> invitados) {
		this.invitados = invitados;
	}
	public Calendario getCalendario() {
		return calendario;
	}
	public void setCalendario(Calendario calendario) {
		this.calendario = calendario;
	}
	public Usuario getAnfitrion() {
		return anfitrion;
	}
	public void setAnfitrion(Usuario anfitrion) {
		this.anfitrion = anfitrion;
	}
	public boolean isPrivado() {
		return privado;
	}
	public void setPrivado(boolean privado) {
		this.privado = privado;
	}
	public boolean isRecordar() {
		return recordar;
	}
	public void setRecordar(boolean recordar) {
		this.recordar = recordar;
	}
	
}
