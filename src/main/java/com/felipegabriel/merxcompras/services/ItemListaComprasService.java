package com.felipegabriel.merxcompras.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipegabriel.merxcompras.model.ItemListaCompras;
import com.felipegabriel.merxcompras.repositories.ItemListaComprasRespository;

@Service
public class ItemListaComprasService {
	
	@Autowired
	private ItemListaComprasRespository itemListaComprasRepository;
	
	public ItemListaCompras salvar(ItemListaCompras object){
		return itemListaComprasRepository.save(object);
	}	
	
	public void deletar(Integer id) {
		itemListaComprasRepository.deleteById(id);
	}
	
	public ItemListaCompras buscar(Integer id) {
		return itemListaComprasRepository.findById(id).orElse(null);
	}
	
	public List<ItemListaCompras> buscarTodos(Integer id) {
		return itemListaComprasRepository.findAll().stream().filter(x -> x.getFkListaCompra().getPkListaCompras() == id).collect(Collectors.toList());
	}
}
