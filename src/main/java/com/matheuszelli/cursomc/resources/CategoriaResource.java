package com.matheuszelli.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

//Nome do endpoint REST
@RequestMapping(value="/categorias")
public class CategoriaResource {

	//Verbo http
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST tá top";
	}
	
}
