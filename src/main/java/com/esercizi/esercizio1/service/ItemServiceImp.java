package com.esercizi.esercizio1.service;

import com.esercizi.esercizio1.dto.ItemDto;
import com.esercizi.esercizio1.entity.Item;
import com.esercizi.esercizio1.repository.ItemDao;
import com.esercizi.esercizio1.repository.ItemDaoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
@Transactional
public class ItemServiceImp  implements ItemService{
    @Autowired
    private ItemDao dao;
    @Override
    public void registra(ItemDto itemDto) {

        Item i = ItemService.versoEntity(itemDto);

        dao.insert(i);
    }

    @Override
    public List<Item> items() {
        return dao.selectAll();
    }

    @Override
    public void update(ItemDto iDto) {
        dao.update(iDto.getId(), iDto.getName(), iDto.getDescription());
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }
}
