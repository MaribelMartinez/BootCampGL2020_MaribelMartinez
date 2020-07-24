package ar.com.globallogic.pilaresgl.herencia;

public class Televisor extends Electrodomestico{

	private double pulgadas;
	private String resolucion;
	
public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

public void cambiarCanal(int canal) {
	
}

public void encender() {
	System.out.println("Encendiendo televisor");
	
}

public void apagar() {
	System.out.println("Apagando televisor");
	
}
	
}
