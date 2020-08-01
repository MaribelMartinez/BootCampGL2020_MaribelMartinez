package coverage.example.model;

import org.junit.jupiter.api.Test;

public class PlanetTest {
	Planet planet = new Planet();
	@Test
	void testPlanet() {
		new Planet();
	}
	
	@Test
	void testToSting() {
		planet.toString();
	}
	
	@Test
	void testSetName() {
		planet.setName("Marte");
	}
	
	@Test
	void testGetName() {
		planet.getName();
	}
}
