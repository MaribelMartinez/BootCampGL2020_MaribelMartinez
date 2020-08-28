package ar.com.gl.bootcamp.autor.autor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.gl.bootcamp.autor.autor.model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer>{

}
