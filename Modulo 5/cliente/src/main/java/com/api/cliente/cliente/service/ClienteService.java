package com.api.cliente.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.cliente.cliente.model.Cliente;
import com.api.cliente.cliente.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	ClienteRepository clienteRepository;

	
	public Cliente create(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente getCliente(Integer id) {
		return clienteRepository.findById(id).get();
	}
	
	public List<Cliente> getClientes() {
		return clienteRepository.findAll();
	}
	
	public Cliente update(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public void delete(Integer id) {
		clienteRepository.delete(getCliente(id));
	}
}
