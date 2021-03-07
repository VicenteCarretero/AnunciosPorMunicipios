package net.adaptaciondigital.anunciospormunicipios.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import net.adaptaciondigital.anunciospormunicipios.entities.Anuncio;

public interface AnuncioRepository extends Repository<Anuncio, Integer>{
	
	@Query("select a from Anuncio a where a.id = :id")
	@Transactional(readOnly = true)
	Anuncio findById(@Param("id") Integer id);
	
	
	@Transactional(readOnly = true)
	List<Anuncio> findAll();
}
