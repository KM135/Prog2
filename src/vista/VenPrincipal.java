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

	private JButton portada, taller, chat, salir;

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

		chat = new JButton("Chat");
		add(chat);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		if (grito.equals(PORTADA)) {
			VenPortada inicial = new VenPortada();
			inicial.setVisible(true);
		}

	}

}
