package com.algaworks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
//criar repositorio; é uma class responsavel por interagir com DB para um determinada tabela/Entidade 
import com.algaworks.model.Cliente;
@Repository                                // Esse metodo implementa em tempo de execução os pedidos de listagem, get entre outros do db
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	List<Cliente> findAll();

	



	


}
