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

import com.felipegabriel.merxcompras.model.ItemListaCompras;
import com.felipegabriel.merxcompras.services.ItemListaComprasService;

@RestController
@RequestMapping(value = "/item-lista-compras")
public class ItemListaComprasResource {
	
	@Autowired
	private ItemListaComprasService ItemListaComprasService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<ItemListaCompras> salvarItemListaCompras(@Valid @RequestBody ItemListaCompras ItemListaCompras) {
		ItemListaCompras obj = ItemListaComprasService.salvar(ItemListaCompras);
		return ResponseEntity.ok(obj);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletarItemListaCompras(@PathVariable Integer id) {
		ItemListaComprasService.deletar(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<ItemListaCompras> atualizarItemListaCompras(@Valid @RequestBody ItemListaCompras ItemListaCompras){
		ItemListaCompras obj = ItemListaComprasService.salvar(ItemListaCompras);
		return ResponseEntity.ok(obj);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ItemListaCompras> buscarItemListaCompras(@PathVariable Integer id) {
		ItemListaCompras obj = ItemListaComprasService.buscar(id);
		return ResponseEntity.ok(obj);
	}
	
	@RequestMapping(value = "/itens-lista-compra/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<ItemListaCompras>> buscarTodosOsItemListaCompras(@PathVariable Integer id) {
		List<ItemListaCompras> listObj = ItemListaComprasService.buscarTodos(id);
		return ResponseEntity.ok(listObj);
	}
}

