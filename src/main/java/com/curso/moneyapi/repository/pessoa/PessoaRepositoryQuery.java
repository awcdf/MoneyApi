package com.curso.moneyapi.repository.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.curso.moneyapi.model.Pessoa;

public interface PessoaRepositoryQuery {
	
	public Page<Pessoa> filtrar(Pessoa pessoa, Pageable pageable);

}
