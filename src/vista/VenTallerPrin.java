package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controlador.Controlador;

public class VenTallerPrin extends JFrame implements ActionListener {
	/**
	 * Botones para parametrizar el sistema
	 */
	public final String CLIENTE = "CLIENTE";
	public final String AUTO = "AUTO";
	public final String MECANICO = "MECANICO";
	public final String REPARACION = "REPARACION";

	/**
	 * Botos de requerimientos funcionales
	 */
	public final String LISTAREPARACIONES = "LISTAREPARACIONES";
	public final String HISTXAUTO = "HISTXAUTO";
	public final String AUTOSYDUEÑO = "AUTOSYDUEÑO";

	/**
	 * Panles que componen la ventana principal
	 */
	private PanTallerSup superior;
	private PanTallerInfo info;
	private Controlador controlador;

	/**
	 * Constructor
	 * 
	 * @param pControlador
	 */
	public VenTallerPrin(Controlador pControlador) {

		controlador = pControlador;
		setSize(600, 300);
		setTitle("Taller Papiperradas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2, 1));

		superior = new PanTallerSup(this);
		add(superior);
		info = new PanTallerInfo();
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
		
		//int id, String fecha, String descripcion, String nombreCliente, String placaAuto, int kilometraje,
		//int idMecanico, String nombreMecanico
		
		else if (grito.equals(REPARACION)) {
			String idTxt = JOptionPane.showInputDialog("Ingrese el id del trabajo a registrar");
			int id = Integer.parseInt(idTxt);
			String fecha = JOptionPane.showInputDialog("Ingrese la fecha");
			String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del arreglo");
			String nombreCliente = JOptionPane.showInputDialog("Nombre del cliente");
			String placaAuto = JOptionPane.showInputDialog("Ingrese la placa del vehiculo");
			String kilometrajeTXT = JOptionPane.showInputDialog("Ingrese el kilometraje");
			int kilometraje = Integer.parseInt(kilometrajeTXT);
			String idMecanicoTxt = JOptionPane.showInputDialog("Ingrese el id del mecanico que realiza el trabajo");
			int idMecanico = Integer.parseInt(idMecanicoTxt);
			String nombreMecanico = JOptionPane.showInputDialog("Ingrese el nombre del mecanico");
			controlador.agregarReparacion(id, fecha, descripcion, nombreCliente, placaAuto, kilometraje, idMecanico, nombreMecanico);
		}
	}
}
