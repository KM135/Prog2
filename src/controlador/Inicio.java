package controlador;

import vista.Hilo;

public class Inicio {

	public static void main(String[] args) {
		
		ControladorInicio principal = new ControladorInicio();		
		Hilo miHilo = new Hilo();
		miHilo.start();
	}
}
