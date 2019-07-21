package com.br.jogo.advinhacao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.jogo.advinhacao.models.Jogador;
import com.br.jogo.advinhacao.models.NumSorteado;

@Repository
public interface NumSorteadoRepository extends CrudRepository <NumSorteado, Integer>{


}
