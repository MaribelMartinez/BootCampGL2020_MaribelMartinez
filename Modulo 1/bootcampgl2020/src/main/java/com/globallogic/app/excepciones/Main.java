package com.globallogic.app.excepciones;

public class Main {

	public static void main(String[] args) {		
		try {
			throw new Exception("Se produjo una excepción: Esto es una Excepción");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Esto se ejecuta sin importar si se presentan errores");
		}
	}
}
