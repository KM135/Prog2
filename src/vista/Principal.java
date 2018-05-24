package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import controlador.ControladorTaller;
import modelo.Cliente;
import modelo.Modelo;

public class Principal extends JFrame implements ActionListener {
	/**
	 * 
	 */
	public final String PORTADA = "PORTADA";
	public final String TALLER = "TALLER";
	public final String CHAT = "CHAT";
	public final String SALIR = "SALIR";

	private JButton portada, taller, chat, salir;
	private Modelo modelo;

	ImageIcon imagen;
	Icon icono;
	Font fuente = new Font("Arial", Font.ITALIC, 50);
	Font fuente1 = new Font("Tahoma", Font.BOLD, 50);
	Font fuente2 = new Font("Times New Roman", Font.PLAIN, 50);

	public Principal() {

		setSize(600, 300);
		setTitle("Ventana de inicio");
		setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		// setLayout(new GridLayout(2, 2, 20, 20));
		setLayout(new BorderLayout());
		setUndecorated(true);

		portada = new JButton("Portada");
		portada.setActionCommand(PORTADA);
		portada.addActionListener(this);
		portada.setForeground(new Color(17, 80, 70));
		portada.setBackground(new Color(232, 234, 243));
		portada.setFont(fuente2);
		add(portada, BorderLayout.NORTH);

		taller = new JButton("Taller Woodcod");
		taller.setActionCommand(TALLER);
		taller.addActionListener(this);
		taller.setForeground(new Color(17, 80, 70));
		taller.setBackground(Color.WHITE);
		taller.setFont(fuente1);
		add(taller, BorderLayout.CENTER);

		chat = new JButton("Chat");
		chat.setActionCommand(CHAT);
		chat.addActionListener(this);
		chat.setForeground(Color.WHITE);
		chat.setBackground(new Color(54, 98, 236));
		chat.setFont(fuente);
		add(chat, BorderLayout.WEST);

		salir = new JButton("Salir");
		salir.setActionCommand(SALIR);
		salir.addActionListener(this);
		salir.setForeground(Color.WHITE);
		salir.setBackground(new Color(255, 0, 43));
		salir.setFont(fuente2);
		add(salir, BorderLayout.SOUTH);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();

		if (grito.equals(PORTADA)) {
			Hilo miHilo = new Hilo();
			miHilo.start();
		}

		else if (grito.equals(TALLER)) {
			ControladorTaller controlador = new ControladorTaller();
		}

		else if (grito.equals(CHAT)) {
			Hilo2 miHilo2 = new Hilo2();
			miHilo2.start();
		}

		else if (grito.equals(SALIR)) {
			System.exit(0);
		}

	}
}

// imagen = new ImageIcon("IconoTaller.png");
// icono = new
// ImageIcon(imagen.getImage().getScaledInstance(taller.getWidth(),
// taller.getHeight(), Image.SCALE_DEFAULT));
// taller.setIcon(icono);
