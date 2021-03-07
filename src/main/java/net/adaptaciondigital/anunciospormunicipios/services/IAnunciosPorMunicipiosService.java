package net.adaptaciondigital.anunciospormunicipios.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IAnunciosPorMunicipiosService<T, Id> {
	
	T findOne(Id id);
	
	List<T> findAll();
	
	void create(T entity);
	
	T update(T entity);
	
	void delete(T entity);
	
	void deleteById(Id entityId);
}
