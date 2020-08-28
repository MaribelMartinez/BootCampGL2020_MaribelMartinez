package ar.com.gl.bootcamp.autor.autor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.gl.bootcamp.autor.autor.model.Autor;
import ar.com.gl.bootcamp.autor.autor.repository.AutorRepository;

@Service
public class AutorService {

	private AutorRepository autorRepository;
	
	private AutorService(AutorRepository autorRepository) {
		this.autorRepository = autorRepository;
	}
	
	public Autor create(Autor autor) {
		return autorRepository.save(autor);
	}
	
	public Autor getById(Integer id) {
		return autorRepository.findById(id).get();
	}
	
	public List<Autor> getAutores(){
		return autorRepository.findAll();
	}
	
	public Autor update(Autor autor) {
		return autorRepository.save(autor);
	}
	
	public void delete(Integer id) {
		autorRepository.delete(getById(id));
	}
}
