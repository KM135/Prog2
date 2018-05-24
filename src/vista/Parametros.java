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
		cliente.setForeground(new Color(13, 163, 26));
		cliente.setBackground(new Color(12,31,52));
		cliente.setFont(fuente);
		add(cliente);
		
		auto=new JButton("Asignar auto");
		auto.setActionCommand(taller.AUTO);
		auto.addActionListener(taller);
		auto.addActionListener(taller);
		auto.setForeground(new Color(12,31,52));
		auto.setBackground(new Color(59, 198, 18));
		add(auto);
		
		mecanico=new JButton("Crear mecanico");
		mecanico.setActionCommand(taller.MECANICO);
		mecanico.addActionListener(taller);
		mecanico.setForeground(new Color(12,31,52));
		mecanico.setBackground(new Color(59, 198, 18));
		mecanico.setFont(fuente);
		add(mecanico);
		
		reparacion=new JButton("Registrar orden");
		reparacion.setActionCommand(taller.REPARACION);
		reparacion.addActionListener(taller);
		reparacion.setForeground(new Color(13, 163, 26));
		reparacion.setBackground(new Color(12,31,52));
		reparacion.setFont(fuente);
		add(reparacion);
	}
}