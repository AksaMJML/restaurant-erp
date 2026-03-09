package edu.icet.repositery.impl;

import edu.icet.model.Items;
import edu.icet.repositery.ItemRepositery;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepositeryImpl implements ItemRepositery {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public boolean addItems(Items items) {
        String sql = "INSERT INTO items VALUES (?,?,?,?,?,?)";
        return jdbcTemplate.update(sql ,
                items.getId(),
                items.getName(),
                items.getSize(),
                items.getPrice(),
                items.getPreperationTime(),
                items.getIngredients()
        )>0;

    }

    @Override
    public boolean updateItems(Items items) {
        return false;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }

    @Override
    public Items searchById(Integer id) {
        return null;
    }

    @Override
    public List<Items> getAll() {
        return List.of();
    }
}
