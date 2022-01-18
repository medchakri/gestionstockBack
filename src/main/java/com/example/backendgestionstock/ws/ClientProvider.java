package com.example.backendgestionstock.ws;

import com.example.backendgestionstock.models.Client;
import com.example.backendgestionstock.models.Stocke;
import com.example.backendgestionstock.service.ClientService;
import com.example.backendgestionstock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/client")
public class ClientProvider {
    @Autowired
    private ClientService service;

    @PostMapping("/")
    public int save(Client client) {
        return service.save(client);
    }

    @GetMapping("/id/{id}")
    public Client findById(Long id) {
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
    public List<Client> findAll() {
        return service.findAll();
    }
}
