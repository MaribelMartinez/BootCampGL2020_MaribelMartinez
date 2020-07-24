package com.globallogic.pilares;

public class Heladera extends Electrodomestico{
	
	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;
	
	public Heladera(String marca, double peso, char consumo, String color, double capacidad, boolean tieneFreezer, double capacidadFreezer) {
		super(marca, peso, consumo, color);
		this.capacidad = capacidad;
		this.tieneFreezer = tieneFreezer;
		this.capacidadFreezer = capacidadFreezer;
		
	}
	
	public void imprimirAtributos() {
		super.imprimirAtributos("heladera");
		System.out.println("Capacidad de la heladera: "+capacidad);
		if(this.tieneFreezer) {
			System.out.println("La heladera tiene freezer");
			System.out.println("Capacidad del freezer: "+ this.capacidadFreezer);
		}else {
			System.out.println("La heladera no tiene freezer");
		}
	}
	public void guardarElemento(String elemento) {
		System.out.println("Guardando "+elemento+" en Heladera");
	}
	
	public void extraerElemento(String elemento) {
		System.out.println("Extrayendo "+elemento+" en Heladera");
	}

	public void encender() {
		System.out.println("Encendiendo heladera");
		
	}

	public void apagar() {
		System.out.println("Apagando heladera");
		
	}
}
