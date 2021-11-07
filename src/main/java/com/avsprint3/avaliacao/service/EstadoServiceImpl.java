package com.avsprint3.avaliacao.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avsprint3.avaliacao.model.Estado;
import com.avsprint3.avaliacao.repository.EstadoRepository;

@Service
public class EstadoServiceImpl implements EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;

	
	
	@Override
	public void adicionarEstado(Estado estado) {
		estadoRepository.save(estado);
	}
	
	@Override
	@Transactional
	public void atualizarEstado(Long id, Estado estado) {
		Estado dadosAtualizarEstado =  estadoRepository.getOne(id);
		
		dadosAtualizarEstado.setNome(estado.getNome());
		dadosAtualizarEstado.setArea(estado.getArea());
		dadosAtualizarEstado.setPopulacao(estado.getPopulacao());
		dadosAtualizarEstado.setCapital(estado.getCapital());
		dadosAtualizarEstado.setArea(estado.getArea());
	
	}
	
	@Override
	public void removerEstado(Long id) {
		estadoRepository.deleteById(id);
	}
	
	@Override
	public List<Estado> listarEstados() {
		return estadoRepository.findAll() ;
	}
	
	@Override
	public Optional<Estado> detalharEstado(Long id) {
		return estadoRepository.findById(id);
	}
	
}
