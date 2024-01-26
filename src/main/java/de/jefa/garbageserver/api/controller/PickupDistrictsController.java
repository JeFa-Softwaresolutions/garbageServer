package de.jefa.garbageserver.api.controller;

import de.jefa.garbageserver.api.model.TbPickupDistricts;
import de.jefa.garbageserver.api.service.PickupDistrictsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pickup_districts")
public class PickupDistrictsController {

    private final PickupDistrictsService pickupDistrictsService;

    public PickupDistrictsController(PickupDistrictsService pickupDistrictsService) {
        this.pickupDistrictsService = pickupDistrictsService;
    }

    @GetMapping
    public List<TbPickupDistricts> getAllDistricts() {
        return pickupDistrictsService.findAll();
    }

    @GetMapping("/town/{systemId}")
    public List<TbPickupDistricts> getPickupDistrictsByTownsSystemId(@PathVariable String systemId) {
        return pickupDistrictsService.findByTownsSystemId(systemId);
    }

    @GetMapping("/street/{systemId}")
    public List<TbPickupDistricts> getPickupDistrictsByStreetsSystemId(@PathVariable String systemId) {
        return pickupDistrictsService.findByStreetsSystemId(systemId);
    }

    @GetMapping("/{systemId}")
    public List<TbPickupDistricts> getDistrictBySystemId(@PathVariable String systemId) {
        return pickupDistrictsService.findBySystemId(systemId);
    }
}