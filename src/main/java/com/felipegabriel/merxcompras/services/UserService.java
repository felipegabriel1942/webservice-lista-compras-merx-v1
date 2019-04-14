package com.felipegabriel.merxcompras.services;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.felipegabriel.merxcompras.security.UsuarioDetails;


public class UserService {
	
	public static UsuarioDetails authenticated() {
		try {
			return (UsuarioDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}
}
