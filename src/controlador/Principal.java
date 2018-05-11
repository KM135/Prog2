package controlador;

import java.util.Scanner;

import modelo.*;

public class Principal {

	public static void main(String[] args) throws Exception {

		Scanner entrada = new Scanner(System.in);
		Taller local = new Taller(1, "Papiperradas.com", "Av Siempre Viva", 5921650);
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
				String nombreEspectador = entrada.nextLine();

				System.out.print("Ingrese la direccion: ");
				String direccionCliente = entrada.nextLine();

				System.out.print("Ingrese el telefono: ");
				String telefonoCliente = entrada.nextLine();
				//int telefonoInt = Integer.parseInt(telefonoCliente);
				
				try {
					local.agregarCliente(new Cliente(idInt, nombreEspectador, direccionCliente, telefonoCliente));
				} catch (Exception e) {
					System.out.println("Paila papa");
				}
				break;
			}
			switch (seleccionInt) {
			case 2:
				break;
			}
			switch (seleccionInt) {
			case 3:
				break;
			}
			switch (seleccionInt) {
			case 4:
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
