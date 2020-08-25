package ar.com.gl.bootcampgl.vehiculo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.gl.bootcampgl.vehiculo.model.TipoVehiculo;
import ar.com.gl.bootcampgl.vehiculo.repository.TipoVehiculoRepository;

@Service
public class TipoVehiculoService {

	@Autowired
	TipoVehiculoRepository tipoVehiculoRepository;
	
	public TipoVehiculo create(TipoVehiculo tipoVehiculo) {
		return tipoVehiculoRepository.save(tipoVehiculo);
	}
	
	public List<TipoVehiculo> getAll(){
		return tipoVehiculoRepository.findAll();
	}
	
	public TipoVehiculo getById(Integer id) {
		return tipoVehiculoRepository.findByCodigo(id).get();
	}
}
