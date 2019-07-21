package com.br.jogo.advinhacao.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class NumSorteado implements Serializable{
	private static final long serilVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	
	@NotNull
	private Integer numero;
	

	@OneToOne(mappedBy = "numSorteado")
	private Jogador jogador;

	public NumSorteado() {
		
	}

	public NumSorteado(Integer id, Integer numero, Jogador jogador) {

		this.id = id;
		this.numero = numero;
		this.jogador = jogador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	
	
}
