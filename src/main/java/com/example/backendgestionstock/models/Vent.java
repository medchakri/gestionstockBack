package com.example.backendgestionstock.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "vent")
public class Vent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    @JsonBackReference
    private Client client;

    public Vent() {

    }

    public Vent(String date, Client client) {
        this.date = date;
        this.client = client;
    }

    public Vent(long id, String date) {
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Vent{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", client=" + client +
                '}';
    }
}
