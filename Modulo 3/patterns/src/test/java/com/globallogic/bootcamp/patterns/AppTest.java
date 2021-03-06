package com.globallogic.bootcamp.patterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
	

	@Test
	@DisplayName("Ejercicio 1.2")
	void testSingleton() {
		assertEquals(Currency.getInstance(), Currency.getInstance());
	}

	@Test
	@DisplayName("Ejercicio 1.3")
	void testOrder() {
		Order order1 = new Order("desc1", 9.0);
		Order order2 = new Order("desc2", 10.0);
		
		assertEquals(order1.getCurrency(), order2.getCurrency());
		assertEquals(order1.getCurrency().getName(), order2.getCurrency().getName());
	}
	
	@Test
	@DisplayName("Ejercicio 1.4")
	void testPRoduct() {
		Order order1 = new Order("desc1", 9.0);
		Order order2 = new Order("desc2", 10.0);
		
		assertEquals(order1.getProduct(), order2.getProduct());
		assertEquals(order1.getProduct().getName(), order2.getProduct().getName());
		
	}
}
