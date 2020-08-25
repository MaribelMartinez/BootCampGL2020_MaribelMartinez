package hibernate.carrera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import hibernate.carrera.model.Competidor;
import hibernate.carrera.service.CompetidorService;

@Controller
public class CompetidorController {

	@Autowired
	CompetidorService competidorService;
	
	@PostMapping(value = "/competidores")
	public ResponseEntity<Object> create(@RequestBody Competidor competidor) {
		competidorService.create(competidor);
		return new ResponseEntity<>("Carrera creada", HttpStatus.CREATED);
	}
}
