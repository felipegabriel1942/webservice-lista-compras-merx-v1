package com.felipegabriel.merxcompras.resources;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletarProduto(@PathVariable Integer id) {
		produtoService.deletar(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Produto> atualizarProduto(@Valid @RequestBody Produto produto){
		Produto obj = produtoService.salvar(produto);
		return ResponseEntity.ok(obj);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Produto> buscarProduto(@PathVariable Integer id) {
		Produto obj = produtoService.buscar(id);
		return ResponseEntity.ok(obj);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Produto>> buscarTodosOsProdutos() {
		List<Produto> listObj = produtoService.buscarTodos();
		return ResponseEntity.ok(listObj);
	}
}
