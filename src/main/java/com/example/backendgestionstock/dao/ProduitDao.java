package com.example.backendgestionstock.dao;

import com.example.backendgestionstock.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {
}
