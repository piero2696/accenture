package com.esercizi.esercizio1.controller;


import com.esercizi.esercizio1.api.App1Api;
import com.esercizi.esercizio1.dto.ItemDto;
import com.esercizi.esercizio1.entity.Item;
import com.esercizi.esercizio1.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ItemController implements App1Api {

    @Autowired
    private ItemService service;


    @Override
    public ResponseEntity<ItemDto> createItem(ItemDto itemDto) {
        service.registra(itemDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(itemDto);
    }

    @Override
    public ResponseEntity<ItemDto> deleteItem(Integer itemId) {
        service.delete(itemId);
        return ResponseEntity.ok().build();
    }

    @Override
    public List<Item> getItems() {

        try {
            return service.items();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResponseEntity<Void> updateItem(ItemDto itemDto) {
        service.update(itemDto);
        return ResponseEntity.accepted().build();
    }
}
