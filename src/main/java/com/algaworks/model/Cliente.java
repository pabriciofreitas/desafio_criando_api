package com.algaworks.model;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY) ///estrategia para geração de ID
	private Long id;
	@Column(nullable = false) // não pode ser null
	private String nome;
	

}
