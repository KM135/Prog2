package modelo;

public class Modelo {
	
	private Taller taller;
	
	public Modelo(){
		taller = new Taller(1, "Papiperradas", "Av 15 No 119-43", 5921650);
	}
	
	public void agregarCliente(Cliente cliente) throws Exception {
		taller.agregarCliente(cliente);
	}
}
