package com.felipegabriel.merxcompras.model;

import java.io.Serializable;

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
@Table(name = "item_lista_compras")
public class ItemListaCompras implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_item_lista_compras", nullable = false)
	@Getter
	@Setter
	private Integer pkItemListaCompras;
	
	@JoinColumn(name = "fk_produto", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	@Getter
	@Setter
	private Produto fkProduto;
	
	@JoinColumn(name = "fk_lista_compra", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	@Getter
	@Setter
	private ListaCompras fkListaCompra;
	
	@Column(nullable = false)
	@Getter
	@Setter
	private Integer quantidade;
	

	public ItemListaCompras() {
	}

	public ItemListaCompras(Integer pkItemListaCompras, Produto fkProduto, ListaCompras fkListaCompra,
			Integer quantidade) {
		this.pkItemListaCompras = pkItemListaCompras;
		this.fkProduto = fkProduto;
		this.fkListaCompra = fkListaCompra;
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fkListaCompra == null) ? 0 : fkListaCompra.hashCode());
		result = prime * result + ((fkProduto == null) ? 0 : fkProduto.hashCode());
		result = prime * result + ((pkItemListaCompras == null) ? 0 : pkItemListaCompras.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
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
		ItemListaCompras other = (ItemListaCompras) obj;
		if (fkListaCompra == null) {
			if (other.fkListaCompra != null)
				return false;
		} else if (!fkListaCompra.equals(other.fkListaCompra))
			return false;
		if (fkProduto == null) {
			if (other.fkProduto != null)
				return false;
		} else if (!fkProduto.equals(other.fkProduto))
			return false;
		if (pkItemListaCompras == null) {
			if (other.pkItemListaCompras != null)
				return false;
		} else if (!pkItemListaCompras.equals(other.pkItemListaCompras))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}

	
	
	
	
	
}
