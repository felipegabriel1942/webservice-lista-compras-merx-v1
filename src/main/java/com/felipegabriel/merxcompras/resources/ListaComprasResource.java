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

import com.felipegabriel.merxcompras.model.ListaCompras;
import com.felipegabriel.merxcompras.services.ListaComprasService;

@RestController
@RequestMapping(value = "/lista-compras")
public class ListaComprasResource {
	
	@Autowired
	private ListaComprasService ListaComprasService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<ListaCompras> salvarListaCompras(@Valid @RequestBody ListaCompras ListaCompras) {
		ListaCompras obj = ListaComprasService.salvar(ListaCompras);
		return ResponseEntity.ok(obj);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletarListaCompras(@PathVariable Integer id) {
		ListaComprasService.deletar(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<ListaCompras> atualizarListaCompras(@Valid @RequestBody ListaCompras ListaCompras){
		ListaCompras obj = ListaComprasService.salvar(ListaCompras);
		return ResponseEntity.ok(obj);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<ListaCompras> buscarListaCompras(@PathVariable Integer id) {
		ListaCompras obj = ListaComprasService.buscar(id);
		return ResponseEntity.ok(obj);
	}
	
	@RequestMapping(value = "/lista-usuario/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<ListaCompras>> buscarTodosOsListaCompras(@PathVariable Integer id) {
		List<ListaCompras> listObj = ListaComprasService.buscarTodos(id);
		return ResponseEntity.ok(listObj);
	}
}

