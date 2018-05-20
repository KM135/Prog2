package vista;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class VenPrincipal extends JFrame implements ActionListener {

	public final String PORTADA = "PORTADA";
	public final String TALLER = "TALLER";
	public final String CHAT = "CHAT";
	public final String SALIR = "SALIR";

	private JButton portada, taller, chat, salir;
	private Controlador controlador;

	public VenPrincipal() {

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
		add(taller);

		chat = new JButton("Chat");
		add(chat);

		salir = new JButton("Salir");
		add(salir);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		if (grito.equals(PORTADA)) {
			VenPortada inicial = new VenPortada();
			inicial.setVisible(true);
		}
		
		else if(grito.equals(TALLER)){
			VenTallerPrin iniTaller = new VenTallerPrin(controlador);
			iniTaller.setVisible(true);
		}
		

	}

}
