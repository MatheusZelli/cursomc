package com.matheuszelli.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheuszelli.cursomc.domain.Endereco;

@Repository
public interface EnderecoRepositoy extends JpaRepository<Endereco, Integer>{

}
