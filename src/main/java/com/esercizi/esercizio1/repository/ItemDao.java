package com.esercizi.esercizio1.repository;

import com.esercizi.esercizio1.entity.Item;

import java.util.List;

public interface ItemDao {
    //Inserisci un nuovo items
    public void insert(Item item);
    //Ricerca un item tramite id
    public Item select (int id);
    //stampa tutte gli Items
    public List<Item> selectAll();
    //Modifico
    public void update(int id, String nome, String descrizione);
    //Elimino
    public void delete (int id);

}
