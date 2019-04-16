package com.felipegabriel.merxcompras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipegabriel.merxcompras.model.ListaCompras;

@Repository
public interface ListaComprasRepository extends JpaRepository<ListaCompras, Integer>{

}
