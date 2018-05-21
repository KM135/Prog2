package modelo;

import java.util.ArrayList;

public class Modelo {
	
	private Taller taller;
	
	public Modelo(){
		taller = new Taller(1, "Papiperradas", "Av 15 No 119-43", 5921650);
	}
	
	public void agregarCliente(Cliente cliente) throws Exception {
		taller.agregarCliente(cliente);
	}
	
	public void agregarAutos(Vehiculo agregado, int cedulaCliente) throws Exception{
		taller.agregarAutoACliente(agregado, cedulaCliente);
	}
	
	public void agregarMecanicos(Mecanico agregado) throws Exception{
		taller.agregarMecanico(agregado);
	}
	
	public void registrarTrabajo(Reparacion reparacion)throws Exception{
		taller.agregarTrabajo(reparacion);
	}
}
