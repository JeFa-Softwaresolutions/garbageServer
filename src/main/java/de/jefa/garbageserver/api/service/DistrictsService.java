package de.jefa.garbageserver.api.service;

import de.jefa.garbageserver.api.model.TbDistricts;
import de.jefa.garbageserver.api.repository.DistrictsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictsService {

    private final DistrictsRepository districtsRepository;

    public DistrictsService(DistrictsRepository districtsRepository) {
        this.districtsRepository = districtsRepository;
    }

    public List<TbDistricts> findAll() {
        return districtsRepository.findAll();
    }

    public List<TbDistricts> findByStatesSystemId(String systemId) {
        return districtsRepository.findByStatesSystemId(systemId);
    }

    public List<TbDistricts> findBySystemId(String systemId) {
        return districtsRepository.findBySystemId(systemId);
    }
}