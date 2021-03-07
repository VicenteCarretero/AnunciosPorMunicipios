package net.adaptaciondigital.anunciospormunicipios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "anuncios")
public class Anuncio extends EntidadBase {
	
	@ManyToOne
	@JoinColumn(name = "id_persona")
	private Persona persona;
	
	@Column(name = "anuncio")
	private String anuncio;
	
	@Column(name = "categoria")
	private String categoria;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(String anuncio) {
		this.anuncio = anuncio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
