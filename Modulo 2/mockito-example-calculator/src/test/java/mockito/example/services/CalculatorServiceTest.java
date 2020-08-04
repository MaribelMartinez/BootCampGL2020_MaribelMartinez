/**
 * 
 */
package mockito.example.services;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

	private Integer input1;
	private Integer input2;
	int[] numeros;

	@Mock
	BasicOperationsService basicOperationsService;

	@InjectMocks
	CalculatorServiceImpl calculatorServiceImpl;

	@BeforeEach
	void setUp() {
		input1 = 2;
		input2 = 3;
		numeros = new int[] { 1, 2, 3, 4, 5 };
	}

	@Test
	@DisplayName("Ejercicio 3.3")
	void metodosBasicos() {
		when(basicOperationsService.add(input1, input2)).thenReturn(5.0);
		assertEquals(5.0, calculatorServiceImpl.calculateSum(input1, input2));

		when(basicOperationsService.subtract(input1, input2)).thenReturn(-1.0);
		assertEquals(-1.0, calculatorServiceImpl.calculateSubstraction(input1, input2));

		when(basicOperationsService.multiply(input1, input2)).thenReturn(6.0);
		assertEquals(6.0, calculatorServiceImpl.calculateMultiplication(input1, input2));

		when(basicOperationsService.divide(input1, input2)).thenReturn(0.666);
		assertEquals(0.666, calculatorServiceImpl.calculateDivision(input1, input2));
	}

	@Mock
	DataService dataService;

	@Test
	@DisplayName("Ejercicio 3.4")
	void calculoDataService() {

		when(dataService.getListOfNumbers()).thenReturn(numeros);
		assertEquals(3, calculatorServiceImpl.calculateAverage());
	}

	@Test
	@DisplayName("Ejercicio 3.5")
	void calculoDataService2() {
		when(dataService.getListOfNumbers()).thenReturn(null);
		assertThrows(NullPointerException.class, () -> calculatorServiceImpl.calculateAverage());
	}

	/*
	 * @Test
	 * 
	 * @DisplayName("Ejercicio 3.6") void calculoDataService3() {
	 * when(basicOperationsService.divide(1, 0)).thenThrow(new
	 * ZeroDivisionException("No se puede dividir por 0"));
	 * assertThrows(ZeroDivisionException.class, () ->
	 * calculatorServiceImpl.calculateDivision(1, 0)); }
	 */

	@Test
	@DisplayName("Ejercicio 3.7")
	void calculoDataService4() {
		when(basicOperationsService.add(input1, input2)).thenReturn(5.0);
		assertEquals("El resultado es: 5.0",
				calculatorServiceImpl.printResult(calculatorServiceImpl.calculateSum(input1, input2)));
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3 })
	void calculoDataService6(int numero) {
		assertTrue(calculatorServiceImpl.isOdd(numero));
	}

	@Spy
	BasicOperationsService basicOperationsServiceSpy;

	@Test
	@DisplayName("Ejercicio 3.9")
	void calculoDataService7() {
		basicOperationsServiceSpy.add(input1, input2);
		Mockito.verify(basicOperationsServiceSpy, times(1)).add(input1, input2);
	}

	@Spy
	DataService dataServiceSpy;

	@Test
	@DisplayName("Ejercicio 3.10")
	void calculoDataService8() {
		int[] num = { 1, 2, 3, 4 };
		int[] num2 = { 1, 2, 3 };
		calculatorServiceImpl.setListOfNumbers(num2);
		Mockito.when(dataServiceSpy.getListOfNumbers()).thenReturn(num);
		assertEquals(4, dataServiceSpy.getListOfNumbers().length);
		Mockito.verify(dataServiceSpy, times(1)).getListOfNumbers();
	}
}
