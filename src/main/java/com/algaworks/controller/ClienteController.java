package com.algaworks.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.model.Cliente;

import com.algaworks.repository.ClienteRepository;

@RestController //é class que vai receber requisições
@RequestMapping("/clientes") //passando  o caminho para receber requisições iniciadas com /clientes
public class ClienteController {
		//Quando chegar requisição em 8080/cliente esse será metodo que irá responder
	@Autowired // vai injetar uma instancia de clienteRe pository aqui// instanciar
	private ClienteRepository clienteRepository;	
	@GetMapping
	public List <Cliente> listar() {
		return clienteRepository.findAll();						 		
	}/*
	@GetMapping("/a")
		public long contar( Cliente cliente) {
		 	System.out.println("essseeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"+clienteRepository.count());
			return 11111;//Listando tudo que está dentro da tabela cliente
						 		
		}*/
		
		
		@PostMapping						//transforma o corpo do objeto JSon em obj.Java.clinte
		@ResponseStatus(HttpStatus.CREATED)
		public Cliente adicionar(@RequestBody Cliente cliente) {
			return clienteRepository.save(cliente);
		}
}
