package com.felipegabriel.merxcompras.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_usuario", nullable = false)
	@Getter
	@Setter	
	private Integer pkUsuario;
	
	@Column(nullable = false)
	@Getter
	@Setter
	private String nome;
	
	@Column(unique = true, nullable = false)
	@Getter
	@Setter
	private String email;
	
	@Column(nullable = false)
	@Getter
	@Setter
	private String senha;
	
	public Usuario() {
		
	}

	public Usuario(Integer pkUsuario, String nome, String email, String senha) {
		this.pkUsuario = pkUsuario;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((pkUsuario == null) ? 0 : pkUsuario.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (pkUsuario == null) {
			if (other.pkUsuario != null)
				return false;
		} else if (!pkUsuario.equals(other.pkUsuario))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
	
	
	

}
