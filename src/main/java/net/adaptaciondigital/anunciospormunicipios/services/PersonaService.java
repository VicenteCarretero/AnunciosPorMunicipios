package net.adaptaciondigital.anunciospormunicipios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.adaptaciondigital.anunciospormunicipios.entities.Persona;
import net.adaptaciondigital.anunciospormunicipios.repositories.PersonaRepository;

@Service
public class PersonaService implements IAnunciosPorMunicipiosService<Persona, Integer> {
	
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public Persona findOne(Integer id) {
		return personaRepository.findById(id);
	}

	@Override
	public List<Persona> findAll() {
		return (List) personaRepository.findAll();
	}

	@Override
	public void create(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}
	

}
