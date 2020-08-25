package hibernate.carrera.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hibernate.carrera.model.Competidor;
import hibernate.carrera.repository.CompetidorRepository;

@Service
public class CompetidorService {

	@Autowired
	CompetidorRepository competidorRepository;
	
	public Competidor create(Competidor competidor) {
		return competidorRepository.save(competidor);
	}
	
	public Competidor getById(String id) {
		return competidorRepository.findById(id).get();
	}

}
