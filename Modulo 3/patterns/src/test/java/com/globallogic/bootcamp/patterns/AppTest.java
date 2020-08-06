package com.globallogic.bootcamp.patterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	

	@Test
	void testSingleton() {
		assertEquals(Currency.getInstance(), Currency.getInstance());
	}

}
