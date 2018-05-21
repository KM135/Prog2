package vista;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Presentacion extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JLabel integrantes,universidad,programa,asignatura,año;
	
	public Presentacion()
	{
		
		setSize(350, 250);
		setTitle("Ventana de inicio");
		setLocationRelativeTo(null);
		setLayout(null);
		setLocationRelativeTo(null);
		
		
		universidad =new JLabel("Universidad El Bosque");
		universidad.setBounds(50, 20, 500, 80);
		Font auxFont=universidad.getFont(); 
		universidad.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
		this.add(universidad);
		
		integrantes =new JLabel("Julio Diaz - Camilo Cruz");
		integrantes.setBounds(50, 50, 500, 80);
		Font auxFont1=integrantes.getFont(); 
		integrantes.setFont(new Font(auxFont1.getFontName(), auxFont.getStyle(), 20));
		this.add(integrantes);
		
		programa =new JLabel("Ingenieria de sistemas");
		programa.setBounds(50,70, 500, 80);
		Font auxFont2=programa.getFont(); 
		programa.setFont(new Font(auxFont2.getFontName(), auxFont.getStyle(), 20));
		this.add(programa);
		
		asignatura =new JLabel("Programación 1");
		asignatura.setBounds(50,90, 500, 80);
		Font auxFont3=asignatura.getFont(); 
		asignatura.setFont(new Font(auxFont3.getFontName(), auxFont.getStyle(), 20));
		this.add(asignatura);
		
		año =new JLabel("2018-1");
		año.setBounds(50,110, 500, 80);
		Font auxFont4=año.getFont(); 
		año.setFont(new Font(auxFont4.getFontName(), auxFont.getStyle(), 20));
		this.add(año);
	}
}
