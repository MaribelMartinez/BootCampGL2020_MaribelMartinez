package ar.com.globallogic.controlflujosgl;

import java.util.ArrayList;
import java.util.Arrays;

public class ControlFlujo {

	int valor1 = 3;
	int valor2 = 10;
	public static void main(String[] args) {
		//Ejercicios IF
		ControlFlujo controlFlujo = new ControlFlujo();
		controlFlujo.sumar();
		controlFlujo.mayuscula();
		controlFlujo.descuento(400.0);
		
		//Ejercicios FOR
		controlFlujo.ejercicioFor();
		
		//Ejercicios WHILE
		controlFlujo.ejercicioWhile();
		
		//Ejercicios ForEach
		controlFlujo.ejercicioForEach();
	}
	//Ejercicios IF
	//4.1
	void sumar() {
	int suma = valor1 + valor2;
	
	if(suma <= 10) {
		System.out.println("La suma de los números es:" + suma);
	}else {
		System.out.println("La suma de los números es mayor a 10");
	}
	}
	//4.2
	void mayuscula() {	
	String a = "A";
	String b = "B";
	if(a.equals(a.toUpperCase()) || b.equals(b.toUpperCase())) {
		System.out.println("Es una letra mayuscula");
	}else {
		System.out.println("No es una letra mayuscula");
	}
	
	}
	
	//4.3
	void descuento(double compra) {
		double descuento= 0;
		if(compra == 300.0) {
			descuento = compra*0.2;
		}
		if(compra > 350.0) {
			descuento = compra*0.25;
		}
		
		if(descuento != 0) {
			System.out.println("El descuento es de "+ descuento);
		}else {
			System.out.println("Sin descuentos, el total es "+ compra);
		}
		
	}
	
	//Ejercicios FOR
	
	void ejercicioFor() {
		//4.4
		for(int i = 1; i <=10; i++) {
			System.out.println("Valor iterado "+ i);
		}
		//4.5
		
	int j = 0;
	for(int i = 0; i <=10000; i++) {
		if(i % 20 == 0) {
			j = j+1;
		}
		//System.out.println("Contador "+j);
	}
	//4.6
	ArrayList<String> dias = new ArrayList<String>(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"));

	for(int i = 0; i< dias.size(); i++) {
		System.out.println("Dia de la semana: "+ dias.get(i));
	}

	}
	//Ejercicios WHILE
	void ejercicioWhile(){
		//4.7
		int k =1;
		while(k<=10) {
			System.out.println("Valor iterado: "+k);
			++k;
		}
		
		//4.8
		int l = 1;
		while(l<=50) {
			if(l%2 ==0) {
				System.out.println("Valor iterado "+l+ " par");
			}else {
				System.out.println("Valor iterado "+l+ " impar");
			}
			++l;
		}
	}
	
	//Ejercicios FOR EACH
	void ejercicioForEach() {
		//4.9
		ArrayList<Integer> numeros= new ArrayList<>();
		Integer valor = 1;
		while(valor<=10) {
			numeros.add(valor);
			++valor;
		}
		for(Integer num : numeros) {
			Integer i = num;
			System.out.println("Valor iterado: "+i);
		}
		
		//4.10
		ArrayList<String> dias = new ArrayList<String>(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"));
		for(String dia : dias) {
			System.out.println("Dia de la semana:" + dia);
		}

		//4.11
		String bootCamp = "BootCamp 2020";
		for(char letra : bootCamp.toCharArray()) {
			System.out.println("Letra: "+letra);
			
		}
	}
	
}
