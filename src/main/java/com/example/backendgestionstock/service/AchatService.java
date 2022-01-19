package com.example.backendgestionstock.service;

import com.example.backendgestionstock.dao.AchatDao;
import com.example.backendgestionstock.dao.VentDao;
import com.example.backendgestionstock.models.Achat;
import com.example.backendgestionstock.models.Client;
import com.example.backendgestionstock.models.Fournisseur;
import com.example.backendgestionstock.models.Vent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchatService {
    @Autowired
    private AchatDao dao;
    @Autowired
    private FournisseurService stservice;


    public List<Achat> findAll() {
        return dao.findAll();
    }

    public  int save(Achat achat, Long idEmp) {
        if(achat == null) return -1;
        else {
            Fournisseur e = new Fournisseur();
            e = stservice.findById(idEmp);
            achat.setFournisseur(e);
            dao.save(achat);
            return 1;
        }
    }

    public Achat findById(Long id) {
        return dao.findById(id).get();
    }

    public void deleteById(Long id) {
        dao.deleteById(id);
    }
    public void deleteAll() {
        dao.deleteAll();
    }
}
