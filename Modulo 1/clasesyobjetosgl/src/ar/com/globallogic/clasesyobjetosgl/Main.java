package ar.com.globallogic.clasesyobjetosgl;

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
		
		Integer cantidad = entrada.nextInt();
		while(cantidad > 20) {
			System.out.println("La cantidad de empleados no puede ser mayor a 20");
			cantidad = entrada.nextInt();
		}
		List<Empleado> empleados = Arrays.asList(new Empleado[cantidad]);
		
		System.out.println("Ingrese pago por horas extras");
		Empleado.setHoraExtra(entrada.nextInt());
		System.out.println("La hora extra del empleado es de:" + Empleado.getHoraExtra());

		for(Empleado empleado : empleados) {
			String nombre = entrada.nextLine();
			Double sueldo = entrada.nextDouble();
			empleado = new Empleado();
			System.out.println("Ingrese nombre del empleado");
			empleado.setNombre(nombre);
			System.out.println("Ingrese sueldo del empleado");
			empleado.setSueldoBase(sueldo);
		}
	}
		
	
}
