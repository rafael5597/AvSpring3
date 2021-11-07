package com.avsprint3.avaliacao.dto;

import java.math.BigDecimal;

import com.avsprint3.avaliacao.model.Estado;

public class AdicionarEstadoDTO {
	
	private String nome;
	private String regiao;
	private int populacao;
	private String capital;
	private float area;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public String getRegiao() {
		return regiao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
	public int getPopulacao() {
		return populacao;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public String getCapital() {
		return capital;
	}

	public void setArea(float area) {
		this.area = area;
	}
	
	public float getArea() {
		return area;
	}
	
	public Estado converter() {
		Estado estado = new Estado();
		
		estado.setNome(nome);
		estado.setRegiao(regiao);
		estado.setPopulacao(populacao);
		estado.setCapital(capital);
		estado.setArea(area);
		return estado;
	}
}
