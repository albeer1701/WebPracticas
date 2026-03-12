package com.webpracticas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/quienes-somos")
	public String quienesSomos() {
		return "quienes-somos";
	}

	@GetMapping("/que-hacemos")
	public String queHacemos() {
		return "que-hacemos";
	}
	
	@GetMapping("/tramitar-online")
	public String tramitaOnline() {
		return "tramitar-online";
	}
	
	@GetMapping("/tarifas")
	public String taridas() {
		return "tarifas";
	}
	
	@GetMapping("/tramites")
	public String tramites() {
		return "tramites";
	}
	
	@GetMapping("/faq")
	public String faq() {
		return "faq";
	}
	
	@GetMapping("/articulos")
	public String articulos() {
		return "articulos";
	}
	
	@GetMapping("/contacto")
	public String contacto() {
		return "contacto";
	}
	
	@GetMapping("/proteccion-datos")
	public String proteccionDatos() {
		return "proteccion-datos";
	}
}


















