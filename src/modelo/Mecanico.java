package modelo;

public class Mecanico {

	private int id;
	private String nombre;
	private String direccion;
	private int telefono;

	public Mecanico(int id, String nombre, String direccion, int telefono) {

		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getTelefono() {
		return telefono;
	}
}
