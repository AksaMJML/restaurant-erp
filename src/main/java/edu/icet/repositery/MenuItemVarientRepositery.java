package edu.icet.repositery;

import edu.icet.model.MenuItemVarient;

import java.util.List;

public interface MenuItemVarientRepositery {
    boolean addMenuItemVarient(MenuItemVarient menuItemVarient);
    boolean updateMenuItemVarient(MenuItemVarient menuItemVarient);
    boolean deleteById(Integer varientId);
    MenuItemVarient searchById(Integer varientId);
    List<MenuItemVarient> getAll();
}
