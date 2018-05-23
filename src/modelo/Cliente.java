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
	
	public int getCedula() {
		return cedula;
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

	public ArrayList<Vehiculo> getAutos() {
		return autos;
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
		} else{
			System.out.println("Vechiculo agregado exitosamente para este cliente");
			autos.add(auto);
			System.out.println("Los autos que tenemos registrados son: ");
			imprimirArregloAutos();
		}
	}
	
	public void imprimirArregloAutos() {
		for (int i = 0; i < autos.size(); i++) {
			System.out.println(autos.get(i).getPlaca());
		}
	}
}
