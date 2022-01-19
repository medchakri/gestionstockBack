package com.example.backendgestionstock.service;

import com.example.backendgestionstock.dao.ProduitDao;
import com.example.backendgestionstock.dao.VentDao;
import com.example.backendgestionstock.models.Client;
import com.example.backendgestionstock.models.Produit;
import com.example.backendgestionstock.models.Stocke;
import com.example.backendgestionstock.models.Vent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentService {
    @Autowired
    private VentDao dao;
    @Autowired
    private ClientService stservice;


    public List<Vent> findAll() {
        return dao.findAll();
    }

    public  int save(Vent vent, Long idEmp) {
        if(vent == null) return -1;
        else {
            Client e = new Client();
            e = stservice.findById(idEmp);
            vent.setClient(e);
            dao.save(vent);
            return 1;
        }
    }

    public Vent findById(Long id) {
        return dao.findById(id).get();
    }

    public void deleteById(Long id) {
        dao.deleteById(id);
    }
    public void deleteAll() {
        dao.deleteAll();
    }
}
