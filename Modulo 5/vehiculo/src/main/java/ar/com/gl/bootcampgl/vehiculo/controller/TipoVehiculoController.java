package ar.com.gl.bootcampgl.vehiculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ar.com.gl.bootcampgl.vehiculo.model.TipoVehiculo;
import ar.com.gl.bootcampgl.vehiculo.service.TipoVehiculoService;

@Controller
public class TipoVehiculoController {

	@Autowired
	TipoVehiculoService tipoVehiculoService;
	
	@PostMapping(value = "/vehiculos/tipo")
	public ResponseEntity<Object> createModel(@RequestBody TipoVehiculo tipoVehiculo){
		tipoVehiculoService.create(tipoVehiculo);
		return new ResponseEntity<>("Vehiculo creado con exito", HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/vehiculos/tipo")
	public ResponseEntity<Object> getModel(){
		return new ResponseEntity<>(tipoVehiculoService.getAll(), HttpStatus.OK);
	}
}
