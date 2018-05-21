package vista;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelSuperior extends JPanel {
	
	private VentanaTaller taller;
	private Parametros parametros;
	private Operaciones operaciones;
	
	public PanelSuperior(VentanaTaller taller){
		this.taller=taller;
		setLayout(new GridLayout(1, 2));
		
		parametros = new Parametros(taller);
		add (parametros);
		
		operaciones = new Operaciones(taller);
		add (operaciones);
	}
}
