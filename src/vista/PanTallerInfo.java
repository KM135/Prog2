package vista;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanTallerInfo extends JPanel{
	
	private JLabel id;
	private JLabel placa;
	private JLabel propietario;
	private JLabel mecanico;
	private JLabel descripcion;
	
	public PanTallerInfo(){
		
		id = new JLabel("ID: ");
		placa = new JLabel("Placa: ");
		propietario = new JLabel("Propietario: ");
		mecanico = new JLabel("Mecanico: ");
		descripcion = new JLabel("Descripcion: ");
		
		setBorder(new TitledBorder("Panel de informacion"));
		setLayout(new GridLayout(5, 1, 2, 2));
		
		add(id);
		add(placa);
		add(propietario);
		add(mecanico);
		add(descripcion);
	}
	
	public void enviarInfo(String nombre, String apellido, String genero, int edad) {
		id.setText("Nombre: " + nombre);
		placa.setText("Apellido: " + apellido);
		propietario.setText("Genero: " + genero);
		mecanico.setText("Edad: " + Integer.toString(edad));
		validate();
	}
	
	public void enviarCursos(int cantidad){
		descripcion.setText("Cursos: " + Integer.toString(cantidad));
	}
}
