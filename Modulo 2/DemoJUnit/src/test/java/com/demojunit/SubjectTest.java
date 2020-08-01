package com.demojunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SubjectTest {

	private Subject subject;
	private Subject subject2;
	private Subject subjectNull;
	
	@BeforeAll
	static void beforeAll(){
		System.out.println("Antes de todos los Test");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Despues de todos los test");	
	}	
	
	@BeforeEach
	void setUp() {
		subject = new Subject("M1","MatI",6.0);
		subject2 = new Subject("M2","MatII",4.0);
		subjectNull = new Subject();
	}
	@Test
	@DisplayName("Test de Materia")
	void should_returnTrue_when_SubjectIsPassed() {
		
		//retorna true para el curso con puntaje > 4
		assertTrue(subject.isPassed());
		
		//lo mismo pero usando un assertEquals
		assertEquals(true, subject.isPassed());
		
		//retorna false para el curso con puntaje < 4
		assertFalse(subject2.isPassed());
		
		//retorna true si alguno de los elementos de la clase Subject es vacio
		assertNull(subjectNull.getName());
		
		//retorna true si el atributo name de la clase subject esta inicializado
		assertNotNull(subject.getName());
	
	}

}
