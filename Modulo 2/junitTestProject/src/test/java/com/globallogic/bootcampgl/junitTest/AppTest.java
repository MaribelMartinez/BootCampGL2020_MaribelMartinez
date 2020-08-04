package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

	private String hola1;
	private String hola2;
	private String hola3;
	private Long value;
	private App app;

	@BeforeEach
	void setUp() {
		hola1 = "Hola";
		hola2 = "Hola";
		hola3 = "Hol";
		value = null;
		app = new App();
	}

	@AfterEach
	void setValue() {
		value = (long) 1;
	}

	@Test
	@DisplayName("Ejercicio 1.1")
	void test() {
		assertEquals("Test", "Test");
	}

	@Test
	@DisplayName("Ejercicio 1.2")
	void test2() {
		assertEquals(hola1, hola3);
		assertEquals(hola2, hola3);
	}

	@Test
	@DisplayName("Ejercicio 1.3")
	void test3() {
		assertTrue(25 < 12);
		assertTrue(25 > 27);
	}

	@Test
	@DisplayName("Ejercicio 1.4")
	void test4() {
		assertNotNull(value);
		value = (long) 1;
		assertNull(value);
	}

	@Test
	@DisplayName("Ejercicio 1.6")
	void test5() {
		assertEquals((Integer) 4, app.suma(2, 2));
	}
	
	@Test
	@DisplayName("Ejercicio 1.6 incorrecto")
	void test6() {
	   assertEquals((Integer) 3, app.suma(2, 2), "El resultado esta mal") ;
	}

	@Test
	@DisplayName("Ejercicio 1.7 true")
	void test7() {
		assertTrue(app.iteracion(4), "Esta variable no es true");
	}
	
	@Test
	@DisplayName("Ejercicio 1.7 false")
	void test8() {
		assertFalse(app.iteracion(3), "Esta variable no es false");
	}

}
