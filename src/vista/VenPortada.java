package vista;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VenPortada extends JFrame {
	
	private Image fondo;

	public VenPortada() {
		setSize(300, 300);
		setTitle("Ventana de inicio");
		setLocationRelativeTo(null);
		preInit();
		initComponents();
	}
	
	private void initComponents(){
		
	}
	
	private void preInit(){
		fondo = new ImageIcon("mia.JPG").getImage();
	}
	
	public void paint(Graphics g){
		g.drawImage(fondo,0,0,getWidth(),getHeight(),this);
	}

}
