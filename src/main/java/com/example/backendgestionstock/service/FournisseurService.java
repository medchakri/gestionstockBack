package com.example.backendgestionstock.service;

import com.example.backendgestionstock.dao.ClientDao;
import com.example.backendgestionstock.dao.FournisseurDao;
import com.example.backendgestionstock.models.Client;
import com.example.backendgestionstock.models.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {

    //injecter Dao
    @Autowired
    private FournisseurDao dao;

    public int save(Fournisseur fournisseur) {
        if(fournisseur == null) return -1;
        else {
            dao.save(fournisseur);
            return 1;
        }
    }

    public Fournisseur findById(Long id) {
        return dao.findById(id).get();
    }

    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public List<Fournisseur> findAll() {
        return dao.findAll();
    }
}
