package com.example.backendgestionstock.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "adresse")
    private String adresse;

    @OneToMany(targetEntity = Vent.class, mappedBy = "client")
    @JsonBackReference
    private List<Vent> vents;

    public Client() {

    }

    public Client(String nom, String prenom, String adresse, List<Vent> vents) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.vents = vents;
    }

    public Client(String nom, String prenom, String adresse) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.adresse= adresse;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Vent> getVents() {
        return vents;
    }

    public void setVents(List<Vent> vents) {
        this.vents = vents;
    }
}

