package patronesgl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
	
	private LedAppliance ledAppliance;
	private ElectricalOven electricalOven;
	
	@BeforeEach
	void setUp() {
		ledAppliance = new LedAppliance();
		electricalOven = new ElectricalOven(ledAppliance);
	}
	
	@Test
	void testcreateOven() {
		assertEquals(500, electricalOven.getPower());	
	}
	
	@Test
	void testTurnOnOven() {
		electricalOven.turnOn();
		assertEquals(425, electricalOven.getPower());
	}
	
	@Test
	void testElecticalAplicance() {
		electricalOven.turnOn();
		electricalOven.turnLed();
		assertEquals(325, electricalOven.getPower());
	}
	

}
