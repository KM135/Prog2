package vista;

import java.awt.DisplayMode;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import controlador.ControladorTaller;
import modelo.Mecanico;

public class VentanaTaller extends JFrame implements ActionListener {
	/**
	 * Botones para parametrizar el sistema
	 */
	public final String CLIENTE = "CLIENTE";
	public final String AUTO = "AUTO";
	public final String MECANICO = "MECANICO";
	public final String REPARACION = "REPARACION";

	/**
	 * Botones de requerimientos funcionales
	 */
	public final String LISTAREPARACIONES = "LISTAREPARACIONES";
	public final String HISTXAUTO = "HISTXAUTO";
	public final String AUTOSYDUEÑO = "AUTOSYDUEÑO";

	/**
	 * Paneles que componen la ventana principal
	 */
	private PanelSuperior superior;
	private PanelInferior inferior;
	//private Reportes info;
	private ControladorTaller controlador;

	/**
	 * Constructor
	 * 
	 * @param pControlador
	 */
	public VentanaTaller(ControladorTaller pControlador) {

		controlador = pControlador;
		setSize(600, 500);
		setTitle("Taller Papiperradas");
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2, 1));

		superior = new PanelSuperior(this);
		add(superior);
		
		inferior = new PanelInferior();
		add(inferior);
	
//		info = new Reportes();
//		add(info);

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

		if (grito.equals(CLIENTE)) {
			// int cedula, String nombre, String direccion, int telefono
			String cedulaTxt = JOptionPane.showInputDialog("Ingrese la cedula");
			int cedula = Integer.parseInt(cedulaTxt);
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
			String direccion = JOptionPane.showInputDialog("Ingrese la direccion");
			String telefonoTXT = JOptionPane.showInputDialog("Ingrese el telefono");
			int telefono = Integer.parseInt(telefonoTXT);
			controlador.agregarCliente(cedula, nombre, direccion, telefono);
			
		}

		else if (grito.equals(AUTO)) {
			String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo");
			String nombre = JOptionPane.showInputDialog("Ingrese el numero de cedula del propietario");
			int propietario = Integer.parseInt(nombre);
			controlador.agregarAuto(placa, propietario);
		}

		else if (grito.equals(MECANICO)) {
			String cedulaTxt = JOptionPane.showInputDialog("Ingrese la cedula");
			int cedula = Integer.parseInt(cedulaTxt);
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
			String direccion = JOptionPane.showInputDialog("Ingrese la direccion");
			String telefonoTXT = JOptionPane.showInputDialog("Ingrese el telefono");
			int telefono = Integer.parseInt(telefonoTXT);
			controlador.agregarMecanico(cedula, nombre, direccion, telefono);
		}

		// int id, String fecha, String descripcion, String nombreCliente,
		// String placaAuto, int kilometraje,
		// int idMecanico, String nombreMecanico

		else if (grito.equals(REPARACION)) {
			String idTxt = JOptionPane.showInputDialog("Ingrese el id del trabajo a registrar");
			int id = Integer.parseInt(idTxt);
			String fecha = JOptionPane.showInputDialog("Ingrese la fecha");
			String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del arreglo");
			String nombreCliente = JOptionPane.showInputDialog("Nombre del cliente");
			String placaAuto = JOptionPane.showInputDialog("Ingrese la placa del vehiculo");
			String kilometrajeTXT = JOptionPane.showInputDialog("Ingrese el kilometraje");
			int kilometraje = Integer.parseInt(kilometrajeTXT);
			String nombreMecanico = JOptionPane.showInputDialog("Ingrese el nombre del mecanico");
			controlador.agregarReparacion(id, fecha, descripcion, nombreCliente, placaAuto, kilometraje,
					nombreMecanico);
		}

		else if (grito.equals(AUTOSYDUEÑO)) {
			//info.setText(controlador.dueniosAutos());
			inferior.recibirReporte(controlador.dueniosAutos());
			System.out.println(controlador.dueniosAutos());
		}
		
		else if (grito.equalsIgnoreCase(LISTAREPARACIONES)){
			//info.setText(controlador.reparaciones());
			inferior.recibirReporte(controlador.reparaciones());
			
			System.out.println(controlador.reparaciones());
		}
		
		else if (grito.equalsIgnoreCase(HISTXAUTO)) {
			String placa = JOptionPane.showInputDialog("Ingrese la placa que desea consultar");
			//info.setText(controlador.historialAuto(placa));
			inferior.recibirReporte(controlador.historialAuto(placa));
			System.out.println(controlador.historialAuto(placa));
		}
	}
}


//class prueba {
//	/**
//	 * Pasos para crear un Scroll
//	 * 1) Se requiere un Jpanel
//	 * 2) Se requiere un JtexArea
//	 * 3) Se requiere un JCrollPane
//	 * 4) Se mete el JTextArea dentro del Scroll y el Scroll dentro del panel 
//	 */
//	
//	
//	
//	JPanel panel = new JPanel ();
//	panel.setBorder(new TitledBorder(new EtchedBorder(), "Display Area"));
//
//	JTextArea textArea = new JTextArea (10,50);
//	textArea.setEditable ( false );
//
//	JScrollPane scroll = new JScrollPane ( textArea );
//	scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
//
//	panel.add ( scroll );
//
//	add(panel);
//}

