package controlador;

import modelo.Modelo;
import vista.VentanaPrincipal;

public class Controlador {
	
	private VentanaPrincipal ventana;
	private Modelo modelo;
	
	public Controlador(){
		ventana = new VentanaPrincipal(this);
		modelo = new Modelo();
	}

}
