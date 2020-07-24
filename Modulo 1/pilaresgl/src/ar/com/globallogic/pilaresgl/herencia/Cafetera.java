package ar.com.globallogic.pilaresgl.herencia;

public class Cafetera extends Electrodomestico{

	private double litros;
	
	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public void elegirSabor(String sabor) {
		
	}

	public void encender() {
		System.out.println("Encendiendo cafetera");
		
	}

	public void apagar() {
		System.out.println("Apagando cafetera");
		
	}
}
