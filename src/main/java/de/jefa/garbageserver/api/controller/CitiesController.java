package de.jefa.garbageserver.api.controller;

import de.jefa.garbageserver.api.model.TbCities;
import de.jefa.garbageserver.api.service.CitiesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {

    private final CitiesService citiesService;

    public CitiesController(CitiesService citiesService) {
        this.citiesService = citiesService;
    }

    @GetMapping
    public List<TbCities> getAllCities() {
        return citiesService.findAll();
    }

    @GetMapping("/district/{systemId}")
    public List<TbCities> getCitiesByDistrictsSystemId(@PathVariable String systemId) {
        return citiesService.findByDistrictsSystemId(systemId);
    }

    @GetMapping("/{systemId}")
    public List<TbCities> getCityBySystemId(@PathVariable String systemId) {
        return citiesService.findBySystemId(systemId);
    }
}