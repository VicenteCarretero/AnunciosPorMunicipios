package net.adaptaciondigital.anunciospormunicipios;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.adaptaciondigital.anunciospormunicipios.entities.Anuncio;
import net.adaptaciondigital.anunciospormunicipios.services.AnuncioService;

@Controller
public class MainController {
	
	Logger log = Logger.getLogger("MainController.class");
	
	@Autowired
	private AnuncioService anuncioService;
	
	@RequestMapping(value = "/")
	public String welcome(Model model) {
		model.addAttribute("nombre", "Vicc");
		return "index";
	}
	
	@RequestMapping(value = "/anuncio")
	public String getAnuncio() {
		Anuncio anuncio = anuncioService.findOne(1);
		String textoAnuncio = anuncio.getAnuncio();
		log.log(Level.INFO, "Anuncio: " + textoAnuncio);
		return "index";
	}
	
	

}
