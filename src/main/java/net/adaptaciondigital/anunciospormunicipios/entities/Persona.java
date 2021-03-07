package net.adaptaciondigital.anunciospormunicipios.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="personas")
public class Persona extends Ser {
	
	@OneToOne(cascade = CascadeType.ALL)
	private Municipio municipio;

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	
}
