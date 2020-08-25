package hibernate.carrera.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hibernate.carrera.model.Carrera;
import hibernate.carrera.model.Competidor;
import hibernate.carrera.repository.CarreraRepository;

@Service
public class CarreraService {

	@Autowired
	CarreraRepository carreraRepository;
	
	@Autowired
	CompetidorService competidorService;
	
	public Carrera create(Carrera carrera) {
		List<Competidor> competidores = new ArrayList<Competidor>();
		for(Competidor competidor : carrera.getCompetidores()) {
			competidores.add(competidorService.getById(competidor.getId()));
		}
		
		carrera.setCompetidores(competidores);
		
		return carreraRepository.save(carrera);
	}
	
	public Carrera getById(String id) {
		return carreraRepository.findById(id).get();
	}
}
