package com.globallogic.app.excepciones;

public class Matriz {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		try {
			Integer[] array = new Integer[10];
			array[11] = 12;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Excepcion: indice de array fuera de limites");
		}
	}

}
