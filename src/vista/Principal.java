package vista;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.TitledBorder;

import controlador.ControladorTaller;
import modelo.Cliente;
import modelo.Modelo;

public class Principal extends JFrame implements ActionListener, Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final String PORTADA = "PORTADA";
	public final String TALLER = "TALLER";
	public final String CHAT = "CHAT";
	public final String SALIR = "SALIR";

	private JButton portada, taller, chat, salir;
	private Modelo modelo;

	public Principal() {

		setSize(600, 300);
		setTitle("Ventana de inicio");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2, 2, 20, 20));

		portada = new JButton("Portada");
		portada.setActionCommand(PORTADA);
		portada.addActionListener(this);
		add(portada);

		taller = new JButton("Taller");
		taller.setActionCommand(TALLER);
		taller.addActionListener(this);
		add(taller);

		chat = new JButton("Chat");
		add(chat);

		salir = new JButton("Salir");
		add(salir);

		setVisible(true);
	}
	

	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		if (grito.equals(PORTADA)) {				
			run();
		}
		
		else if(grito.equals(TALLER)){
			ControladorTaller controlador = new ControladorTaller();
		}
	}

	public void run() {
		
		try {	
//			Portada presentacion = new Portada();
//			presentacion.setVisible(true);
//			Thread.sleep(2000);
//			presentacion.dispose();
			
			Presentacion integrantes = new Presentacion();
			integrantes.setVisible(true);
			//Thread.sleep(2000);
			//integrantes.dispose();
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
}
