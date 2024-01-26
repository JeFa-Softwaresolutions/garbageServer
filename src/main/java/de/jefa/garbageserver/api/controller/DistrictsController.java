package de.jefa.garbageserver.api.controller;

import de.jefa.garbageserver.api.model.TbDistricts;
import de.jefa.garbageserver.api.service.DistrictsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/districts")
public class DistrictsController {

    private final DistrictsService districtsService;

    public DistrictsController(DistrictsService districtsService) {
        this.districtsService = districtsService;
    }

    @GetMapping
    public List<TbDistricts> getAllDistricts() {
        return districtsService.findAll();
    }

    @GetMapping("/state/{systemId}")
    public List<TbDistricts> getDistrictsByStatesSystemId(@PathVariable String systemId) {
        return districtsService.findByStatesSystemId(systemId);
    }

    @GetMapping("/{systemId}")
    public List<TbDistricts> getDistrictBySystemId(@PathVariable String systemId) {
        return districtsService.findBySystemId(systemId);
    }
}