package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanTallerOp extends JPanel{
	
	private JButton reparaciones, historialXAuto, autosregistrados; 
	private VenTallerPrin ventana;
	
	public PanTallerOp(VenTallerPrin pVentana){
		ventana= pVentana;
		setLayout(new GridLayout(3, 1, 10, 10));
		setBorder(new TitledBorder("Operaciones"));
		
		reparaciones=new JButton("Listar Reparaciones");
		reparaciones.setActionCommand(ventana.LISTAREPARACIONES);
		reparaciones.addActionListener(ventana);
		add(reparaciones);
		
		historialXAuto=new JButton("Historial por vehiculo");
		historialXAuto.setActionCommand(ventana.HISTXAUTO);
		historialXAuto.addActionListener(ventana);
		add(historialXAuto);
		
		autosregistrados=new JButton("Lista de vehiculos y propietarios");
		autosregistrados.setActionCommand(ventana.AUTOSYDUEÑO);
		autosregistrados.addActionListener(ventana);
		add(autosregistrados);
	}
}