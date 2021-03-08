package net.adaptaciondigital.anunciospormunicipios.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import net.adaptaciondigital.anunciospormunicipios.entities.Anuncio;
import net.adaptaciondigital.anunciospormunicipios.entities.Municipio;

public interface MunicipioRepository extends Repository<Municipio, Integer> {
	
	//@Query("SELECT ")
	@Transactional(readOnly = true)
	Municipio findById(@Param("id") Integer id);
	
	
	@Transactional(readOnly = true)
	List<Municipio> findAll();
}
