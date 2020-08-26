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

import hibernate.carrera.model.Carrera;
import hibernate.carrera.model.Competidor;
import hibernate.carrera.repository.CarreraRepository;
import hibernate.carrera.service.CarreraService;
import hibernate.carrera.service.CompetidorService;

@ExtendWith(MockitoExtension.class)
public class CarreraServiceTest {
	
	@Mock
	CarreraRepository carreraRepository;
	
	@Mock
	CompetidorService competidorService;
	
	@InjectMocks
	CarreraService carreraService;
	
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
	@DisplayName("create carrera")
	void tetsCreate() {
		lenient().when(carreraRepository.save(carrera)).thenReturn(carrera);
		
		Carrera carreraCreada = carreraService.create(carrera);
		assertEquals(carrera, carreraCreada);
		assertNotNull(carreraCreada);
	}
	
	
	@Test
	@DisplayName("getById")
	void getByIdTest() {
		lenient().when(carreraRepository.findById("A")).thenReturn(Optional.of(carrera));
		
		assertTrue(Optional.of(carreraService.getById("A")).isPresent());
		assertEquals(carrera, carreraService.getById("A"));
		assertNotNull(carreraService.getById("A"));
	}
	

}
