package modelo;

public class Modelo {
	
	private Taller taller;
	
	public Modelo(){
		
	}
	
	public void agregarTaller(int id, String nombre, String direccion, int telefono){
		taller = new Taller(id, nombre, direccion, telefono);
	}
	
	public void agregarCliente(Cliente cliente) throws Exception{
		taller.agregarCliente(cliente);
	}

}
