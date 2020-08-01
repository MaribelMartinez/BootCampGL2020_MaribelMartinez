package coverage.example.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StarTest {
	
	Star star = new Star();
	List<Planet> planets = new ArrayList<>();
	
	@Test
	void testStart() {
		new Star();
	}
	
	@Test
	void testToString() {
		star.toString();
	}

	@Test
	void testSetName() {
		star.setName("Star");
	}
	
	@Test
	void testGetName() {
		star.getName();
	}
	
	@Test
	void testSetPlanets() {
		star.setPlanets(planets);
	}
	
	@Test
	void testGetPlanets() {
		star.getPlanets();
	}
	
	@Test
	void testGetColor() {
		star.getColor();
	}
	
}
