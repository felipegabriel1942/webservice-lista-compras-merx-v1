package com.felipegabriel.merxcompras.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipegabriel.merxcompras.model.Produto;
import com.felipegabriel.merxcompras.repositories.ProdutoRepository;

@Service
public class ProdutoService{
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto salvar(Produto object){
		return produtoRepository.save(object);
	}
	
}
