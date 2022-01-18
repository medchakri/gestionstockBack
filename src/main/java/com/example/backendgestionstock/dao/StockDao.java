package com.example.backendgestionstock.dao;

import com.example.backendgestionstock.models.Stocke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockDao extends JpaRepository<Stocke, Long> {
}
