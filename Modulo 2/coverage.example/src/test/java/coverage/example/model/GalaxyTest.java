package coverage.example.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GalaxyTest {
	
	@Test
	@DisplayName("Galaxy")
	void testGalaxy() {
		Galaxy galaxy = new Galaxy("galaxy1");
		assertEquals("galaxy1", galaxy.name);
	}
	

}
