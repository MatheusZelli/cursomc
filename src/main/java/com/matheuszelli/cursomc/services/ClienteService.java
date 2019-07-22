package com.matheuszelli.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheuszelli.cursomc.domain.Cliente;
import com.matheuszelli.cursomc.repositories.ClienteRepository;
import com.matheuszelli.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired //Faz automaticamente a instância da classe (SpringBoot)
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		
		Cliente obj = repo.findOne(id);
		if (obj==null ) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + " , tipo: " + Cliente.class.getName());
		}
		return obj;
	}
}
