package controlador;

import modelo.Cliente;
import modelo.Mecanico;
import modelo.Modelo;
import modelo.Reparacion;
import modelo.Vehiculo;
import vista.VenPrincipal;
import vista.VenTallerPrin;

public class Controlador {

	private VenTallerPrin ventana;
	private Modelo modelo;
	private VenPrincipal venInicial;
	
	public Controlador() {
		ventana = new VenTallerPrin(this);
		venInicial = new VenPrincipal(); 
		modelo = new Modelo();
	}

	public void agregarCliente(int cedula, String nombre, String direccion, int telefono) {
		try {
			modelo.agregarCliente(new Cliente(cedula, nombre, direccion, telefono));
			//ventana.aviso("Cliente agregado satisfactoriamente");
		} catch (Exception e) {
			//ventana.error(e.getMessage());
		}
	}

	public void agregarAuto(String placa, int cedula) {
		try {
			modelo.agregarAutos(new Vehiculo(placa), cedula);
			//ventana.aviso("Auto agregado satisfactoriamente");
		} catch (Exception e) {
			//ventana.error(e.getMessage());
		}
	}

	public void agregarMecanico(int id, String nombre, String direccion, int telefono) {
		try {
			modelo.agregarMecanicos(new Mecanico(id, nombre, direccion, telefono));
		} catch (Exception e) {
			//ventana.error(e.getMessage());
		}
	}

	public void agregarReparacion(int id, String fecha, String descripcion, String nombreCliente, String placaAuto,
			int kilometraje, int idMecanico, String nombreMecanico) {
		
		try {
			modelo.registrarTrabajo(new Reparacion(id, fecha, descripcion, nombreCliente, placaAuto, kilometraje, idMecanico, nombreMecanico));
		} catch (Exception e) {
			//ventana.error(e.getMessage());
		}
	}
}
