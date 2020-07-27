package com.globallogic.app.interfaces;

public class MainAnimal {
	public static void main(String[] args) {
		//Ejercicio 7.1
		Perro dog = new Perro();
		
		dog.dormir();
		dog.sonidoAnimal();
		
		//Ejercicio 7.2
		InterfaceAnimal animal = new Perro();
		
		animal.come("perro");
		InterfaceAnimal.camina("perro");
		
		//Ejercicio 7.3
		Hombre hombre = new Hombre();
		hombre.dormir();
		hombre.hablar();
		hombre.sonidoAnimal();
		
	}

}
