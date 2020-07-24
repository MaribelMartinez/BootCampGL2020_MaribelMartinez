package ar.com.globallogic.pilaresgl.herencia;

public class Electrodomestico {
	
	protected String marca;
	protected double peso;
	protected char consumo;
	protected String color;
	
	public Electrodomestico() {
	};
	
	public Electrodomestico(String marca, double peso, char consumo, String color) {
		this.marca = marca;
		this.peso = peso;
		this.consumo = consumo;
		this.color = color;
	}
	
	public void encender() {
	System.out.println("Encendiendo electrodomestico");
	};
	
	public void apagar() {
		System.out.println("Apagando electrodomestico");
	};
	
	protected void imprimirAtributos(String electrodomestico) {
		System.out.println("Marca de "+electrodomestico+": "+ this.marca);
		System.out.println("Peso de "+electrodomestico+": "+ this.peso);
		System.out.println("Consumo de "+electrodomestico+": "+ this.consumo);
		System.out.println("Color de "+electrodomestico+": "+this.color);
	}
	
	

}
