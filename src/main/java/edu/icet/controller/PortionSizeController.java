package edu.icet.controller;

import edu.icet.model.PortionSizes;
import edu.icet.service.PortionSizeService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/PortionSize")
@RequiredArgsConstructor
public class PortionSizeController {

    private final PortionSizeService service;

    @GetMapping("/get")
    public List<PortionSizes> getAll(){
        return service.getAll();
    }
}
