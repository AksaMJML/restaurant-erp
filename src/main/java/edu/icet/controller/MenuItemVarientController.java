package edu.icet.controller;

import edu.icet.model.MenuItemVarient;
import edu.icet.service.MenuItemVarientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MenuItemVarient")
@RequiredArgsConstructor
public class MenuItemVarientController {

    private final MenuItemVarientService service;

    @PostMapping("/add")
    public boolean addMenuItemVarient(@RequestBody MenuItemVarient menuItemVarient){
        return service.addMenuItemVarient(menuItemVarient);
    }

}
