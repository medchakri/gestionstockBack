package com.example.backendgestionstock.dao;
import com.example.backendgestionstock.models.Vent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentDao extends JpaRepository<Vent, Long> {
}
