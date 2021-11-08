package com.avsprint3.avaliacao.service;

import java.util.List;
import java.util.Optional;

import com.avsprint3.avaliacao.form.EstadoForm;
import com.avsprint3.avaliacao.model.Estado;

public interface EstadoService {

	public abstract void adicionarEstado(EstadoForm form);
	public abstract void atualizarEstado(Long id, Estado estado);
	public abstract void removerEstado(Long id);
	public abstract List<Estado> listarEstados();
	public Optional<Estado> detalharEstado(Long id);
}
