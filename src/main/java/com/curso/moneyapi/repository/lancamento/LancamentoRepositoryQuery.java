package com.curso.moneyapi.repository.lancamento;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.curso.moneyapi.model.Lancamento;
import com.curso.moneyapi.repository.filter.LancamentoFilter;
import com.curso.moneyapi.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
