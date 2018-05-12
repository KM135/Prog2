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
				String nombreEspectador = entrada.nextLine();

				System.out.print("Ingrese la direccion: ");
				String direccionCliente = entrada.nextLine();

				System.out.print("Ingrese el telefono: ");
				String telefonoCliente = entrada.nextLine();
				int idTel = Integer.parseInt(telefonoCliente);

				modelo.agregarCliente(new Cliente(idInt, nombreEspectador, direccionCliente, idTel));

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
