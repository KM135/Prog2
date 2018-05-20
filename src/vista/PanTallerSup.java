package vista;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanTallerSup extends JPanel {
	
	private VenTallerPrin ventana;
	private PanTallerParam parametros;
	private PanTallerOp operaciones;
	
	public PanTallerSup(VenTallerPrin pVentana){
		ventana= pVentana;
		setLayout(new GridLayout(1, 2));
		//setBorder(new TitledBorder(" "));
		
		parametros = new PanTallerParam(ventana);
		add (parametros);
		
		operaciones = new PanTallerOp(ventana);
		add (operaciones);
	}
}
