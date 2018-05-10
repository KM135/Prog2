package modelo;

import java.util.ArrayList;

public class Vehiculo {
	private String placa;
	private ArrayList<Reparacion> reparaciones;

	public Vehiculo(String placa) {
		super();
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public ArrayList<Reparacion> getReparaciones() {
		return reparaciones;
	}

	public void setReparaciones(ArrayList<Reparacion> reparaciones) {
		this.reparaciones = reparaciones;
	}

}
