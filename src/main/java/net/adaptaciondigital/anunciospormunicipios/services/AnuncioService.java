package net.adaptaciondigital.anunciospormunicipios.services;

import java.util.List;

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
		Anuncio anuncio = anuncioRepository.findById(id);
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
	public Anuncio update(Anuncio entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Anuncio entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer entityId) {
		// TODO Auto-generated method stub
		
	}

}
