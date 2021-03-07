package net.adaptaciondigital.anunciospormunicipios.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "municipios")
public class Municipio extends Ser {
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
