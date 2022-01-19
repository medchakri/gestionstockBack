package com.example.backendgestionstock.ws;

import com.example.backendgestionstock.models.Stocke;
import com.example.backendgestionstock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocke")
public class StockProvider {

    @Autowired
    private StockService service;

    @PostMapping("")
    public int save(Stocke stocke) {
        return service.save(stocke);
    }

    @GetMapping("id/{id}")
    public Stocke findById(Long id) {
        return service.findById(id);
    }

    @DeleteMapping("id/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

    @DeleteMapping("")
    public void deleteAll() {
        service.deleteAll();
    }

    @GetMapping("")
    public List<Stocke> findAll() {
        return service.findAll();
    }
}
