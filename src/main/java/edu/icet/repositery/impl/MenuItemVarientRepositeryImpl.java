package edu.icet.repositery.impl;

import edu.icet.model.MenuItemVarient;
import edu.icet.repositery.MenuItemVarientRepositery;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MenuItemVarientRepositeryImpl implements MenuItemVarientRepositery {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public boolean addMenuItemVarient(MenuItemVarient menuItemVarient) {
        String sql = "INSERT INTO menu_item_variants VALUES (?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                menuItemVarient.getMenuItemId(),
                menuItemVarient.getPortionSizeId(),
                menuItemVarient.getPrice(),
                menuItemVarient.getPrepTimeMinutes(),
                menuItemVarient.getIsAvailable(),
                menuItemVarient.getCreatedAt(),
                menuItemVarient.getUpdatedAt()
        )>0;
    }

    @Override
    public boolean updateMenuItemVarient(MenuItemVarient menuItemVarient) {
        return false;
    }

    @Override
    public boolean deleteById(Integer varientId) {
        return false;
    }

    @Override
    public MenuItemVarient searchById(Integer varientId) {
        return null;
    }

    @Override
    public List<MenuItemVarient> getAll() {
        return List.of();
    }
}
