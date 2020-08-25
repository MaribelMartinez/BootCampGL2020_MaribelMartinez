package hibernate.carrera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hibernate.carrera.model.Competidor;

@Repository
public interface CompetidorRepository extends JpaRepository<Competidor, String>{

}
