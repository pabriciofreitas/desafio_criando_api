package com.algaworks.model;
import java.sql.Date;
//import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Venda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_venda;
	
	@Column//(nullable = false) 
	private Date data;
	
	@Column//(nullable = false) 
	private Double valor;
	
	@Column//(nullable = false) 
	private Long id_vendedor;

	@Column//(nullable = false) 
	private String nome_vendedor;
}
