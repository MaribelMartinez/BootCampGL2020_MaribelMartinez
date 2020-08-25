package ar.com.gl.bootcampgl.vehiculo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.gl.bootcampgl.vehiculo.model.Modelo;
import ar.com.gl.bootcampgl.vehiculo.repository.ModeloRepository;

@Service
public class ModelService {

	@Autowired
	ModeloRepository modelRepository;
	
	public Modelo create(Modelo modelo) {
		return modelRepository.save(modelo);
	}
	
	public List<Modelo> getAll(){
		return modelRepository.findAll();
	}
	
	public Modelo getById(Integer id) {
		return modelRepository.findByCodigo(id).get();
	}
}
