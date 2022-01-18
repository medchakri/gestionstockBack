package com.example.backendgestionstock.dao;

import com.example.backendgestionstock.models.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurDao extends JpaRepository<Fournisseur, Long> {
}
