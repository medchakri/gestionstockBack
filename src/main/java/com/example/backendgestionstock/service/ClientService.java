package com.example.backendgestionstock.service;

import com.example.backendgestionstock.dao.ClientDao;
import com.example.backendgestionstock.dao.StockDao;
import com.example.backendgestionstock.models.Client;
import com.example.backendgestionstock.models.Stocke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    //injecter Dao
    @Autowired
    private ClientDao dao;

    public int save(Client client) {
        if(client == null) return -1;
        else {
            dao.save(client);
            return 1;
        }
    }

    public Client findById(Long id) {
        return dao.findById(id).get();
    }

    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public List<Client> findAll() {
        return dao.findAll();
    }
}
