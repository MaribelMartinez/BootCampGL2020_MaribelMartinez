package hibernate.carrera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import hibernate.carrera.model.Carrera;
import hibernate.carrera.service.CarreraService;

@Controller
public class CarreraController {

	@Autowired
	CarreraService carreraService;

	@PostMapping(value = "/carreras")
	public ResponseEntity<Object> create(@RequestBody Carrera carrera) {
		carreraService.create(carrera);
		return new ResponseEntity<>("Carrera creada", HttpStatus.CREATED);
	}

	@GetMapping(value = "/carreras/{id}")
	public ResponseEntity<Object> getById(@PathVariable("id") String id) {
		return new ResponseEntity<>(carreraService.getById(id), HttpStatus.OK);
	}

}
