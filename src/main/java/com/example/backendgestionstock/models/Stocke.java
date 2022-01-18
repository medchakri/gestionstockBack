package com.example.backendgestionstock.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stocke")
public class Stocke {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "adresse")
    private String adresse;

    @OneToMany(targetEntity = Produit.class, mappedBy = "stock")
    @JsonBackReference
    private List<Produit> produit;



    public Stocke() {

    }



    public Stocke(long id, String name, String adresse,List<Produit> produit) {
        super();
        this.id = id;
        this.name = name;
        this.adresse = adresse;
        this.produit = produit;
    }



    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getAdresse() {
        return adresse;
    }



    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    public List<Produit> getProduit() {
        return produit;
    }



    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "Stocke{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                ", produit=" + produit +
                '}';
    }
}
