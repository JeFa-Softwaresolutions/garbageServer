package de.jefa.garbageserver.api.controller;

import de.jefa.garbageserver.api.model.TbStreets;
import de.jefa.garbageserver.api.service.StreetsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/streets")
public class StreetsController {

    private final StreetsService streetsService;

    public StreetsController(StreetsService streetsService) {
        this.streetsService = streetsService;
    }

    @GetMapping
    public List<TbStreets> getAllDistricts() {
        return streetsService.findAll();
    }

    @GetMapping("/city/{systemId}")
    public List<TbStreets> getStreetsByCitiesSystemId(@PathVariable String systemId) {
        return streetsService.findByCitiesSystemId(systemId);
    }

    @GetMapping("/{systemId}")
    public List<TbStreets> getTownBySystemId(@PathVariable String systemId) {
        return streetsService.findBySystemId(systemId);
    }
}