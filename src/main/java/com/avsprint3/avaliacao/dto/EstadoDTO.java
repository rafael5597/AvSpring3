package com.avsprint3.avaliacao.dto;

import java.math.BigDecimal;

import com.avsprint3.avaliacao.model.Estado;

public class EstadoDTO {

	private Long id;
	private String nome;
	private String regiao;
	private int populacao;
	private String capital;
	private float area;

	public EstadoDTO(Estado estado) {
		this.id = estado.getId();
		this.nome = estado.getNome();
		this.regiao = estado.getRegiao();
		this.populacao = estado.getPopulacao();
		this.capital = estado.getCapital();
		this.area = estado.getArea();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public int getPopulacao() {
		return populacao;
	}

	public String getCapital() {
		return capital;
	}

	public float getArea() {
		return area;
	}

}
