package com.api.cliente.cliente.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.cliente.cliente.model.Cliente;
import com.api.cliente.cliente.service.ClienteService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
//@Api(value = "Cliente Controller")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@ApiOperation(value = "create cliente", response = Cliente.class)
	@PostMapping(value="/clientes")
	public EntityModel<Cliente> create(@RequestBody Cliente cliente){
		Cliente cli = clienteService.update(cliente);
		Link link = WebMvcLinkBuilder
				.linkTo(Cliente.class).slash("clientes/"+cli.getDNI()).withSelfRel();
;
		EntityModel<Cliente> resource = new EntityModel<Cliente>(cli);
		resource.add(link);
	
		//cliente.add(Link.valueOf("http://localhost:8080"+cliente.getDNI()));
		
		return resource;
	//	return new ResponseEntity<>(resource, HttpStatus.CREATED);
		
	}
	
	
	@ApiOperation(value = "return cliente by id", response = Cliente.class)
	@GetMapping(value = "/clientes/{id}")
	public EntityModel<Cliente> get(@PathVariable("id") Integer id){
		Cliente cli = clienteService.getCliente(id);
		Link link = WebMvcLinkBuilder
				.linkTo(Cliente.class).slash("clientes/"+cli.getDNI()).withSelfRel();
;
		EntityModel<Cliente> resource = new EntityModel<Cliente>(cli);
		resource.add(link);
		return resource;
	}
	
	@ApiOperation(value = "return all clientes", response = Cliente.class, responseContainer = "List")
	@GetMapping(value="/clientes")
	public ResponseEntity<List<EntityModel<Cliente>>> getAll(){
		List<EntityModel<Cliente>> resources = new ArrayList<EntityModel<Cliente>>();
		for(Cliente cliente : clienteService.getClientes()) {
			Link link = WebMvcLinkBuilder
					.linkTo(Cliente.class).slash("clientes/"+cliente.getDNI()).withSelfRel();
			EntityModel<Cliente> resource = new EntityModel<Cliente>(cliente);
			resource.add(link);
			resources.add(resource);
		}		
		return new ResponseEntity<>(resources, HttpStatus.OK);
	}
	
	@ApiOperation(value = "update cliente", response = Cliente.class)
	@PutMapping(value="/clientes")
	public EntityModel<Cliente> update(@RequestBody Cliente cliente){
		Cliente cli = clienteService.update(cliente);
		Link link = WebMvcLinkBuilder
				.linkTo(Cliente.class).slash("clientes/"+cli.getDNI()).withSelfRel();
;
		EntityModel<Cliente> resource = new EntityModel<Cliente>(cli);
		resource.add(link);
		return resource;
	}
	
	@ApiResponses(value = {@ApiResponse(code=200,message = "Cliente borrado con exito")})
	@DeleteMapping(value="/clientes/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") Integer id){
		clienteService.delete(id);
		return new ResponseEntity<>("Cliente borrado con exito", HttpStatus.OK);
	}
	
}

