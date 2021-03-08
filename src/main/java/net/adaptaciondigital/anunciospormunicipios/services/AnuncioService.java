package net.adaptaciondigital.anunciospormunicipios.services;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.adaptaciondigital.anunciospormunicipios.entities.Anuncio;
import net.adaptaciondigital.anunciospormunicipios.repositories.AnuncioRepository;

@Service
public class AnuncioService implements IAnunciosPorMunicipiosService<Anuncio, Integer>{
	
	@Autowired
	private AnuncioRepository anuncioRepository;

	@Override
	public Anuncio findOne(Integer id) {
		Anuncio anuncio = anuncioRepository.findOne(id);
		return anuncio;
	}

	@Override
	public List<Anuncio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Anuncio entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Anuncio entity) {
		anuncioRepository.updateAnuncio(entity.getId(), entity.getAnuncio());	
	}

	@Override
	public void delete(Anuncio entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer entityId) {
		// TODO Auto-generated method stub
		
	}

	
	public void insertAnuncio(Anuncio entity) {
		anuncioRepository.save(entity);
	}
	
}
