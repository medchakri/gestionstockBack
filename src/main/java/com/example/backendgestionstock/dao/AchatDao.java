package com.example.backendgestionstock.dao;

import com.example.backendgestionstock.models.Achat;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AchatDao extends JpaRepository<Achat, Long> {
}
