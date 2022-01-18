package com.example.backendgestionstock.service;

import com.example.backendgestionstock.dao.ProduitDao;
import com.example.backendgestionstock.models.Produit;
import com.example.backendgestionstock.models.Stocke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    private ProduitDao dao;
    @Autowired
    private StockService stservice;


    public List<Produit> findAll() {
        return dao.findAll();
    }

    public  int save(Produit produit, Long idEmp) {
        if(produit == null) return -1;
        else {
            Stocke e = new Stocke();
            e = stservice.findById(idEmp);
            produit.setStock(e);
            dao.save(produit);
            return 1;
        }
    }

    public Produit findById(Long id) {
        return dao.findById(id).get();
    }

    public void deleteById(Long id) {
        dao.deleteById(id);
    }
    public void deleteAll() {
        dao.deleteAll();
    }
}
