package com.matheuszelli.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheuszelli.cursomc.domain.Pagamento;

//basta criar o repository da superclasse, não é necessário criar para as subclasses também
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
