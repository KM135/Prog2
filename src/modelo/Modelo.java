package modelo;

public class Modelo {
	
	private Taller taller;
	
	public Modelo(){
		taller = new Taller(1, "Papiperradas", "Av 15 No 119-43", 5921650);
	}
	
	public void agregarCliente(Cliente cliente) throws Exception {
		taller.agregarCliente(cliente);
	}
	
	public void agregarAutos(Vehiculo agregado, String nombreCliente) throws Exception{
		taller.agregarAutoACliente(agregado, nombreCliente);
	}
	
	public void agregarMecanicos(Mecanico agregado) throws Exception{
		taller.agregarMecanico(agregado);
	}
}
