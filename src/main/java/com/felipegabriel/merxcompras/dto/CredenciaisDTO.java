package com.felipegabriel.merxcompras.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class CredenciaisDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	private String email;
	
	@Getter
	@Setter
	private String senha;
	
	
	public CredenciaisDTO() {
		
	}
	
	public CredenciaisDTO(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	

}
