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

		// info = new Reportes();
		// add(info);

		setVisible(true);
	}
	
	// -------------------------------
	// ------------------------------
	// MENSAJES DE AVISO
	// ------------------------------
	// -------------------------------

	public void aviso(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Informacion", JOptionPane.PLAIN_MESSAGE);
	}

	public void error(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	// -------------------------------
	// ------------------------------
	// VALIDACIONES DE NUMERO Y TEXTO
	// ------------------------------
	// -------------------------------

	public int validarNumero(String campo){
		int retorno = 0;
		
		while(retorno==0){
			
			if (campo.equalsIgnoreCase("") || campo.matches("^[A-Za-z]*$")) {
				while(campo.equalsIgnoreCase("") || campo.matches("^[A-Za-z]*$")){
					campo = JOptionPane.showInputDialog(this, "No es un numero o el campo esta vacio",
							"Por favor ingrese los datos correctamente", JOptionPane.WARNING_MESSAGE);
				}
			}			
			if (campo.matches("[0-9]*")){
				System.out.println("Ese si es un numero!!!!");
				retorno = Integer.parseInt(campo);
			}			
		}		
		return retorno;
	}
	
	public String validarTexto(String texto) {
		String validado = "";
		if (texto.equalsIgnoreCase("") || !texto.matches("^[A-Za-z]*$")) {
			while (texto.equalsIgnoreCase("") || !texto.matches("^[A-Za-z]*$")) {
				texto = JOptionPane.showInputDialog(this, "Intente nuevamente",
						"No deje el campo en blanco o con numeros", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		if (texto.matches("^[A-Za-z]*$")) {
			validado = texto;
		}
		return texto;
	}
	
	public String validarEspacio(String texto) {
		String validado = "";
		if (texto.equalsIgnoreCase("")) {
			while (texto.equalsIgnoreCase("")) {
				texto = JOptionPane.showInputDialog(this, "Diligencie el campo por favor", "No deje el campo en blanco",
						JOptionPane.WARNING_MESSAGE);
			}
		}
		if (!texto.equalsIgnoreCase("")) {
			validado = texto;
		}
		return validado;
	}
	
	// -------------------------------
	// ------------------------------
	// ACTION PERFORMED
	// ------------------------------
	// -------------------------------

	public void actionPerformed(ActionEvent e) {

		String grito = e.getActionCommand();

		if (grito.equals(CLIENTE)) {

			String cedulaTxt = JOptionPane.showInputDialog("Ingrese la cedula");
			int cedula = validarNumero(cedulaTxt);

			String nombreAValidar = JOptionPane.showInputDialog("Ingrese el nombre");
			String nombre = validarTexto(nombreAValidar);

			String direccionAValidar = JOptionPane.showInputDialog("Ingrese la direccion");
			String direccion = validarEspacio(direccionAValidar);

			String telefonoTXT = JOptionPane.showInputDialog("Ingrese el telefono");
			int telefono = validarNumero(telefonoTXT);
			
			controlador.agregarCliente(cedula, nombre, direccion, telefono);
		}

		else if (grito.equals(AUTO)) {
			String placaAValidar = JOptionPane.showInputDialog("Ingrese la placa del vehiculo");
			String placa = validarEspacio(placaAValidar);
			
			String nombre = JOptionPane.showInputDialog("Ingrese el numero de cedula del propietario");
			int propietario = validarNumero(nombre);
			
			controlador.agregarAuto(placa, propietario);
		}

		else if (grito.equals(MECANICO)) {
			String cedulaTxt = JOptionPane.showInputDialog("Ingrese la cedula");
			int cedula = validarNumero(cedulaTxt);
			
			String nombreAValidar = JOptionPane.showInputDialog("Ingrese el nombre");
			String nombre = validarTexto(nombreAValidar);
			
			String direccionAValidar = JOptionPane.showInputDialog("Ingrese la direccion");
			String direccion = validarEspacio(direccionAValidar);
			
			String telefonoTXT = JOptionPane.showInputDialog("Ingrese el telefono");
			int telefono = validarNumero(telefonoTXT);
			
			controlador.agregarMecanico(cedula, nombre, direccion, telefono);
		}

		else if (grito.equals(REPARACION)) {
			String idTxt = JOptionPane.showInputDialog("Ingrese el id del trabajo a registrar");
			int id = validarNumero(idTxt);
			
			String fechaAValidar = JOptionPane.showInputDialog("Ingrese la fecha");
			String fecha = validarEspacio(fechaAValidar);
			
			String descripcionAValidar = JOptionPane.showInputDialog("Ingrese la descripcion del arreglo");
			String descripcion = validarEspacio(descripcionAValidar);
			
			String nombreClienteAValidar = JOptionPane.showInputDialog("Nombre del cliente");
			String nombreCliente = validarTexto(nombreClienteAValidar);
			
			String placaAutoAValidar = JOptionPane.showInputDialog("Ingrese la placa del vehiculo");
			String placaAuto = validarEspacio(placaAutoAValidar);
			
			String kilometrajeTXT = JOptionPane.showInputDialog("Ingrese el kilometraje");
			int kilometraje = validarNumero(kilometrajeTXT);
			
			String nombreMecanicoAValidar = JOptionPane.showInputDialog("Ingrese el nombre del mecanico");
			String nombreMecanico = validarTexto(nombreMecanicoAValidar);
			
			controlador.agregarReparacion(id, fecha, descripcion, nombreCliente, placaAuto, kilometraje,
					nombreMecanico);
		}

		else if (grito.equals(AUTOSYDUEÑO)) {
			inferior.recibirReporte(controlador.dueniosAutos());
			System.out.println(controlador.dueniosAutos());
		}

		else if (grito.equalsIgnoreCase(LISTAREPARACIONES)) {
			inferior.recibirReporte(controlador.reparaciones());

			System.out.println(controlador.reparaciones());
		}

		else if (grito.equalsIgnoreCase(HISTXAUTO)) {
			String placa = JOptionPane.showInputDialog("Ingrese la placa que desea consultar");
			inferior.recibirReporte(controlador.historialAuto(placa));
			System.out.println(controlador.historialAuto(placa));
		}
	}
}