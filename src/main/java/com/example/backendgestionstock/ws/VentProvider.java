package com.example.backendgestionstock.ws;


import com.example.backendgestionstock.models.Vent;
import com.example.backendgestionstock.service.VentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vent")
public class VentProvider {

    @Autowired
    private VentService service;

    @PostMapping("id/{id}")
    public int save(Vent vent, Long id) {
        return service.save(vent, id);
    }

    @GetMapping("id/{id}")
    public Vent findById(@PathVariable Long id) {
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
    public List<Vent> findAll() {
        return service.findAll();
    }
}
