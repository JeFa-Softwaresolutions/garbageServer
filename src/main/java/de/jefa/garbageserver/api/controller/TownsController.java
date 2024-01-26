package de.jefa.garbageserver.api.controller;

import de.jefa.garbageserver.api.model.TbTowns;
import de.jefa.garbageserver.api.service.TownsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/towns")
public class TownsController {

    private final TownsService townsService;

    public TownsController(TownsService townsService) {
        this.townsService = townsService;
    }

    @GetMapping
    public List<TbTowns> getAllDistricts() {
        return townsService.findAll();
    }

    @GetMapping("/city/{systemId}")
    public List<TbTowns> getTownsByCitiesSystemId(@PathVariable String systemId) {
        return townsService.findByCitiesSystemId(systemId);
    }

    @GetMapping("/{systemId}")
    public List<TbTowns> getTownBySystemId(@PathVariable String systemId) {
        return townsService.findBySystemId(systemId);
    }
}
