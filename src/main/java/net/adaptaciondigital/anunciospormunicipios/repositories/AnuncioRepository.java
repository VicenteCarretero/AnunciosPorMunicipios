package net.adaptaciondigital.anunciospormunicipios.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import net.adaptaciondigital.anunciospormunicipios.entities.Anuncio;
import net.adaptaciondigital.anunciospormunicipios.entities.Persona;

public interface AnuncioRepository extends JpaRepository<Anuncio, Integer> {
	
	
	@Query("select a from Anuncio a where a.id = :id")
	@Transactional(readOnly = true)
	Anuncio findOne(@Param("id") Integer id);
	
	
	@Transactional(readOnly = true)
	List<Anuncio> findAll();
	
	@Transactional
	@Modifying
	@Query("update Anuncio a set a.anuncio = :anuncio where a.id = :id")
	void updateAnuncio(@Param("id") Integer id, @Param("anuncio") String anuncio);
	
	/*@Transactional
	@Modifying
	@Query("insert into Anuncio :anuncio")
	void insertAnuncio(@Param("anuncio") Anuncio anuncio);*/
	
	@Query("select p from Persona p where p.nombre = 'Evaristo'")
	Persona probarAnuncio(@Param("id") Integer id, @Param("anuncio") String anuncio);
	
	
}
