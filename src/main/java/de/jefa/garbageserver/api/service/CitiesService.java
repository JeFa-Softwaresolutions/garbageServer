package de.jefa.garbageserver.api.service;

import de.jefa.garbageserver.api.model.TbCities;
import de.jefa.garbageserver.api.repository.CitiesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitiesService {

    private final CitiesRepository citiesRepository;

    public CitiesService(CitiesRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }

    public List<TbCities> findAll() {
        return citiesRepository.findAll();
    }

    public List<TbCities> findByDistrictsSystemId(String systemId) {
        return citiesRepository.findByDistrictsSystemId(systemId);
    }

    public List<TbCities> findBySystemId(String systemId) {
        return citiesRepository.findBySystemId(systemId);
    }
}