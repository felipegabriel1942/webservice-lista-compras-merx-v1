package com.felipegabriel.merxcompras.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.felipegabriel.merxcompras.model.Usuario;
import com.felipegabriel.merxcompras.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Usuario> buscar(@PathVariable Integer id) {
		Usuario obj = usuarioService.buscarUsuario(id);
		return ResponseEntity.ok(obj);
	}	
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Usuario> salvar(@Valid @RequestBody Usuario usuario){
		Usuario obj = usuarioService.salvarEditarUsuario(usuario);		
		return ResponseEntity.ok(obj);		
	}

}
