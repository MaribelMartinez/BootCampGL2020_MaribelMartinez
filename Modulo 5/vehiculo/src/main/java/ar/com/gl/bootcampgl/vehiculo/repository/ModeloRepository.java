package ar.com.gl.bootcampgl.vehiculo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.gl.bootcampgl.vehiculo.model.Modelo;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Integer> {

	public Optional<Modelo> findByCodigo(Integer codigo);
}
