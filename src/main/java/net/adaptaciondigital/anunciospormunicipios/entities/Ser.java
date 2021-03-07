package net.adaptaciondigital.anunciospormunicipios.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;



@MappedSuperclass
public class Ser extends EntidadBase {
	
	@Column(name = "nombre")
	@NotEmpty
	protected String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
