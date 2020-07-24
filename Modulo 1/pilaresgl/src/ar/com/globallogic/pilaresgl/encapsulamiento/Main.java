package ar.com.globallogic.pilaresgl.encapsulamiento;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("-----------------------------");
		System.out.println("EJERCICIO 5.3");
		Gato gato = new Gato();
		gato.setNombre("Negra");
		gato.setPatas(4);
		
		System.out.println("Nombre del gato: " + gato.getNombre());
		System.out.println("Cantidad de patas del gato: " + gato.getPatas());
	}

}
