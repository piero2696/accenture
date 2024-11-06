package com.esercizi.esercizio1.service;

import com.esercizi.esercizio1.dto.ItemDto;
import com.esercizi.esercizio1.entity.Item;

import java.util.List;

public interface ItemService {

    public void registra (ItemDto itemDto);
    public List<Item> items();
    public void update(ItemDto iDto);
    public void delete(int id);



    public static Item versoEntity (ItemDto iDto) {
        if(iDto==null)return null;

        Item i = new Item();

        i.setNome(iDto.getName());
        i.setDescrizione(iDto.getDescription());

        return i;

    }
    public static Item versoEntityId (ItemDto iDto) {
        if(iDto==null)return null;

        Item i = new Item();

        i.setId(iDto.getId());
        i.setNome(iDto.getName());
        i.setDescrizione(iDto.getDescription());

        return i;

    }
    public static ItemDto versoDTO (Item i) {

        if(i==null)return null;

        ItemDto iDTO = new ItemDto();
        iDTO.setId(i.getId());
        iDTO.setName(i.getNome());
        iDTO.setDescription(i.getDescrizione());
        return iDTO;

    }

}

