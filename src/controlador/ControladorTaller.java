package controlador;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Mecanico;
import modelo.Modelo;
import modelo.Reparacion;
import modelo.Vehiculo;
import vista.Principal;
import vista.VentanaTaller;

public class ControladorTaller {

	private VentanaTaller taller;
	private Modelo modelo;
	
	public ControladorTaller() {
		taller = new VentanaTaller(this);
		modelo = new Modelo();
	}

	public void agregarCliente(int cedula, String nombre, String direccion, int telefono) {
		try {
			modelo.agregarCliente(new Cliente(cedula, nombre, direccion, telefono));
			taller.aviso("Cliente agregado satisfactoriamente");
		} catch (Exception e) {
			taller.error(e.getMessage());
		}
	}

	public void agregarAuto(String placa, int cedula) {
		try {
			modelo.agregarAutos(new Vehiculo(placa), cedula);
			taller.aviso("Auto agregado satisfactoriamente");
		} catch (Exception e) {
			taller.error(e.getMessage());
		}
	}

	public void agregarMecanico(int id, String nombre, String direccion, int telefono) {
		try {
			modelo.agregarMecanicos(new Mecanico(id, nombre, direccion, telefono));
		} catch (Exception e) {
			taller.error(e.getMessage());
		}
	}

	public void agregarReparacion(int id, String fecha, String descripcion, String nombreCliente, String placaAuto,
			int kilometraje, int idMecanico, String nombreMecanico) {
		
		try {
			modelo.registrarTrabajo(new Reparacion(id, fecha, descripcion, nombreCliente, placaAuto, kilometraje, idMecanico, nombreMecanico));
		} catch (Exception e) {
			taller.error(e.getMessage());
		}
	}
	
	public String dueniosAutos(){
		String datosTxt = "\n" + "---- REPORTE DE VEHICULOS Y PROPIETARIOS ----" + "\n" + "\n";
		for (int i = 0; i < modelo.darClientes().size(); i++) {
			datosTxt += "El cliente " + modelo.darClientes().get(i).getNombre() + " tiene registrados los siguientes vechiculos: " + "\n";
			for (int j = 0; j < modelo.darClientes().get(i).getAutos().size(); j++) {
				datosTxt += "\t" + "Placa: " + modelo.darClientes().get(i).getAutos().get(j).getPlaca() + "\n";
			}
		}
		return datosTxt;
	}
	
}
