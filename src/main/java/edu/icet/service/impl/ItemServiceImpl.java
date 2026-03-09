package edu.icet.service.impl;

import edu.icet.model.Items;
import edu.icet.repositery.ItemRepositery;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepositery repositery;
    @Override
    public boolean addItem(Items items) {
        return repositery.addItems(items);
    }

    @Override
    public boolean updateItems(Items items) {
        return repositery.updateItems(items);
    }

    @Override
    public boolean deleteById(Integer id) {
        return repositery.deleteById(id);
    }

    @Override
    public Items searchById(Integer id) {
        return repositery.searchById(id);
    }

    @Override
    public List<Items> getAll() {
        return List.of();
    }
}
