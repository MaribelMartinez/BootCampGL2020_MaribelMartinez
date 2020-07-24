package com.globallogic.pilares.abstraccion;

abstract class Automovil {
	
	abstract void retroceder();
	
	void avanzar() {
		System.out.println("Soy el metodo avanzar de Automovil");
	}

}
