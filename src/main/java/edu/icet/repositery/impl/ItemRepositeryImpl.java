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
                items.getIsActive(),
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
                items.getIsActive(),
                items.getCreateAt(),
                items.getUpdatedAt(),
                items.getId()
        )>0;
    }

    @Override
    public boolean deleteById(Integer id) {
        String sql = "DELETE FROM menu_items";
        return jdbcTemplate.update(sql , id)>1;
    }

    @Override
    public Items searchById(Integer id) {
        String sql = "SELECT * FROM menu_items WHERE menu_item_id = ?";
        return jdbcTemplate.queryForObject(sql , (rs, rowNum) -> new Items(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getInt(5),
                rs.getTimestamp(6),
                rs.getTimestamp(7)
                ), id);
    }

    @Override
    public List<Items> getAll() {
        String sql = "SELECT * FROM menu_items";
        List<Items> itemsList = jdbcTemplate.query(sql , (rs, rowNum) -> {
            Items items = new Items();
            items.setId(rs.getInt(1));
            items.setName(rs.getString(2));
            items.setDescription(rs.getString(3));
            items.setCategory(rs.getString(4));
            items.setIsActive(rs.getInt(5));
            items.setCreateAt(rs.getTimestamp(6));
            items.setUpdatedAt(rs.getTimestamp(7));
            return items;
        });
        return itemsList;
    }
}
