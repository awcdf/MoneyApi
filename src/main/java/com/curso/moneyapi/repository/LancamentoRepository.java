package com.curso.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.moneyapi.model.Lancamento;
import com.curso.moneyapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
