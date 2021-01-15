package com.curso.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.moneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
