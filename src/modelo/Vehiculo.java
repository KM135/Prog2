package modelo;

public class Vehiculo {

	/**
	 * Atributos de la clase. Un cliente tiene autos. Es un arreglo de objetos
	 * del tipo de esta clase que se construye con la placa del vehiculo
	 */

	private String placa;

	/**
	 * Constructor
	 * 
	 * @param placa
	 */
	public Vehiculo(String placa) {
		
		this.placa = placa;
	}

	/**
	 * Getters and setters
	 * 
	 * @return
	 */

	public String getPlaca() {
		return placa;
	}
}
