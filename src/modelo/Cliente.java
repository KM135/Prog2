package modelo;

import java.util.ArrayList;

public class Cliente {
	private int cedula;
	private String nombre;
	private String direccion;
	private String telefono;
	private ArrayList <Vehiculo> autos;

	public Cliente(int cedula, String nombre, String direccion, String telefono) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		autos = new ArrayList<Vehiculo>();
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public ArrayList<Vehiculo> getAutos() {
		return autos;
	}

	public void setAutos(ArrayList<Vehiculo> autos) {
		this.autos = autos;
	}

	public boolean seBuscaAuto(String placa) {

		boolean encontrado = false;

		for (int i = 0; i < autos.size() && encontrado; i++) {
			if (autos.get(i).getPlaca().equalsIgnoreCase(placa)) {
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	public void agregarAuto(Vehiculo auto)throws Exception {
		if (seBuscaAuto(auto.getPlaca())) {
			throw new Exception("El mecanico que intenta registrar ya existe en el sistema");
		}
		else autos.add(auto);
	}
	
}
