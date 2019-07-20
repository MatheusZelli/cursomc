package com.matheuszelli.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheuszelli.cursomc.domain.Categoria;
import com.matheuszelli.cursomc.repositories.CategoriaRepository;
import com.matheuszelli.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired //Faz automaticamente a instância da classe (SpringBoot)
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Categoria obj = repo.findOne(id);
		if (obj==null ) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + " , tipo: " + Categoria.class.getName());
		}
		return obj;
	}
}
