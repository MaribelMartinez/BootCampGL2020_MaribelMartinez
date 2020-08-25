package ar.com.gl.bootcampgl.vehiculo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

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

import ar.com.gl.bootcampgl.vehiculo.controller.VehiculoController;
import ar.com.gl.bootcampgl.vehiculo.model.Modelo;
import ar.com.gl.bootcampgl.vehiculo.model.TipoVehiculo;
import ar.com.gl.bootcampgl.vehiculo.model.Vehiculo;
import ar.com.gl.bootcampgl.vehiculo.service.VehiculoService;

@ExtendWith(MockitoExtension.class)
public class VehiculoServiceControllerTest {

	@Mock
	VehiculoService vehiculoService;
	
	@InjectMocks
	VehiculoController vehiculoController;
	
	Vehiculo vehiculo;
	Optional<Vehiculo> oVehiculo;
	
	TipoVehiculo tipoVehiculo;
	
	Modelo modelo;
	
	@BeforeEach
	void setUp() {
		tipoVehiculo = new TipoVehiculo();
		tipoVehiculo.setCodigo(1);
	
		modelo = new Modelo();
		modelo.setCodigo(1);
		vehiculo = new Vehiculo(90, "identification", tipoVehiculo ,modelo, new Date());
		
		oVehiculo = Optional.of(vehiculo);
	}
	
	@Test
	@DisplayName("post vehicule")
	public void postVehicule() {
		when(vehiculoService.create(vehiculo)).thenReturn(vehiculo);
		ResponseEntity<Object> response = new ResponseEntity<Object>(vehiculo, HttpStatus.CREATED);
		
		assertEquals(response, vehiculoController.createVehiculo(vehiculo));
		assertNotNull(vehiculoController.createVehiculo(vehiculo).getBody());
		assertTrue(vehiculoController.createVehiculo(vehiculo).getStatusCode().equals(HttpStatus.CREATED));
	}
	
	@Test
	@DisplayName("post vehicule")
	public void getVehicule() {
		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(vehiculo);
		vehiculos.add(vehiculo);
		
		when(vehiculoService.getVehiculos()).thenReturn(vehiculos);
		ResponseEntity<Object> response = new ResponseEntity<Object>(vehiculos, HttpStatus.OK);
		
		assertEquals(response, vehiculoController.getVehiculos());
		assertNotNull(vehiculoController.getVehiculos().getBody());
		assertTrue(vehiculoController.getVehiculos().getStatusCode().equals(HttpStatus.OK));
	}
}
