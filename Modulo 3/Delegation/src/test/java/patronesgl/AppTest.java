package patronesgl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AppTest {
	
	private static ElectricalApplicance electricalApplicance;
	private static ElectricalOven electricalOven;
	
	@BeforeAll
	static void setUp() {
		electricalApplicance = new ElectricalApplicance();
		electricalOven = new ElectricalOven();
	}
	
	@Test
	void testElecticalAplicance() {
		electricalApplicance.turnOn();
		assertEquals(450, electricalApplicance.getPower());
		electricalOven.turnOn();
		assertEquals(425, electricalOven.getPower());
		electricalOven.turnLed();
		assertEquals(325, electricalOven.getPower());
	}
	

}
