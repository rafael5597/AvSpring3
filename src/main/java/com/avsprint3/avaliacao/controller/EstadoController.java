package com.avsprint3.avaliacao.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avsprint3.avaliacao.model.Estado;

@RestController
@RequestMapping("/api/states")
public class EstadoController {

	@PostMapping
	public String adicionar(@RequestBody Estado estado) {
		return "OK, adicionar"; 
	}
	
	@GetMapping
	public String listar() {
		return "OK, atualizar...";
	}
	
	@GetMapping("/{id}")
	public String detalhar(@PathVariable Long id) {
		return "OK, detalhar " + id;
	}
	
	@PutMapping("/{id}")
	public String atualizar(@RequestBody Estado estado) {
		return "OK, atualizar " + estado.getNome();
	}
	
	@DeleteMapping("/{id}")
	public String remover(@PathVariable Long id) {
		return "OK, remover " + id;
	}
}
