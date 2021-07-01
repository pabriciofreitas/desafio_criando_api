package com.algaworks.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.model.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>{
	List<Venda> findAll();
}
