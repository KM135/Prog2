package modelo;

import java.util.ArrayList;

public class Taller {

	private int id;
	private String nombre;
	private String direccion;
	private int telefono;
	private ArrayList<Reparacion> trabajos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Mecanico> mecanicos;

	public Taller(int id, String nombre, String direccion, int telefono) {

		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		trabajos = new ArrayList<Reparacion>();
		clientes = new ArrayList<Cliente>();
		mecanicos = new ArrayList<Mecanico>();
	}

	// -------------------------------
	// ------------------------------
	// GET & SET
	// ------------------------------
	// -------------------------------

	public int getId() {
		return id;
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

	public ArrayList<Reparacion> getTrabajos() {
		return trabajos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<Mecanico> getMecanicos() {
		return mecanicos;
	}

	// -------------------------------
	// ------------------------------
	// METODOS DE LA CLASE PRINCIPAL
	// ------------------------------
	// -------------------------------

	// -------------------------------
	// ------------------------------
	// METODOS DE BUSQUEDA
	// ------------------------------
	// -------------------------------

	public boolean seBuscaCliente(int cedula) {

		boolean encontrado = false;

		for (int i = 0; i < clientes.size() && !encontrado; i++) {
			if (clientes.get(i).getCedula() == cedula) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	public boolean seBuscaMecanico(String nombre) {

		boolean encontrado = false;

		for (int i = 0; i < mecanicos.size() && !encontrado; i++) {
			if (mecanicos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	public boolean seBuscaReparacion(int id) {

		boolean encontrado = false;

		for (int i = 0; i < trabajos.size() && !encontrado; i++) {
			if (trabajos.get(i).getId() == id) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	public boolean seBuscaAuto(String nombre, String placa) {

		boolean encontrado = false;

		for (int i = 0; i < clientes.size() && !encontrado; i++) {
			if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Entramos en el primer arreglo porque encontramos al cliente");
				for (int j = 0; j < clientes.get(i).getAutos().size() && !encontrado; j++) {
					if (clientes.get(i).getAutos().get(j).getPlaca().equalsIgnoreCase(placa)) {
						System.out.println("Entramos al segundo arreglo porque el cliente tiene el auto que buscamos");
						encontrado = true;
					}
				}
			}
		}
		return encontrado;
	}

	// -------------------------------
	// ------------------------------
	// METODOS PARA AGREGAR
	// ------------------------------
	// -------------------------------

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

	public void agregarMecanico(Mecanico mecanico) throws Exception {

		if (seBuscaMecanico(mecanico.getNombre())) {
			throw new Exception("El mecanico que intenta registrar ya existe en el sistema");
		} else {
			mecanicos.add(mecanico);
			System.out.println("El mecanico ha sido agregado exitosamente. Tenemos los siguientes mecanicos");
			imprimirArregloMecanicos();
		}
	}

	public void agregarAutoACliente(Vehiculo agregado, int cedulaCliente) throws Exception {

		if (clientes.isEmpty()) {
			throw new Exception("No hay clientes registrados en el sistema.");
		}

		else if (!seBuscaCliente(cedulaCliente)) {
			throw new Exception("El cliente que intenta ingresar NO existe");
		}

		else {
			boolean insertado = false;
			for (int i = 0; i < clientes.size() && !insertado; i++) {
				if (clientes.get(i).getCedula() == cedulaCliente) {
					clientes.get(i).agregarAuto(agregado);
					insertado = true;
					System.out.println("El auto " + agregado.getPlaca() + " ha sido asignado a "
							+ clientes.get(i).getNombre() + ". Cedula: " + clientes.get(i).getCedula());
				}
			}
		}
	}

	public void agregarTrabajo(Reparacion trabajo) throws Exception {
		if (clientes.isEmpty()) {
			throw new Exception("No hay clientes registrados en el sistema.");
		} else if (mecanicos.isEmpty()) {
			throw new Exception("No hay mecanicos registrados en el sistema.");
		} else if (seBuscaReparacion(trabajo.getId())) {
			throw new Exception("La orden de trabajo que intenta registrar ya existe en el sistema");
		} else if (!seBuscaMecanico(trabajo.getNombreMecanico())) {
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

	// -------------------------------
	// ------------------------------
	// METODOS PARA IMPRIMIR ARREGLOS
	// ------------------------------
	// -------------------------------

	public void imprimirArregloClientes() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i).getNombre() + " cedula: " + clientes.get(i).getCedula());
		}
	}

	public void imprimirArregloMecanicos() {
		for (int i = 0; i < mecanicos.size(); i++) {
			System.out.println(mecanicos.get(i).getNombre() + " cedula: " + mecanicos.get(i).getId());
		}
	}

	public void imprimirOrdenesDeTrabajo() {
		for (int i = 0; i < trabajos.size(); i++) {
			System.out.println("La orden de trabajo " + trabajos.get(i).getId() + " se registro el "
					+ trabajos.get(i).getFecha() + " para el vehiculo " + trabajos.get(i).getPlacaAuto());
		}
	}

}
