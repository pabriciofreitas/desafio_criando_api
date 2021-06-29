package com.algaworks.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.model.Venda;
import com.algaworks.repository.VendaRepository;

@RestController
@RequestMapping("/vendas")
public class VendaController {
	@Autowired 
	private VendaRepository vendaRepository;	
		@GetMapping
		// #########MEtodo para listar os vendedores #################
		
		public List <Venda> listar() {
			return vendaRepository.findAll();						 		
		}	
		
		
		// #########MEtodo para adicionar as vendas #################
		@PostMapping						
		@ResponseStatus(HttpStatus.CREATED)
		public Venda adicionar(@RequestBody Venda venda) {
			return vendaRepository.save(venda);
		}


}
