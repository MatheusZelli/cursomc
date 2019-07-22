package com.matheuszelli.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheuszelli.cursomc.domain.Pedido;
import com.matheuszelli.cursomc.repositories.PedidoRepository;
import com.matheuszelli.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired //Faz automaticamente a instância da classe (SpringBoot)
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		
		Pedido obj = repo.findOne(id);
		if (obj==null ) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + " , tipo: " + Pedido.class.getName());
		}
		return obj;
	}
}
