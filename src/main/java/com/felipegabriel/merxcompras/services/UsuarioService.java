package com.felipegabriel.merxcompras.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.felipegabriel.merxcompras.model.Usuario;
import com.felipegabriel.merxcompras.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	
	public Usuario salvarEditarUsuario(Usuario usuario) {
		usuario.setSenha(pe.encode(usuario.getSenha()));
		return usuarioRepository.save(usuario);
	}
	
	public void deletarUsuario(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public Usuario buscarUsuario(Integer id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	public List<Usuario> listarTodosOsUsuarios(){
		return usuarioRepository.findAll();
	}
}
