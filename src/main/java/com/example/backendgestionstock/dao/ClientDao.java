package com.example.backendgestionstock.dao;

import com.example.backendgestionstock.models.Client;
import com.example.backendgestionstock.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Long> {
}
