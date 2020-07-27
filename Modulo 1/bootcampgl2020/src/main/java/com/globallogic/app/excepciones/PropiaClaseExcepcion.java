package com.globallogic.app.excepciones;

public class PropiaClaseExcepcion {
	public static void main(String[] args) throws MiExcepcion {
		try {
			throw new MiExcepcion("Excepcion MiExepcion");
			
		}catch(MiExcepcion e) {
			e.mostrarCadena();
		}
	}

}
