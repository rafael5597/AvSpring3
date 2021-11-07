package com.avsprint3.avaliacao.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.avsprint3.avaliacao.dto.AdicionarEstadoDTO;
import com.avsprint3.avaliacao.model.Estado;
import com.avsprint3.avaliacao.service.EstadoService;

@RestController
@RequestMapping("/api/states")
public class EstadoController {
	
	@Autowired
	private EstadoService estadoService;

	@PostMapping
	public ResponseEntity<String> adicionar(@RequestBody AdicionarEstadoDTO adicionarEstadoDto) {
		estadoService.adicionarEstado(adicionarEstadoDto.converter());
		return new ResponseEntity<String>("Estado adicionado.", HttpStatus.CREATED); 
	}
	
	@GetMapping
	public Collection<Estado> listar() {
		return estadoService.listarEstados();
	}
	
	@GetMapping("/{id}")
	public Optional<Estado> detalhar(@PathVariable Long id) {
		return estadoService.detalharEstado(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> atualizar(@PathVariable Long id,@RequestBody Estado estado) {
		estadoService.atualizarEstado(id, estado);
		return new ResponseEntity<String>("Estado atualizado.", HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> remover(@PathVariable Long id) {
		estadoService.removerEstado(id);
		return new ResponseEntity<String>("Estado atualizado.", HttpStatus.OK);
	}
}
