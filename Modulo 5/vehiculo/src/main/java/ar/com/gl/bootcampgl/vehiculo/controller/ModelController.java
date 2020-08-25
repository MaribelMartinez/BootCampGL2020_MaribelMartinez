package ar.com.gl.bootcampgl.vehiculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ar.com.gl.bootcampgl.vehiculo.model.Modelo;
import ar.com.gl.bootcampgl.vehiculo.service.ModelService;

@Controller
public class ModelController {

	@Autowired
	ModelService modelService;
	
	@PostMapping(value = "/vehiculos/modelo")
	public ResponseEntity<Object> createModel(@RequestBody Modelo modelo){
		modelService.create(modelo);
		return new ResponseEntity<>("Vehiculo creado con exito", HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/vehiculos/modelo")
	public ResponseEntity<Object> getModel(){
		return new ResponseEntity<>(modelService.getAll(), HttpStatus.OK);
	}
}
