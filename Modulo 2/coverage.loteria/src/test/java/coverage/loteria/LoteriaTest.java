package coverage.loteria;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;


@ExtendWith(MockitoExtension.class)
class LoteriaTest {

	
	@Test
	void WhenJugadaThen() {
		Loteria loteria = new Loteria(100, 1000, new CartonGenerator());
		
		assertFalse(loteria.hayGanadorUnico());   // No hay ganadores por que no se jugo
		assertFalse(loteria.hayCuadrupleGanador()); 
		assertEquals(1000,loteria.getBoletos()); // Hay un total de 1000 boletos disponibles a jugarse
		assertEquals(100,loteria.getPozo());
		assertEquals(0,loteria.getGanadores());
		loteria.jugada();	

		// Es poco probable que haya ganadores
		assertEquals(0,loteria.getGanadores());
		assertFalse(loteria.hayGanadorUnico());   
		assertFalse(loteria.hayCuadrupleGanador()); 
		assertEquals(1000,loteria.getBoletos()); 
		assertEquals(100,loteria.getPozo());
	}

	@Mock
	CartonGenerator cartonGeneratorMock;
	
	@Test
	void WhenJugadaPreparadaThenOK() {
		
		Mockito.when(cartonGeneratorMock.isGanador()).thenReturn(true,false);
		
		Loteria loteria = new Loteria(100, 1000, cartonGeneratorMock);
		loteria.jugada();
		
		assertTrue(loteria.hayGanadorUnico());   
		assertFalse(loteria.hayCuadrupleGanador()); 
	}
	
	@InjectMocks
	CartonGenerator cartonGeneratorInjectMock;
	
	@Mock
	Random rand;
	
	@Test
	void WhenJugadaExcepcionalThenOK() {
		
		
		Mockito.when(rand.nextInt()).thenReturn(1,1,1,1,0);
		
		Loteria loteria = new Loteria(100, 1000, cartonGeneratorInjectMock);
		loteria.jugada();
		
		assertFalse(loteria.hayGanadorUnico());   
		assertTrue(loteria.hayCuadrupleGanador()); 
	}	
}