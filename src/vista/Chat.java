package vista;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Chat extends JFrame{
	
	private Image fondo = new ImageIcon("Portada-Homero.jpg").getImage();

	public Chat() {
		setSize(640, 360);
		setTitle("Chat");
		setLocationRelativeTo(null);
		setUndecorated(true);
	}

	public void paint(Graphics g) {
		g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
	}

}
