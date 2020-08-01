package coverage.loteria;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import coverage.loteria.model.CartonGenerator;

public class LoteriaTest {

	private static Loteria loteria;

	@BeforeAll
	static void setUp() {
	loteria = new Loteria((float)8.0, 8, new CartonGenerator());
	}

	@Test
	void testLoteria() {
		loteria = new Loteria((float) 8.0, 8, new CartonGenerator());
	}

	@Test
	void testJugada() {
		loteria.jugada();
	}
	
	@Test
	void testGanadorUnico() {
		loteria.hayGanadorUnico();
	}
	
	@Test
	void testGanadorCuadruple() {
		loteria.hayCuadrupleGanador();
	}
	
	@Test
	void testSetPozo() {
		loteria.getPozo();
	}
	
	@Test
	void testGetPozo() {
		loteria.getPozo();
	}
	
	@Test
	void testGetBoletos() {
		loteria.getBoletos();
	}

}
