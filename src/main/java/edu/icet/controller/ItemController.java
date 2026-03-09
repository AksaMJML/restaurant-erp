package edu.icet.controller;

import edu.icet.model.Items;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService service;

    @PostMapping("/add")
    public boolean addItems(@RequestBody Items items){
        return service.addItem(items);
    }

}
