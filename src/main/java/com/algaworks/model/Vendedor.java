package com.algaworks.model;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Vendedor implements Serializable{
	private static long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_vendedor;
	
	@Column(nullable = false) 
	private String nome_vendedor;
	
	@Column(nullable = false) 
	private Date pri_data;
	
	@Column(nullable = false) 
	private Date ult_data;
	
	@Column(nullable = false) 
	private Double media_diaria_de_vendas;
	
	@Column(nullable = false) 
	private Long total_de_vendas;
	

	
}
