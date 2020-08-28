package ar.com.gl.bootcamp.autor.autor.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.gl.bootcamp.autor.autor.service.AutorService;

@RestController
public class AutorController {
	
	private AutorService autorService;
	
	public AutorController(AutorService autorService) {
		this.autorService = autorService;
	}
	
	@GetMapping(value = "/autor")
	public ResponseEntity<Object> getAutores(){
		return new ResponseEntity<>(autorService.getAutores(), HttpStatus.OK);
	}
	

}
