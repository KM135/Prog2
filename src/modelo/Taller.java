package modelo;

import java.util.ArrayList;

public class Taller {

	/**
	 * Atributos de la clase
	 */
	private int id;
	private String nombre;
	private String direccion;
	private int telefono;

	/**
	 * Arreglos de la clase para almacenar ordenes de trabajo, cliente y
	 * mecanicos.
	 */

	private ArrayList<Reparacion> trabajos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Mecanico> mecanicos;

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 */

	public Taller(int id, String nombre, String direccion, int telefono) {

		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		trabajos = new ArrayList<Reparacion>();
		clientes = new ArrayList<Cliente>();
		mecanicos = new ArrayList<Mecanico>();
	}

	/**
	 * Getters and setters
	 * 
	 * @return
	 */

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

	public ArrayList<Reparacion> getArreglos() {
		return trabajos;
	}

	public void setArreglos(ArrayList<Reparacion> arreglos) {
		this.trabajos = arreglos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Reparacion> getTrabajos() {
		return trabajos;
	}

	public void setTrabajos(ArrayList<Reparacion> trabajos) {
		this.trabajos = trabajos;
	}

	public ArrayList<Mecanico> getMecanicos() {
		return mecanicos;
	}

	public void setMecanicos(ArrayList<Mecanico> mecanicos) {
		this.mecanicos = mecanicos;
	}

	// -------------------------------
	// ------------------------------
	// METODOS DE LA CLASE PRINCIPAL
	// ------------------------------
	// -------------------------------

	/**
	 * Metodo para buscar clientes.
	 * 
	 * @param id
	 * @return
	 */

	public boolean seBuscaCliente(String nombre) {

		boolean encontrado = false;

		for (int i = 0; i < clientes.size() && !encontrado; i++) {
			if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
			}
		}

		return encontrado;
	}

	public void agregarCliente(Cliente cliente) throws Exception {

		if (seBuscaCliente(cliente.getNombre())) {
			throw new Exception("El cliente que intenta ingresar ya existe");
		}

		else {
			clientes.add(cliente);
			System.out.println("El cliente ha sido agregado exitosamente. Tenemos los siguientes clientes");
			imprimirArreglo();
		}
	}
	
	public void imprimirArreglo() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i).getNombre());
		}
	}
	//
	// /*
	// * Buscando autos
	// */
	// public boolean seBuscaAutoTaller(String placa) {
	//
	// boolean encontrado = false;
	//
	// for (int i = 0; i < clientes.size() && encontrado; i++) {
	// encontrado = clientes.get(i).seBuscaAuto(placa);
	// }
	// return encontrado;
	// }
	//
	// /*
	// * Agregar autos al cliente
	// */
	//
	// public void agregarAutosAlCliente(int cedula, String placa) throws
	// Exception {
	// for (int i = 0; i < clientes.size(); i++) {
	// if (clientes.get(i).getCedula() == cedula) {
	// clientes.get(i).agregarAuto(placa);
	// }
	// }
	// }

	/*
	 * Agregando mecanicos
	 */

	// public boolean seBuscaMecanico(int id) {
	//
	// boolean encontrado = false;
	//
	// for (int i = 0; i < mecanicos.size() && encontrado; i++) {
	// if (mecanicos.get(i).getId() == id) {
	// encontrado = true;
	// }
	// }
	// return encontrado;
	// }
	//
	// public void agregarMecanico(Mecanico mecanico) throws Exception {
	// if (seBuscaMecanico(mecanico.getId())) {
	// throw new Exception("El mecanico que intenta registrar ya existe en el
	// sistema");
	// } else
	// mecanicos.add(mecanico);
	// }
	//
	// /*
	// * Agregando reparaciones
	// */
	//
	// public boolean seBuscaReparacion(int id) {
	//
	// boolean encontrado = false;
	//
	// for (int i = 0; i < trabajos.size() && encontrado; i++) {
	// if (trabajos.get(i).getId() == id) {
	// encontrado = true;
	// }
	// }
	//
	// return encontrado;
	// }
	//
	// public void agregarTrabajo(Reparacion trabajo) throws Exception {
	//
	// if (seBuscaReparacion(trabajo.getId())) {
	// throw new Exception("La orden de trabajo que intenta registrar ya existe
	// en el sistema");
	// } else if (!seBuscaMecanico(trabajo.getIdMecanico())) {
	// throw new Exception("El mecanico que esta asignando no trabaja en este
	// taller");
	// } else if (!seBuscaAutoTaller(trabajo.getPlacaAuto())) {
	// throw new Exception("El auto no corresponde a ningun cliente. Verifique
	// los clientes creados y sus autos");
	// }
	//
	// else
	// trabajos.add(trabajo);
	// }

}
