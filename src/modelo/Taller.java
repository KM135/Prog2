package modelo;

import java.util.ArrayList;

public class Taller {

	private int id;
	private String nombre;
	private String direccion;
	private int telefono;

	/*
	 * Arreglos
	 */

	private ArrayList<Reparacion> trabajos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Mecanico> mecanicos;

	/*
	 * Constructor
	 */

	public Taller(int id, String nombre, String direccion, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		trabajos = new ArrayList<Reparacion>();
		clientes = new ArrayList<Cliente>();
		mecanicos = new ArrayList<Mecanico>();
	}

	/*
	 * Getters and setters
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

	// ------------------------------
	// METODOS DE LA CLASE PRINCIPAL
	// ------------------------------

	/*
	 * Agreando clientes
	 */

	public boolean seBuscaCliente(int id) {

		boolean encontrado = false;

		for (int i = 0; i < clientes.size() && encontrado; i++) {
			if (clientes.get(i).getCedula() == id) {
				encontrado = true;
			}
		}

		return encontrado;
	}

	public void agregarCliente(Cliente cliente) throws Exception {

		if (seBuscaCliente(cliente.getCedula())) {
			throw new Exception("El cliente ya existe en el sistema");
		} else
			clientes.add(cliente);
	}

	/*
	 * Agregando mecanicos
	 */

	public boolean seBuscaMecanico(int id) {

		boolean encontrado = false;

		for (int i = 0; i < mecanicos.size() && encontrado; i++) {
			if (mecanicos.get(i).getId() == id) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	public void agregarMecanico(Mecanico mecanico) throws Exception {
		if (seBuscaMecanico(mecanico.getId())) {
			throw new Exception("El mecanico que intenta registrar ya existe en el sistema");
		} else
			mecanicos.add(mecanico);
	}

	/*
	 * Agregando reparaciones
	 */

	public boolean seBuscaReparacion(int id) {

		boolean encontrado = false;

		for (int i = 0; i < trabajos.size() && encontrado; i++) {
			if (trabajos.get(i).getId() == id) {
				encontrado = true;
			}
		}

		return encontrado;
	}

	public void agregarTrabajo(Reparacion trabajo) throws Exception {
		
		

//		if (seBuscaReparacion(trabajo.getId())) {
//			throw new Exception("Orden de trabajo ya existe en el sistema");
//		} else
//			trabajos.add(trabajo);
	}

}
