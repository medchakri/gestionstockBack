package com.example.backendgestionstock.ws;

import com.example.backendgestionstock.models.Achat;
import com.example.backendgestionstock.service.AchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/achat")
public class AchatProvider {

    @Autowired
    private AchatService service;

    @PostMapping("id/{id}")
    public int save(Achat achat, Long id) {
        return service.save(achat, id);
    }

    @GetMapping("id/{id}")
    public Achat findById(@PathVariable Long id) {
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
    public List<Achat> findAll() {
        return service.findAll();
    }
}
