package com.github.Fa2bio.ProjetoSB.models.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.github.Fa2bio.ProjetoSB.models.entity.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

}
