package ar.com.gl.bootcampgl.vehiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.gl.bootcampgl.vehiculo.model.Vehiculo;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer>{

}
