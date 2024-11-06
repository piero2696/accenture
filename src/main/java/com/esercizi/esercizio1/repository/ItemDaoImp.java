package com.esercizi.esercizio1.repository;

import com.esercizi.esercizio1.entity.Item;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemDaoImp  implements ItemDao{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public void insert(Item item) {
        manager.persist(item);
    }

    @Override
    public Item select(int id) {
        return manager.find(Item.class, id);
    }

    @Override
    public List<Item> selectAll() {
        TypedQuery<Item> tpItem=manager.createQuery("SELECT i FROM Item i",Item.class);
        List<Item> items = tpItem.getResultList();
        return items;
    }

    @Override
    public void update(int id, String nome, String descrizione) {
        Item i = manager.find(Item.class, id);
        i.setNome(nome);
        i.setDescrizione(descrizione);
    }

    @Override
    public void delete(int id) {
        Item iDelete = manager.find(Item.class, id);
        manager.remove(iDelete);
    }
}
