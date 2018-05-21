package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Parametros extends JPanel{
	
	private JButton cliente, auto, mecanico, reparacion, agregarE; 
	private VentanaTaller taller;
	
	public Parametros(VentanaTaller taller){
		this.taller=taller;
		setLayout(new GridLayout(2, 2, 10, 10));
		setBorder(new TitledBorder("Parametros iniciales "));
		
		cliente=new JButton("Crear cliente");
		cliente.setActionCommand(taller.CLIENTE);
		cliente.addActionListener(taller);
		add(cliente);
		
		auto=new JButton("Asignar auto");
		auto.setActionCommand(taller.AUTO);
		auto.addActionListener(taller);
		add(auto);
		
		mecanico=new JButton("Crear mecanico");
		mecanico.setActionCommand(taller.MECANICO);
		mecanico.addActionListener(taller);
		add(mecanico);
		
		reparacion=new JButton("Registrar orden");
		reparacion.setActionCommand(taller.REPARACION);
		reparacion.addActionListener(taller);
		add(reparacion);
	}
}