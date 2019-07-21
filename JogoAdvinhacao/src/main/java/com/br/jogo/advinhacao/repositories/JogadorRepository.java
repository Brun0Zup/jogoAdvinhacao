package com.br.jogo.advinhacao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.jogo.advinhacao.models.Jogador;

@Repository
public interface JogadorRepository extends CrudRepository<Jogador, Integer>{

}
