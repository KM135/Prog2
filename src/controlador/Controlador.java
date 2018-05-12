package controlador;

import java.util.Scanner;

import modelo.*;

public class Controlador {

	public static void main(String[] args) throws Exception {

		Scanner entrada = new Scanner(System.in);
		Modelo modelo = new Modelo();
		boolean avance = true;

		while (avance == true) {
			System.out.println("********** Bienvenido a Papiperradas **********");
			System.out.println("");
			System.out.println("Seleccione una de las opciones:");
			System.out.println();
			System.out.println(" 1) Agregar cliente");
			System.out.println(" 2) Agregar auto de un cliente");
			System.out.println(" 3) Agregar mecanico");
			System.out.println(" 4) Registrar reparacion");

			String seleccion = entrada.nextLine();
			int seleccionInt = Integer.parseInt(seleccion);

			switch (seleccionInt) {
			case 1:

				System.out.print("Ingrese la cedula: ");
				String idCliente = entrada.nextLine();
				int idInt = Integer.parseInt(idCliente);

				System.out.print("Ingrese el nombre: ");
				String nombreCliente = entrada.nextLine();

				System.out.print("Ingrese la direccion: ");
				String direccionCliente = entrada.nextLine();

				System.out.print("Ingrese el telefono: ");
				String telefonoCliente = entrada.nextLine();
				int idTel = Integer.parseInt(telefonoCliente);
				
				try {
					modelo.agregarCliente(new Cliente(idInt, nombreCliente, direccionCliente, idTel));
				} catch (Exception e) {
					System.out.println("Ese cliente ya esta registrado, revise los datos");
				}	

				break;
			}
			switch (seleccionInt) {
			case 2:
				
				System.out.print("Nombre del propietario del auto que desea ingresar: ");
				String nombrePropietario = entrada.nextLine();
				System.out.print("Ingrese la placa del vehiculo: ");
				String placa = entrada.nextLine();
				
				try {
					modelo.agregarAutos(new Vehiculo(placa), nombrePropietario);
				} catch (Exception e) {
					System.out.println("El cliente no existe o el auto ya ha sido ingresado, revise nuevamente");
				}
				
				break;
			}
			switch (seleccionInt) {
			case 3:
				
				System.out.println("Cedula: ");
				String id = entrada.nextLine();
				int cedula = Integer.parseInt(id);
				System.out.println("Nombre: ");
				String nombre = entrada.nextLine();
				System.out.println("Direccion: ");
				String direccion = entrada.nextLine();
				System.out.println("Telefono: ");
				String telefono = entrada.nextLine();
				int tel = Integer.parseInt(telefono);
				
				try {
					modelo.agregarMecanicos(new Mecanico(cedula, nombre, direccion, tel));
				} catch (Exception e) {
					System.out.println("Ese mecanico ya existe en nuestro sistema");
				}
				
				break;
			}
			switch (seleccionInt) {
			case 4:
				
				System.out.println("Numero de la orden de trabajo: ");
				String idTxt = entrada.nextLine();
				int id = Integer.parseInt(idTxt);
				
				System.out.println("Fecha: ");
				String fecha = entrada.nextLine();
				
				System.out.println("Descripcion: ");
				String descripcion = entrada.nextLine();
						
				System.out.println("Nombre del cliente: ");
				String nombreCliente = entrada.nextLine();
				
				System.out.println("Placa del auto: ");
				String placa = entrada.nextLine();
				
				System.out.println("Kilometraje: ");
				String kilTxt = entrada.nextLine();
				int kilometraje = Integer.parseInt(kilTxt);
				
				System.out.println("ID del mecanico: ");
				String idMecanicoTxt = entrada.nextLine();
				int idMecanico = Integer.parseInt(idMecanicoTxt);
				
				System.out.println("Nombre del mecanico: ");
				String nombreMecanico = entrada.nextLine();
				
				try {
					modelo.registrarTrabajo(new Reparacion(id, fecha, descripcion, nombreCliente, placa, kilometraje, idMecanico, nombreMecanico));
				} catch (Exception e) {
					System.out.println("Hubo un problema al registrar esta orden de trabajo");
				}
				
				break;
			}

			System.out.println("Desea continuar? S/N");
			String continuaremos = entrada.nextLine();

			if (continuaremos.equalsIgnoreCase("N")) {
				avance = false;
			}

		}
	}
}
