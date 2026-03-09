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
        String sql = "INSERT INTO menu_items VALUES (?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql ,
                items.getId(),
                items.getName(),
                items.getDescription(),
                items.getCategory(),
                items.isActive(),
                items.getCreateAt(),
                items.getUpdatedAt()
        )>0;
    }

    @Override
    public boolean updateItems(Items items) {
        String sql = "UPDATE menu_items SET item_name = ? , description = ? , category = ? , is_active = ? , created_at = ? , updated_at = ? WHERE menu_item_id = ?";
        return jdbcTemplate.update(sql ,
                items.getName(),
                items.getDescription(),
                items.getCategory(),
                items.isActive(),
                items.getCreateAt(),
                items.getUpdatedAt(),
                items.getId()
        )>0;
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
