package com.api.cliente.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.cliente.cliente.model.Cliente;
import com.api.cliente.cliente.service.ClienteService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
//@Api(value = "Cliente Controller")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
//	@ApiOperation(value = "create cliente", response = Cliente.class)
	@PostMapping(value="/clientes")
	public ResponseEntity<Object> create(@RequestBody Cliente cliente){
		return new ResponseEntity<>(clienteService.create(cliente), HttpStatus.CREATED);
	}
	
	//@ApiOperation(value = "return cliente by id", response = Cliente.class)
	@GetMapping(value = "/clientes/{id}")
	public ResponseEntity<Object> get(@PathVariable("id") Integer id){
		return new ResponseEntity<>(clienteService.getCliente(id), HttpStatus.OK);
	}
	
	//@ApiOperation(value = "return all clientes", response = Cliente.class, responseContainer = "List")
	@GetMapping(value="/clientes")
	public ResponseEntity<Object> getAll(){
		return new ResponseEntity<>(clienteService.getClientes(), HttpStatus.OK);
	}
	
	//@ApiOperation(value = "update cliente", response = Cliente.class)
	@PutMapping(value="/clientes")
	public ResponseEntity<Object> update(@RequestBody Cliente cliente){
		return new ResponseEntity<>(clienteService.update(cliente), HttpStatus.OK);
	}
	
	//@ApiResponses(value = {@ApiResponse(code=200,message = "Cliente borrado con exito")})
	@DeleteMapping(value="/clientes/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") Integer id){
		clienteService.delete(id);
		return new ResponseEntity<>("Cliente borrado con exito", HttpStatus.OK);
	}
	
}

