package com.globallogic.app.interfaces;

public class Hombre implements InterfaceAnimal, Persona{

	@Override
	public void hablar() {
	System.out.println("Las personas hablan mucho");
		
	}

	@Override
	public void dormir() {
		System.out.println("El hombre duerme muchas horas");
		
	}

	@Override
	public void sonidoAnimal() {
		System.out.println("El hombre no hace sonidos de animal");
		
	}
	
	

}
