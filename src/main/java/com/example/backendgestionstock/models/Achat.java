package com.example.backendgestionstock.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "achat")
public class Achat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "id_fournisseur", nullable = false)
    @JsonBackReference
    private Fournisseur fournisseur;

    public Achat(String date, Fournisseur fournisseur) {
        this.date = date;
        this.fournisseur = fournisseur;
    }

    public Achat() {

    }
    public Achat(long id, String date) {
        super();
        this.id = id;
        this.date = date;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }
}
