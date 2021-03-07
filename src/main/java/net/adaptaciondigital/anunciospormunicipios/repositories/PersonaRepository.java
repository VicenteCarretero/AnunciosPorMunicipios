package net.adaptaciondigital.anunciospormunicipios.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import net.adaptaciondigital.anunciospormunicipios.entities.Persona;

public interface PersonaRepository extends Repository<Persona, Integer> {
	
	//@Query("SELECT ")
	@Transactional(readOnly = true)
	Persona findById(@Param("id") Integer id);
	
	
	@Transactional(readOnly = true)
	Collection<Persona> findAll();	
}
