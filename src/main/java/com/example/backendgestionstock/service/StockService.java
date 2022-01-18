package com.example.backendgestionstock.service;

import com.example.backendgestionstock.dao.StockDao;
import com.example.backendgestionstock.models.Stocke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    //injecter Dao
    @Autowired
    private StockDao dao;

    public int save(Stocke stock) {
        if(stock == null) return -1;
        else {
            dao.save(stock);
            return 1;
        }
    }

    public Stocke findById(Long id) {
        return dao.findById(id).get();
    }

    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public List<Stocke> findAll() {
        return dao.findAll();
    }
}
