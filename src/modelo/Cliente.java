package modelo;

import java.util.ArrayList;

/**
 * Atributos de la clase cliente. Incluye un arreglo de vechiculos llamado
 * autos.
 * 
 * @author JulioAlberto
 *
 */
public class Cliente {
	private int cedula;
	private String nombre;
	private String direccion;
	private int telefono;
	private ArrayList<Vehiculo> autos;

	/**
	 * Constructor de la clase cliente.
	 * 
	 * @param cedula
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 */
	public Cliente(int cedula, String nombre, String direccion, int telefono) {
		
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		autos = new ArrayList<Vehiculo>();
	}

	/**
	 * Getters and setters
	 * 
	 * @return
	 */
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Vehiculo> getAutos() {
		return autos;
	}

	public void setAutos(ArrayList<Vehiculo> autos) {
		this.autos = autos;
	}

	/**
	 * Metodo de busqueda. Se desea saber si un auto existe dentro del arreglo
	 * antes de agregarlo.
	 * 
	 * @param placa
	 * @return
	 */
	public boolean seBuscaAuto(String placa) {

		boolean encontrado = false;

		for (int i = 0; i < autos.size() && !encontrado; i++) {
			if (autos.get(i).getPlaca().equalsIgnoreCase(placa)) {
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	public void agregarAuto(Vehiculo auto) throws Exception {
		if (seBuscaAuto(auto.getPlaca())) {
			throw new Exception("Ya ha registrado este auto para este cliente");
		} else
			autos.add(auto);
	}
}
