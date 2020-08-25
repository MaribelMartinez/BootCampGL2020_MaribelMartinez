package ar.com.gl.bootcampgl.vehiculo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.gl.bootcampgl.vehiculo.model.TipoVehiculo;

@Repository
public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer>{
	public Optional<TipoVehiculo> findByCodigo(Integer codigo);
}
