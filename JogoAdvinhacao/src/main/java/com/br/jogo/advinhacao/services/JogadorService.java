package com.br.jogo.advinhacao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.jogo.advinhacao.models.Jogador;
import com.br.jogo.advinhacao.repositories.JogadorRepository;

@Service
public class JogadorService {
	
	
	@Autowired
	private JogadorRepository jogadorRepository;
	
	public void salvarJogador(Jogador jogador) {
		jogadorRepository.save(jogador);
	}
	
	public Iterable<Jogador> listarVencedores(){
		return jogadorRepository.findAll();
	}

}

