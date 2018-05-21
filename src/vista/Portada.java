package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Portada extends JFrame {

	private Image fondo = new ImageIcon("Portada.jpg").getImage();

	public Portada() {
		setSize(640, 360);
		setTitle("Portada");
		setLocationRelativeTo(null);
	}

	public void paint(Graphics g) {
		g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
	}

}
