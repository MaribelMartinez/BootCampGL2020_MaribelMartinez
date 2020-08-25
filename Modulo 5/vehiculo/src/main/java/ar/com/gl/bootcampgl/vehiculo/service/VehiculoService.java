package ar.com.gl.bootcampgl.vehiculo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.gl.bootcampgl.vehiculo.model.Vehiculo;
import ar.com.gl.bootcampgl.vehiculo.repository.VehiculoRepository;

@Service
public class VehiculoService {
	
	@Autowired
	VehiculoRepository vehiculoRepository;
	
	@Autowired
	ModelService modelService;
	
	@Autowired
	TipoVehiculoService tipoVehiculoService;
	
	public Vehiculo create(Vehiculo vehiculo) {
		vehiculo.setModelo(modelService.getById(vehiculo.getModelo().getCodigo()));
		vehiculo.setTipo(tipoVehiculoService.getById(vehiculo.getTipo().getCodigo()));	
		
		return vehiculoRepository.save(vehiculo);
	}
	
	public List<Vehiculo> getVehiculos(){
		return vehiculoRepository.findAll();
	}

}
