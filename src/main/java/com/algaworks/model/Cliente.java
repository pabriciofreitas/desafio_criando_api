package com.algaworks.model;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data // isso serve para gets e sets alto implementar
@Entity//vira uma tabela no banco de dado na class cliente
// esta se criando uma tabela Cliente no DB com conluna ID autoIncrementavel pelo DB e coluna nome.
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false) 
	private Date data;
	

}
