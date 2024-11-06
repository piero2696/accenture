package com.esercizi.esercizio1.entity;

import jakarta.persistence.*;

@Table(name="item")
@Entity
public class Item {
    //Dichiaro gli attributi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String nome;
    @Column(name="description")
    private String descrizione;

    //costruttore vuoto
    public Item() {}
    //costruttore full
    public Item(int _id, String _nome, String _descrizione){
        this.setId(_id);
        this.setNome(_nome);
        this.setDescrizione(_descrizione);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
