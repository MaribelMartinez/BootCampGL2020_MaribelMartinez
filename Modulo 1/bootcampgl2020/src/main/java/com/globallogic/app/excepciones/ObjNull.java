package com.globallogic.app.excepciones;

public class ObjNull {
	private static Object obj;

	public static void main(String[] args) {
		try {
		obj = null;
		System.out.println(obj.getClass());
		}catch(NullPointerException e) {
			System.out.println("Se produjo una excepcion: null");
		}
	}

}
