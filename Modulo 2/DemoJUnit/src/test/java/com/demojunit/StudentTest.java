package com.demojunit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class StudentTest {

	private Student student;
	
	@BeforeEach
	void setUp() {
		student = new Student("Juan Perez","39865456",24,Gender.MALE);
		student.addSubject(new Subject("BBDD1","Base de datos I",3.0));
		student.addSubject(new Subject("BBDD2","Base de datos II",2.0));
		student.addSubject(new Subject("SO","Sistemas Operativos",1.5));
	}
	
	@Test
    @DisplayName("Test Materia con menor puntaje")
	void should_returnSubjectWithLowestScore() {
		
    	//retorna la materia con el menor puntaje del estudiante 
		Subject expected = student.lowestScoreSubject();
		
		//compara si el valor esperado es igual a 1.5 que el score minimo.
		assertEquals(expected.getScore(), 1.5);
	}
    
    @Test
    @DisplayName("Test Materias desaprobadas")
    void should_returnFailedSubjects_when_ListSubjecstNotEmpty() {
    	
    	//armo la lista esperada de materias desaprobadas.
    	String[] expected = {"BBDD1","BBDD2","SO"};
    	
    	//when
    	String[] failedSubjects = 	student.failedSubjects();
    	
    	//retorna true si los elementos del array esperado son iguales a los elementos del array de materias desaprobadas 
    	assertArrayEquals(expected, failedSubjects);
    }

}
