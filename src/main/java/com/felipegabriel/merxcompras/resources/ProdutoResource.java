package com.felipegabriel.merxcompras.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.felipegabriel.merxcompras.model.Produto;
import com.felipegabriel.merxcompras.services.ProdutoService;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Produto> salvarProduto(@Valid @RequestBody Produto produto) {
		Produto obj = produtoService.salvar(produto);
		return ResponseEntity.ok(obj);
	}
}
