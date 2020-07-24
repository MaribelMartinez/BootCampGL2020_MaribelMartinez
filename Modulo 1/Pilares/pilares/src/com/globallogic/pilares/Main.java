package com.globallogic.pilares;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Electrodomestico electrodomestico = new Electrodomestico("marca", 10.0, 'B', "-");
			//	Electrodomestico heladera = new Heladera("marca", 1000.0, 'A', "Blanco", 10000, true, 20);
		Heladera heladera = new Heladera("marca", 1000.0, 'A', "Blanco", 10000, true, 20);
		Cafetera cafetera = new Cafetera();
		Televisor televisor = new Televisor();
		System.out.println("EJERCICIO 5.1");
		heladera.encender();
		heladera.extraerElemento("Mayonesa");
		heladera.guardarElemento("Mayonesa");
		heladera.imprimirAtributos();
		heladera.apagar();
		System.out.println("-----------------------------");
		electrodomestico.encender();
		electrodomestico.imprimirAtributos("electrodomestico");
		electrodomestico.apagar();
		
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
		electrodomesticos.add(heladera);
		electrodomesticos.add(cafetera);
		electrodomesticos.add(televisor);
		System.out.println("-----------------------------");
		System.out.println("EJERCICIO 5.2");
		for(Electrodomestico elec : electrodomesticos) {
			elec.encender();
		}
		
		System.out.println("-----------------------------");
		System.out.println("EJERCICIO 5.3");
		Gato gato = new Gato();
		gato.setNombre("Negra");
		gato.setPatas(4);
		
		System.out.println("Nombre del gato: " + gato.getNombre());
		System.out.println("Cantidad de patas del gato: " + gato.getPatas());
	}

}
