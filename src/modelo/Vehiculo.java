package modelo;

import java.util.ArrayList;

public class Vehiculo {
	private String placa;
	private ArrayList<Propietario> dueño;

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

	public ArrayList<Propietario> getDueño() {
		return dueño;
	}

	public void setDueño(ArrayList<Propietario> dueño) {
		this.dueño = dueño;
	}

	

}
