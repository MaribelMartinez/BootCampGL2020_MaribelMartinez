package coverage.example.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlanetTest {
	static private Planet planet;
	
	@BeforeAll
	static void setUp() {
		planet = new Planet();
	}
	
	
	@Test
	@DisplayName("setName")
	void testSetName() {
		planet.setName("Marte");
		assertEquals("Marte", planet.getName());
		
	}
	

	
	@Test
	void testToSting() {
		assertEquals("Planet [name=" + planet.getName() + "]", planet.toString());
	}
}
