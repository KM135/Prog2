package vista;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelSuperior extends JPanel {
	
	private VentanaPrincipal ventana;
	private PanelParam parametros;
	private PanelOperaciones operaciones;
	
	public PanelSuperior(VentanaPrincipal pVentana){
		ventana= pVentana;
		setLayout(new GridLayout(1, 2));
		//setBorder(new TitledBorder(" "));
		
		parametros = new PanelParam(ventana);
		add (parametros);
		
		operaciones = new PanelOperaciones(ventana);
		add (operaciones);
	}
}
