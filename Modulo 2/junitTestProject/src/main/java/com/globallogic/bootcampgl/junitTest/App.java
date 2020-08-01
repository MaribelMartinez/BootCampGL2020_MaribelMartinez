package com.globallogic.bootcampgl.junitTest;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public Integer suma(Integer num1, Integer num2) {
		return num1 + num2;
	}

	public Boolean iteracion(Integer maxValor) {
		Boolean valor = false;
		for (int i = 0; i < maxValor; i++) {
			if (maxValor == 3) {
				valor = true;
			} else {
				valor = false;
			}
		}
		return valor;
	}
}
