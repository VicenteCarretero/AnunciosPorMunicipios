package net.adaptaciondigital.anunciospormunicipios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.adaptaciondigital.anunciospormunicipios.entities.Municipio;
import net.adaptaciondigital.anunciospormunicipios.repositories.MunicipioRepository;

@Service
public class MunicipioService implements IAnunciosPorMunicipiosService<Municipio, Integer>{

	@Autowired
	private MunicipioRepository municipioRepository;
	
	@Override
	public Municipio findOne(Integer id) {
		return (Municipio) municipioRepository.findById(id);
	}

	@Override
	public List<Municipio> findAll() {
		return (List) municipioRepository.findAll();
	}

	@Override
	public void create(Municipio entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Municipio entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Municipio entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer entityId) {
		// TODO Auto-generated method stub
		
	}

}
