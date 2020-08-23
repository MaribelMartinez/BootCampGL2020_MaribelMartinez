package com.globallogic.app.clasesyobjetosgl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Empleado empleado = new Empleado(37964794);
		empleado.setNombre("Lucas");
		empleado.setApellido("Guerrero Arjona");
		
		empleado.setID("12345678A");
		 empleado.setSueldoBase(1150.0);
		 empleado.setHorasExtra(4);
		 empleado.setRetenciones(15.0);
		 empleado.setCasado(true);
		 empleado.setNumeroHijos(2);
		
		System.out.println(empleado);
		
	listaEmpleados();
		
	}
		
	public static void listaEmpleados() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresar cantidad de empleados:");
		Integer cantidad = entrada.nextInt();
		while(cantidad > 20 || cantidad < 1) {
			System.out.println("La cantidad debe ser entre 1 y 20");
			cantidad = entrada.nextInt();
		}
		ArrayList<Empleado> empleados = new ArrayList<Empleado>(Arrays.asList(new Empleado[cantidad]));
		ArrayList<Empleado> empl = new ArrayList<Empleado>();
		System.out.println("Ingrese pago por horas extras");
		Empleado.setHoraExtra(entrada.nextInt());
		System.out.println("La hora extra del empleado es de: " + Empleado.getHoraExtra());
		for(Empleado empleado : empleados) {
			empleado = new Empleado();
			System.out.println("Ingrese nombre del empleado");
			String nombre = entrada.next();
			empleado.setNombre(nombre);
			System.out.println("Ingrese sueldo del empleado " + nombre);
			Double sueldo = (double) entrada.nextInt();
			empleado.setSueldoBase(sueldo);
			System.out.println("Ingrese horas extras del empleado" + nombre);
			Integer horasExtras = entrada.nextInt();
			empleado.setHorasExtra(horasExtras);
			empleado.calculoHoraExtra();
			empleado.setCasado(false);
			empleado.setNumeroHijos(0);
			empleado.setRetenciones(0.0);
			empl.add(empleado);
			
		}
		empleados = empl;
		entrada.close();
		 empleados.sort(
			      (Empleado empl1, Empleado empl2) -> empl1.sueldoBruto().
			      compareTo(empl2.sueldoBruto()));
		 //Empleado que mas cobra
		  System.out.println("Empleado que mas cobra: "+empleados.get(cantidad-1));
		  //Empleado que menos cobra
		  System.out.println("Empleado que menos cobra: "+empleados.get(0));
		
		//Ordenados por sueldo		
			  System.out.println("Empleados ordenados por sueldo de menor a mayor \n"+empleados);
			  
			  empleados.sort(
				      (Empleado empl1, Empleado empl2) -> empl1.calculoHoraExtra().
				      compareTo(empl2.calculoHoraExtra()));
		//Empleado que cobra mas por hora extra
		  System.out.println("Empleado que mas cobra por hora extra: "+empleados.get(cantidad-1));
		//Empleado que cobra menos por hora extra
		  System.out.println("Empleado que menos cobra por hora extra: "+empleados.get(0));
			
		
	}
	
	
	
		
	
}
