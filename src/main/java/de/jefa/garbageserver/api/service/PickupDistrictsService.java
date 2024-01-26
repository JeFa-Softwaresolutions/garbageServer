package de.jefa.garbageserver.api.service;

import de.jefa.garbageserver.api.model.TbPickupDistricts;
import de.jefa.garbageserver.api.repository.PickupDistrictsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PickupDistrictsService {

    private final PickupDistrictsRepository pickupDistrictsRepository;

    public PickupDistrictsService(PickupDistrictsRepository pickupDistrictsRepository) {
        this.pickupDistrictsRepository = pickupDistrictsRepository;
    }

    public List<TbPickupDistricts> findAll() {
        return pickupDistrictsRepository.findAll();
    }

    public List<TbPickupDistricts> findByTownsSystemId(String systemId) {
        return pickupDistrictsRepository.findByTownsSystemId(systemId);
    }

    public List<TbPickupDistricts> findByStreetsSystemId(String systemId) {
        return pickupDistrictsRepository.findByStreetsSystemId(systemId);
    }

    public List<TbPickupDistricts> findBySystemId(String systemId) {
        return pickupDistrictsRepository.findBySystemId(systemId);
    }
}