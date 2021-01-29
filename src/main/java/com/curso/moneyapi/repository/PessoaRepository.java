package com.curso.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.moneyapi.model.Pessoa;
import com.curso.moneyapi.repository.lancamento.PessoaRepositoryQuery;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {

	
}
