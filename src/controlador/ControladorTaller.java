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
			taller.aviso("Mecanico agregado exitosamente");
		} catch (Exception e) {
			taller.error(e.getMessage());
		}
	}

	public void agregarReparacion(int id, String fecha, String descripcion, String nombreCliente, String placaAuto,
			int kilometraje, String nombreMecanico) {

		try {
			modelo.registrarTrabajo(
					new Reparacion(id, fecha, descripcion, nombreCliente, placaAuto, kilometraje, nombreMecanico));
			taller.aviso("La orden de trabajo se ha registrado exitosamente");
		} catch (Exception e) {
			taller.error(e.getMessage());
		}
	}

	public String dueniosAutos() {
		String datosTxt = "\n" + "---- REPORTE DE VEHICULOS Y PROPIETARIOS ----" + "\n" + "\n";
		for (int i = 0; i < modelo.darClientes().size(); i++) {
			datosTxt += "El cliente " + modelo.darClientes().get(i).getNombre()
					+ " tiene registrados los siguientes vechiculos: " + "\n";
			for (int j = 0; j < modelo.darClientes().get(i).getAutos().size(); j++) {
				datosTxt += "\t" + "Placa: " + modelo.darClientes().get(i).getAutos().get(j).getPlaca() + "\n";
			}
		}
		return datosTxt;
	}

	public String reparaciones() {
		String reporte = "\n" + "---- REPORTE DE REPARACIONES ----" + "\n" + "\n";

		for (int i = 0; i < modelo.darReparaciones().size(); i++) {
			reporte += "\n" +"El vehiculo " + modelo.darReparaciones().get(i).getPlacaAuto() + " fue reparado por "
					+ modelo.darReparaciones().get(i).getNombreMecanico() + " , quien lo recibio con "
					+ modelo.darReparaciones().get(i).getKilometraje() + " Kilometros. " + "\n"
					+ " Se procedio a realizarle el siguiente procedimiento: " + "\n"
					+ modelo.darReparaciones().get(i).getDescripcion() + "\n";
		}

		return reporte;
	}

	public String historialAuto(String placa) {
		String reporte = "\n" + "---- HISTORICO DE REPARACIONES ----" + "\n"
				+ "El vehiculo seleccionado tiene el siguiente historial: " + "\n" + "\n";

		for (int i = 0; i < modelo.darReparaciones().size(); i++) {
			if (modelo.darReparaciones().get(i).getPlacaAuto().equalsIgnoreCase(placa)) {
				reporte += "Identidicador: " + modelo.darReparaciones().get(i).getId() + "\n" + "Propietario: "
						+ modelo.darReparaciones().get(i).getNombreCliente() + "\n" + "Fecha: "
						+ modelo.darReparaciones().get(i).getFecha() + "\n" + "Detalle del trabajo: "
						+ modelo.darReparaciones().get(i).getDescripcion() + "\n" + "Atendido por: "
						+ modelo.darReparaciones().get(i).getNombreMecanico() + "\n" + "Se recibio con "
						+ modelo.darReparaciones().get(i).getKilometraje() + " Kilometros" + "\n" + "\n";
			}
		}
		return reporte;
	}

}
