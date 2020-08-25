package ar.com.gl.bootcampgl.vehiculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ar.com.gl.bootcampgl.vehiculo.model.Vehiculo;
import ar.com.gl.bootcampgl.vehiculo.service.VehiculoService;

@Controller
public class VehiculoController {

	@Autowired
	VehiculoService vehiculoService;
	
	@PostMapping(value = "/vehiculos")
	public ResponseEntity<Object> createVehiculo(@RequestBody Vehiculo vehiculo){
		vehiculoService.create(vehiculo);
		return new ResponseEntity<>("Vehiculo creado con exito", HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/vehiculos")
	public ResponseEntity<Object> getVehiculos(){
		return new ResponseEntity<>(vehiculoService.getVehiculos(), HttpStatus.OK);
	}
}
