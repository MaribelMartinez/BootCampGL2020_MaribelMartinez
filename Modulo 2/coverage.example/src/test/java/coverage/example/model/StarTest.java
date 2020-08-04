package coverage.example.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StarTest {
	
	private static Star star;
	private static List<Planet> planets; 
	
	@BeforeAll
	static void setUp() {
		star = new Star();
		planets = new ArrayList<Planet>();
	}

	@Test
	@DisplayName("setName")
	void testSetName() {
		star.setName("Star");
		assertEquals("Star", star.getName());
		assertNotNull(star.getName());
	}

	@Test
	@DisplayName("setPlanets")
	void testGetPlanets() {
		Planet planet = new Planet();
		planet.setName("planet1");
		planets.add(planet);
		star.setPlanets(planets);
		assertNotNull(star.getPlanets());
	}

	@Test
	@DisplayName("getColor")
	void testGetColor() {
		assertNull(star.getColor());
	}
	
	@Test
	@DisplayName("toString")
	void testToString() {
		
		assertEquals("Star [name=" + star.getName() + ", planets=" + star.getPlanets() + "]", star.toString());
		;
	}

}
