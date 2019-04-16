package com.felipegabriel.merxcompras.services;

import java.util.List;

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
	
	public void deletar(Integer id) {
		produtoRepository.deleteById(id);
	}
	
	public Produto buscar(Integer id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
	public List<Produto> buscarTodos() {
		return produtoRepository.findAll();
	}
}
