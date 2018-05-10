package modelo;

import java.util.ArrayList;

public class Reparacion {

	private int id;
	private String fecha;
	private String descripcion;
	private int kilometraje;

	public Reparacion(int id, String fecha, String descripcion, int kilometraje) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.kilometraje = kilometraje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

}
