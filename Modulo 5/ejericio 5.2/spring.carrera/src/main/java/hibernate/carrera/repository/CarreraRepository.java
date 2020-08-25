package hibernate.carrera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hibernate.carrera.model.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, String>{

}
