package com.example.backendgestionstock.ws;

import com.example.backendgestionstock.models.Client;
import com.example.backendgestionstock.models.Fournisseur;
import com.example.backendgestionstock.service.ClientService;
import com.example.backendgestionstock.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/fournisseur")
public class FournisseurProvider {

    @Autowired
    private FournisseurService service;

    @PostMapping("/")
    public int save(Fournisseur fournisseur) {
        return service.save(fournisseur);
    }

    @GetMapping("/id/{id}")
    public Fournisseur findById(Long id) {
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
    public List<Fournisseur> findAll() {
        return service.findAll();
    }
}
