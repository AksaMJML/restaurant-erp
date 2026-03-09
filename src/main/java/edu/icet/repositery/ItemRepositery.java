package edu.icet.repositery;

import edu.icet.model.Items;

import java.util.List;

public interface ItemRepositery {
    boolean addItems(Items items);
    boolean updateItems(Items items);
    boolean deleteById(Integer id);
    Items searchById(Integer id);
    List<Items> getAll();
}
