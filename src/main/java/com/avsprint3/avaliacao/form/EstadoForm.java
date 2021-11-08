package com.avsprint3.avaliacao.form;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.web.bind.MethodArgumentNotValidException;

public class EstadoForm {

	@NotNull(message = "Nome não pode ser NULL.")
	@NotEmpty(message = "Nome não pode ser vazio.")
	@Length(min = 4, message = "Nome precisa ter no mínimo 4 caracteres.")
	private String nome;

	@NotNull
	@NotEmpty
	@Length(min = 3)
	private String regiao;

	@Min(100000)
	private int populacao;

	@NotNull
	@NotEmpty
	@Length(min = 2)
	private String capital;

	@DecimalMin("5.00")
	private float area;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		List<String> regioes = new ArrayList<String>();
		regioes.add("Norte");
		regioes.add("Nordeste");
		regioes.add("Sul");
		regioes.add("Sudeste");
		regioes.add("Centro-Oeste");

		for (String s : regioes) {
			if (s.contains(regiao)) {
				this.regiao = regiao;
			}
		}
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

}
