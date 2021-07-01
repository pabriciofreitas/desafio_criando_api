package com.algaworks.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.model.Vendedor;
import com.algaworks.repository.VendedorRepository;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {
	@Autowired 
	private VendedorRepository vendedorRepository;	
	// #########MEtodo para listar os vendedores #################
		@GetMapping
		public List <Vendedor> listar() {
		
			int a = vendedorRepository.findAll().size(); // Isso retorna o tamanho da lista  que nesse caso é 1
			
			for (int i=0; i < a; ++i) {
				String b = vendedorRepository.findAll().get(i).toString();   // esse comando acessa a arrayList e retorna outra array list[com 6 variaveis]
				for (id_vendedor a: this.vendedorRepository.findAll()) {
					
				}
			}
			
			
			return vendedorRepository.findAll();
	         		 		
		}
		// #########MEtodo para listar os vendedores pelo ID#################
		@GetMapping("/{id_vendedor}")
		public Optional<Vendedor> listarId(@PathVariable(value="id_vendedor") long id_vendedor) {
			return vendedorRepository.findById(id_vendedor);						 		
		} 
			
  
		
		// #########MEtodo para adicionar as Vendedor #################
		@PostMapping						
		@ResponseStatus(HttpStatus.CREATED)
		public Vendedor adicionar(@RequestBody Vendedor vendedor) {
			return vendedorRepository.save(vendedor);
		}


}
