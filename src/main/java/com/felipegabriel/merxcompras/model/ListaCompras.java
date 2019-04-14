package com.felipegabriel.merxcompras.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "lista_compras")
public class ListaCompras implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_lista_compras", nullable = false)
	@Getter
	@Setter
	private Integer pkListaCompras;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String descricao;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private Date dataCadastro;
	
	@Getter
	@Setter
	@JoinColumn(name = "fk_usuario", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario fkUsuario;
	
	
	public ListaCompras() {

	}

	public ListaCompras(Integer pkListaCompras, String descricao, Date dataCadastro, Usuario fkUsuario) {
		this.pkListaCompras = pkListaCompras;
		this.descricao = descricao;
		this.dataCadastro = dataCadastro;
		this.fkUsuario = fkUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((fkUsuario == null) ? 0 : fkUsuario.hashCode());
		result = prime * result + ((pkListaCompras == null) ? 0 : pkListaCompras.hashCode());
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
		ListaCompras other = (ListaCompras) obj;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (fkUsuario == null) {
			if (other.fkUsuario != null)
				return false;
		} else if (!fkUsuario.equals(other.fkUsuario))
			return false;
		if (pkListaCompras == null) {
			if (other.pkListaCompras != null)
				return false;
		} else if (!pkListaCompras.equals(other.pkListaCompras))
			return false;
		return true;
	}
	
	
	
	
	
}
