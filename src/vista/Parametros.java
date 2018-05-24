package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Parametros extends JPanel{
	
	private JButton cliente, auto, mecanico, reparacion, agregarE; 
	private VentanaTaller taller;
	Font fuente = new Font("Arial", Font.BOLD, 13);
	
	public Parametros(VentanaTaller taller){
		this.taller=taller;
		setLayout(new GridLayout(2, 2, 10, 10));
		setBorder(new TitledBorder("Parametros iniciales "));
		
		cliente=new JButton("Crear cliente");
		cliente.setActionCommand(taller.CLIENTE);
		cliente.addActionListener(taller);
		cliente.setForeground(new Color(232, 244, 233));
		cliente.setBackground(new Color(20, 25, 81));
		cliente.setFont(fuente);
		add(cliente);
		
		auto=new JButton("Asignar auto");
		auto.setActionCommand(taller.AUTO);
		auto.addActionListener(taller);
		auto.addActionListener(taller);
		auto.setForeground(new Color(232, 244, 233));
		auto.setBackground(new Color(37, 47, 165));
		add(auto);
		
		mecanico=new JButton("Crear mecanico");
		mecanico.setActionCommand(taller.MECANICO);
		mecanico.addActionListener(taller);
		mecanico.setForeground(new Color(232, 244, 233));
		mecanico.setBackground(new Color(130, 77, 0));
		mecanico.setFont(fuente);
		add(mecanico);
		
		reparacion=new JButton("Registrar orden");
		reparacion.setActionCommand(taller.REPARACION);
		reparacion.addActionListener(taller);
		reparacion.setForeground(new Color(232, 244, 233));
		reparacion.setBackground(new Color(209, 141, 81));
		reparacion.setFont(fuente);
		add(reparacion);
	}
}