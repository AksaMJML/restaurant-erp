package edu.icet.service;

import edu.icet.controller.ItemController;
import edu.icet.model.Items;

import java.util.List;

public interface ItemService {
    boolean addItem(Items items);
    boolean updateItems(Items items);
    boolean delteById(Integer id);
    Items searchById(Integer id);
    List<Items> getAll();
}
