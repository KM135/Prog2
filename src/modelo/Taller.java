package modelo;

import java.util.ArrayList;
//comentario de prueba
// soy un idiota
public class Taller {

	private int id;
	private String nombre;
	private String direccion;
	private int telefono;
	private ArrayList <Mecanico>trabajadores;
	

	public Taller(int id, String nombre, String direccion, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		trabajadores = new ArrayList <Mecanico>();
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public ArrayList<Mecanico> getTrabajadores() {
		return trabajadores;
	}
	public void setTrabajadores(ArrayList<Mecanico> trabajadores) {
		this.trabajadores = trabajadores;
	}

}
