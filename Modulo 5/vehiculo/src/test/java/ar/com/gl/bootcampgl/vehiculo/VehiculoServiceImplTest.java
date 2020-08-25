package ar.com.gl.bootcampgl.vehiculo;

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

import ar.com.gl.bootcampgl.vehiculo.model.Modelo;
import ar.com.gl.bootcampgl.vehiculo.model.TipoVehiculo;
import ar.com.gl.bootcampgl.vehiculo.model.Vehiculo;
import ar.com.gl.bootcampgl.vehiculo.repository.VehiculoRepository;
import ar.com.gl.bootcampgl.vehiculo.service.ModelService;
import ar.com.gl.bootcampgl.vehiculo.service.TipoVehiculoService;
import ar.com.gl.bootcampgl.vehiculo.service.VehiculoService;

@ExtendWith(MockitoExtension.class)
public class VehiculoServiceImplTest {

	@Mock
	VehiculoRepository vehiculoRepository;
	
	@Mock
	ModelService modelService;
	
	@Mock
	TipoVehiculoService tipoVehiculoService;
	
	@InjectMocks
	VehiculoService vehiculoService;
	
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
	@DisplayName("create_vehicle")
	public void createVehicle() {
		
		lenient().when(vehiculoRepository.save(vehiculo)).thenReturn(vehiculo);
		lenient().when(vehiculoRepository.findByCodigo(90)).thenReturn(oVehiculo);
		
		lenient().when(modelService.create(modelo)).thenReturn(modelo);
		lenient().when(tipoVehiculoService.create(tipoVehiculo)).thenReturn(tipoVehiculo);
		
		Vehiculo vehiculoCreado = vehiculoService.create(vehiculo);
		
		assertTrue(vehiculoService.getVehiculoById(90).isPresent());
		assertEquals(vehiculo, vehiculoCreado);
		assertNotNull(vehiculoCreado);
	}
	
	@Test
	@DisplayName("get_vehiculos")
	public void getVehicle() {
		
		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(vehiculo);
		vehiculos.add(vehiculo);
		
		lenient().when(vehiculoRepository.findAll()).thenReturn(vehiculos);
		
		assertTrue(vehiculoService.getVehiculos().size() == 2);
		assertEquals(vehiculos, vehiculoService.getVehiculos());
		assertNotNull(vehiculoService.getVehiculos());
		
	}
}
