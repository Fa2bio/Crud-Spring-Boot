package com.github.Fa2bio.ProjetoSB.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.github.Fa2bio.ProjetoSB.domain.model.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

}
