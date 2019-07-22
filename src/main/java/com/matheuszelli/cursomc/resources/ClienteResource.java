package com.matheuszelli.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.matheuszelli.cursomc.domain.Cliente;
import com.matheuszelli.cursomc.services.ClienteService;

@RestController

//Nome do endpoint REST
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;

	//Verbo http
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?>find(@PathVariable Integer id) { 
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
}
