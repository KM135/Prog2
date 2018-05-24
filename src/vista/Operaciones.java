package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Operaciones extends JPanel{
	
	private JButton reparaciones, historialXAuto, autosregistrados; 
	private VentanaTaller ventana;
	Font fuente = new Font("Arial", Font.BOLD, 15);
	
	public Operaciones(VentanaTaller pVentana){
		ventana= pVentana;
		setLayout(new GridLayout(3, 1, 10, 10));
		setBorder(new TitledBorder("Operaciones"));
		
		reparaciones=new JButton("Listar Reparaciones");
		reparaciones.setActionCommand(ventana.LISTAREPARACIONES);
		reparaciones.addActionListener(ventana);
		reparaciones.setForeground(new Color(232, 244, 233));
		reparaciones.setBackground(new Color(20, 25, 81));
		reparaciones.setFont(fuente);
		add(reparaciones);
		
		historialXAuto=new JButton("Historial por vehiculo");
		historialXAuto.setActionCommand(ventana.HISTXAUTO);
		historialXAuto.addActionListener(ventana);
		historialXAuto.setForeground(new Color(232, 244, 233));
		historialXAuto.setBackground(new Color(20, 25, 81));
		historialXAuto.setFont(fuente);
		add(historialXAuto);
		
		autosregistrados=new JButton("Lista de vehiculos y propietarios");
		autosregistrados.setActionCommand(ventana.AUTOSYDUEÑO);
		autosregistrados.addActionListener(ventana);
		autosregistrados.setForeground(new Color(232, 244, 233));
		autosregistrados.setBackground(new Color(20, 25, 81));
		autosregistrados.setFont(fuente);
		add(autosregistrados);
	}
}