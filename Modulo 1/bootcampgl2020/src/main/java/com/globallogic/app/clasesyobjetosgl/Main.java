package com.globallogic.app.clasesyobjetosgl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		List<Empleado> empleados = new ArrayList(Arrays.asList(new Empleado[cantidad]));
		Empleado empl = new Empleado();
		for(Empleado empleado : empleados) {
			empleado = new Empleado();
			System.out.println("Ingrese pago por horas extras");
			Empleado.setHoraExtra(entrada.nextInt());
			System.out.println("La hora extra del empleado es de:" + Empleado.getHoraExtra());
			System.out.println("Ingrese sueldo del empleado");
			Double sueldo = (double) entrada.nextInt();
			empleado.setSueldoBase(sueldo);
			empl = empleado;
		}
		empleados.add(empl);
		
		
	}
		
	
}
