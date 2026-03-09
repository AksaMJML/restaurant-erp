package edu.icet.controller;

import edu.icet.model.Items;
import edu.icet.service.ItemService;
import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService service;

    @PostMapping("/add")
    public boolean addItems(@RequestBody Items items){
        return service.addItem(items);
    }

    @PutMapping("/update")
    public boolean updateItems(@RequestBody Items items){
        return service.updateItems(items);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return service.deleteById(id);
    }

    @GetMapping("/search-by-id/{id}")
    public Items searchById(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/getAll")
    public List<Items> getAll(){
        return service.getAll();
    }

}
