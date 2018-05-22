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

	public boolean seBuscaCliente(int cedula) {

		boolean encontrado = false;

		for (int i = 0; i < clientes.size() && !encontrado; i++) {
			if (clientes.get(i).getCedula() == cedula) {
				encontrado = true;
			}
		}

		return encontrado;
	}

	/**
	 * Metodo para agregar clientes al sistema
	 * 
	 * @param cliente
	 * @throws Exception
	 */

	public void agregarCliente(Cliente cliente) throws Exception {

		if (seBuscaCliente(cliente.getCedula())) {
			throw new Exception("El cliente que intenta ingresar ya existe");
		}

		else {
			clientes.add(cliente);
			System.out.println("El cliente ha sido agregado exitosamente. Tenemos los siguientes clientes");
			imprimirArregloClientes();
		}
	}

	public void imprimirArregloClientes() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i).getNombre());
		}
	}

	/**
	 * Metodo para agregar autos a un cliente.
	 * 
	 * @param agregado
	 * @param nombreCliente
	 * @throws Exception
	 */
	public void agregarAutoACliente(Vehiculo agregado, int cedulaCliente) throws Exception {

		if (clientes.isEmpty()) {
			throw new Exception("No hay clientes registrados en el sistema.");
		} else {
			for (int i = 0; i < clientes.size(); i++) {
				if (clientes.get(i).getCedula() == cedulaCliente) {
					clientes.get(i).agregarAuto(agregado);
					System.out.println("El auto " + agregado.getPlaca() + " ha sido agregado para el cliente "
							+ clientes.get(i).getNombre() + " con cedula " + clientes.get(i).getCedula());
				} else
					throw new Exception("Esa cedula no esta registrada");
			}
		}

	}

	/**
	 * Metodo que busca mecanicos en el sistema antes de agregar uno
	 * 
	 * @param id
	 * @return
	 */

	public boolean seBuscaMecanico(int id) {

		boolean encontrado = false;

		for (int i = 0; i < mecanicos.size() && !encontrado; i++) {
			if (mecanicos.get(i).getId() == id) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	/**
	 * Metodo que agrega mecanicos
	 * 
	 * @param mecanico
	 * @throws Exception
	 */

	public void agregarMecanico(Mecanico mecanico) throws Exception {

		if (mecanicos.isEmpty()) {
			throw new Exception("No hay mecanicos registrados en el sistema.");
		}

		else if (seBuscaMecanico(mecanico.getId())) {
			throw new Exception("El mecanico que intenta registrar ya existe en el sistema");
		} else {
			System.out.println("El mecanico ha sido agregado exitosamente. Tenemos los siguientes clientes");
			mecanicos.add(mecanico);
			imprimirArregloMecanicos();
		}
	}

	public void imprimirArregloMecanicos() {
		for (int i = 0; i < mecanicos.size(); i++) {
			System.out.println(mecanicos.get(i).getNombre());
		}
	}

	/*
	 * Agregando reparaciones
	 */

	public boolean seBuscaReparacion(int id) {

		boolean encontrado = false;

		for (int i = 0; i < trabajos.size() && !encontrado; i++) {
			if (trabajos.get(i).getId() == id) {
				encontrado = true;
			}
		}

		return encontrado;
	}

	public boolean seBuscaAuto(String nombre, String auto) {
		boolean autoEncontrado = false;
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
				Cliente tmp = clientes.get(i);
				ArrayList<Vehiculo> autosCliente = tmp.getAutos();
				for (int j = 0; j < autosCliente.size(); j++) {
					if (autosCliente.get(i).getPlaca().equalsIgnoreCase(auto)) {
						autoEncontrado = true;
					}
				}
			}
		}
		return autoEncontrado;
	}

	public void agregarTrabajo(Reparacion trabajo) throws Exception {
		if (clientes.isEmpty()) {
			throw new Exception("No hay clientes registrados en el sistema.");
		}
		if (seBuscaReparacion(trabajo.getId())) {
			throw new Exception("La orden de trabajo que intenta registrar ya existe en el sistema");
		} else if (!seBuscaMecanico(trabajo.getIdMecanico())) {
			throw new Exception("El mecanico que esta ingresando no trabaja en este taller");
		} else if (!seBuscaAuto(trabajo.getNombreCliente(), trabajo.getPlacaAuto())) {
			throw new Exception("El auto no corresponde a ningun cliente. Verifique los clientes creados y sus autos");
		}

		else {
			System.out.println("La orden de trabajo ha sido creada exitosamente");
			trabajos.add(trabajo);
			imprimirOrdenesDeTrabajo();
		}
	}

	public void imprimirOrdenesDeTrabajo() {
		for (int i = 0; i < trabajos.size(); i++) {
			System.out.println("La orden de trabajo " + trabajos.get(i).getId() + " se registro el "
					+ trabajos.get(i).getFecha() + " para el vehiculo " + trabajos.get(i).getPlacaAuto());
		}
	}

}
