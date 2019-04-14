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
@Table(name="produto")
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_produto", nullable = false)
	@Getter
	@Setter
	private Integer pkProduto;
	
	@Getter
	@Setter
	private String descricao;
	
	@Getter
	@Setter
	private String imagem;
	
	
	public Produto() {
	
	}

	public Produto(Integer pkProduto, String descricao, String imagem) {
		this.pkProduto = pkProduto;
		this.descricao = descricao;
		this.imagem = imagem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((imagem == null) ? 0 : imagem.hashCode());
		result = prime * result + ((pkProduto == null) ? 0 : pkProduto.hashCode());
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
		Produto other = (Produto) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (imagem == null) {
			if (other.imagem != null)
				return false;
		} else if (!imagem.equals(other.imagem))
			return false;
		if (pkProduto == null) {
			if (other.pkProduto != null)
				return false;
		} else if (!pkProduto.equals(other.pkProduto))
			return false;
		return true;
	}
	
	
	
	
}
