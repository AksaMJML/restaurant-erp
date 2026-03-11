package edu.icet.service.impl;

import edu.icet.model.MenuItemVarient;
import edu.icet.repositery.MenuItemVarientRepositery;
import edu.icet.service.MenuItemVarientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class menuItemVarientServiceImpl implements MenuItemVarientService {

    private final MenuItemVarientRepositery repositery;

    @Override
    public boolean addMenuItemVarient(MenuItemVarient menuItemVarient) {
        return repositery.addMenuItemVarient(menuItemVarient);
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
