package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controlador.Controlador;

public class VentanaPrincipal extends JFrame implements ActionListener {

	public final String CLIENTE = "CLIENTE";
	public final String AUTO = "AUTO";
	public final String MECANICO = "MECANICO";
	public final String REPARACION = "REPARACION";
	
	public final String LISTAREPARACIONES = "LISTAREPARACIONES";
	public final String HISTXAUTO = "HISTXAUTO";
	public final String AUTOSYDUEÑO = "AUTOSYDUEÑO";

	private PanelSuperior superior;
	private PanelInfo info;
	private Controlador controlador;
	
	public VentanaPrincipal(Controlador pControlador){
		
		controlador = pControlador;
		setSize(600, 300);
		setTitle("Taller Papiperradas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2, 1));
		
		superior = new PanelSuperior(this);
		add (superior);
		info = new PanelInfo();
		add(info);
		
		setVisible(true);
	}
	
	public void aviso(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Informacion", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void error(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String grito = e.getActionCommand();
		
//		if (grito.equals(AGREGARESTUDIANTE)) {
//			String nombre = JOptionPane.showInputDialog("Nombre del estudiante: ");
//			String apellido = JOptionPane.showInputDialog("Apellido del estudiante: ");
//			String genero = JOptionPane.showInputDialog("Genero del estudiante: ");
//			String edadTXT = JOptionPane.showInputDialog("Edad del estudiante: ");
//			int edad = Integer.parseInt(edadTXT);
//			
//			controlador.agregarEstudiante(nombre, apellido, genero, edad);
//			info.enviarInfo(nombre, apellido, genero, edad);
//		}
//		
//		else if (grito.equals(AGREGARCURSO)) {
//			String nombre = JOptionPane.showInputDialog("Nombre del curso ");
//			String creditosTXT = JOptionPane.showInputDialog("Cantidad de creditos ");
//			int creditos = Integer.parseInt(creditosTXT);
//			String notaTXT = JOptionPane.showInputDialog("Ingrese la nota ");
//			double nota = Double.parseDouble(notaTXT);
//			
//			controlador.agregarCurso(nombre, creditos, nota);
//			int cuantos = controlador.actualizarCantidad();
//			info.enviarCursos(cuantos);
//		}
//		
//		else if (grito.equals(MEJOR)) {
//			controlador.mejorCalificado();
//		}
//		
//		else if (grito.equals(PROMEDIO)){
//			controlador.promedio();
//		}
//		
//		else if(grito.equals(MENOSC)){
//			String cantidadTXT = JOptionPane.showInputDialog("Ingrese la cantidad de creditos a comparar");
//			int cantidad = Integer.parseInt(cantidadTXT);
//			controlador.darCursoMenosCreditos(cantidad);
//		}
	}	
}
