package entidades;

public class Usuario {

	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private String email;
	private float telefono;

	public Usuario(int id, String nombre, String apellido, int edad, String email, float telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.email = email;
		this.telefono = telefono;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getTelefono() {
		return telefono;
	}

	public void setTelefono(float telefono) {
		this.telefono = telefono;
	}
}
