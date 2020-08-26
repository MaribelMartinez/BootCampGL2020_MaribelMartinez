package spring.carrera;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.lenient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import hibernate.carrera.controller.CarreraController;
import hibernate.carrera.model.Carrera;
import hibernate.carrera.model.Competidor;
import hibernate.carrera.service.CarreraService;

@ExtendWith(MockitoExtension.class)
public class CarreraControllerTest {

	@Mock
	CarreraService carreraService;

	@InjectMocks
	CarreraController carreraController;

	List<Competidor> competidores;
	Carrera carrera;
	Competidor competidor1;
	Competidor competidor2;
	Optional<Carrera> carreraO;

	@BeforeEach
	void setUp() {
		competidor1 = new Competidor("A", 12, "comp1");
		competidores = new ArrayList<Competidor>();
		competidores.add(competidor1);
		carrera = new Carrera("ABC", new Date(), "nombre", competidores);
	}

	@Test
	@DisplayName("postCarrea")
	void postCarrera() {

		ResponseEntity<Object> response = new ResponseEntity<Object>(carrera, HttpStatus.CREATED);

		lenient().when(carreraService.create(carrera)).thenReturn(carrera);

		assertEquals(response, carreraController.create(carrera));
		assertNotNull(carreraController.create(carrera).getBody());
		assertTrue(carreraController.create(carrera).getStatusCode().equals(HttpStatus.CREATED));
	}

	@Test
	@DisplayName("getCarrea")
	void getCarrera() {

		ResponseEntity<Object> response = new ResponseEntity<Object>(carrera, HttpStatus.OK);

		lenient().when(carreraService.getById("ABC")).thenReturn(carrera);

		assertEquals(response, carreraController.getById("ABC"));
		assertNotNull(carreraController.getById("ABC").getBody());
		assertTrue(carreraController.getById("ABC").getStatusCode().equals(HttpStatus.OK));
	}

}
