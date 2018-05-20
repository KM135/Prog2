package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanTallerParam extends JPanel{
	
	private JButton cliente, auto, mecanico, reparacion, agregarE; 
	private VenTallerPrin ventana;
	
	public PanTallerParam(VenTallerPrin pVentana){
		ventana= pVentana;
		setLayout(new GridLayout(2, 2, 10, 10));
		setBorder(new TitledBorder("Parametros iniciales "));
		
		cliente=new JButton("Crear cliente");
		cliente.setActionCommand(ventana.CLIENTE);
		cliente.addActionListener(ventana);
		add(cliente);
		
		auto=new JButton("Asignar auto");
		auto.setActionCommand(ventana.AUTO);
		auto.addActionListener(ventana);
		add(auto);
		
		mecanico=new JButton("Crear mecanico");
		mecanico.setActionCommand(ventana.MECANICO);
		mecanico.addActionListener(ventana);
		add(mecanico);
		
		reparacion=new JButton("Registrar orden");
		reparacion.setActionCommand(ventana.REPARACION);
		reparacion.addActionListener(ventana);
		add(reparacion);
	}
}