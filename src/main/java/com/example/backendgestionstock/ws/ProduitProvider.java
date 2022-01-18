package com.example.backendgestionstock.ws;

import com.example.backendgestionstock.models.Produit;
import com.example.backendgestionstock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/produit")
public class ProduitProvider {
    @Autowired
    private ProduitService service;

    @PostMapping("/id/{id}")
    public int save(Produit produit, Long id) {
        return service.save(produit, id);
    }

    @GetMapping("/id/{id}")
    public Produit findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

    @DeleteMapping("/")
    public void deleteAll() {
        service.deleteAll();
    }

    @GetMapping("/")
    public List<Produit> findAll() {
        return service.findAll();
    }

}
