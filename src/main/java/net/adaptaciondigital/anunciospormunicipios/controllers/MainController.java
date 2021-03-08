package net.adaptaciondigital.anunciospormunicipios.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.adaptaciondigital.anunciospormunicipios.entities.Anuncio;
import net.adaptaciondigital.anunciospormunicipios.entities.Persona;
import net.adaptaciondigital.anunciospormunicipios.repositories.AnuncioRepository;
import net.adaptaciondigital.anunciospormunicipios.services.AnuncioService;
import net.adaptaciondigital.anunciospormunicipios.services.PersonaService;

@Controller
public class MainController {

	Logger log = Logger.getLogger("MainController.class");

	@Autowired
	private AnuncioService anuncioService;

	@Autowired
	private PersonaService personaService;

	@Autowired
	AnuncioRepository repository;

	@RequestMapping(value = "/")
	public String welcome(Model model) {
		model.addAttribute("nombre", "Vicc");
		return "index";
	}

	@RequestMapping(value = "/anuncio")
	public String getAnuncio() {
		Anuncio anuncio = (Anuncio) anuncioService.findOne(1);
		String textoAnuncio = anuncio.getAnuncio();
		log.log(Level.INFO, "Anuncio: " + textoAnuncio);
		return "index";
	}

	@RequestMapping(value = "/editar-mensaje")
	public String updateAnuncio() {
		Anuncio viejoAnuncio = (Anuncio) anuncioService.findOne(1);
		Anuncio nuevoAnuncio = new Anuncio();

		nuevoAnuncio.setId(viejoAnuncio.getId());
		nuevoAnuncio.setPersona(viejoAnuncio.getPersona());
		nuevoAnuncio.setAnuncio(viejoAnuncio.getAnuncio());
		nuevoAnuncio.setCategoria(viejoAnuncio.getCategoria());

		nuevoAnuncio.setAnuncio("Busco tractor con empacadora");
		anuncioService.update(nuevoAnuncio);
		log.log(Level.INFO, "Nuevo anuncio: " + nuevoAnuncio.getAnuncio());
		return "index";
	}

	@RequestMapping(value = "/insertar-anuncio")
	public String insertAnuncio() {
		Anuncio anuncio = new Anuncio();
		anuncio.setPersona(personaService.findOne(1));
		anuncio.setAnuncio("Busco peña para las fiestas.");
		anuncio.setCategoria("ocio");
		anuncioService.insertAnuncio(anuncio);
		return "index";
	}

	@RequestMapping(value = "/pruebas")
	public String probarAnuncio() {
		Persona p = repository.probarAnuncio(null, null);
		/*for (Anuncio anuncio : a) {
			log.log(Level.INFO, "PROBAR ANUNCIO: " + anuncio.getAnuncio());
		}*/
		log.log(Level.INFO, "PROBAR ANUNCIO: " + p.getMunicipio().getNombre());
		
		return "index";
	}

}
