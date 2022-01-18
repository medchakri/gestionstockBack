package com.example.backendgestionstock.models;

import javax.persistence.*;

@Entity
@Table(name = "fournisseur")
public class Fournisseur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "adresse")
    private String adresse;

    public Fournisseur() {

    }

    public Fournisseur(String nom, String prenom, String adresse) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;

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
}
