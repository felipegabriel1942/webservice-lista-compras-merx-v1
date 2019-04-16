package com.felipegabriel.merxcompras.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipegabriel.merxcompras.model.ListaCompras;
import com.felipegabriel.merxcompras.repositories.ListaComprasRepository;


@Service
public class ListaComprasService {
	
	@Autowired
	private ListaComprasRepository listaComprasRepository;
	
	public ListaCompras salvar(ListaCompras object){
		return listaComprasRepository.save(object);
	}	
	
	public void deletar(Integer id) {
		listaComprasRepository.deleteById(id);
	}
	
	public ListaCompras buscar(Integer id) {
		return listaComprasRepository.findById(id).orElse(null);
	}
	
	public List<ListaCompras> buscarTodos(Integer id) {
		return listaComprasRepository.findAll().stream().filter(x -> x.getFkUsuario().getPkUsuario() == id).collect(Collectors.toList());
	}
}
