package com.globallogic.app.excepciones;

public class MiExcepcion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MiExcepcion(String mensaje) {
		super(mensaje);
	}
	
	public void mostrarCadena() {
		System.out.println(super.getMessage());
	}
}
