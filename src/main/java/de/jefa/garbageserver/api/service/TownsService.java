package de.jefa.garbageserver.api.service;

import de.jefa.garbageserver.api.model.TbTowns;
import de.jefa.garbageserver.api.repository.TownsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TownsService {

    private final TownsRepository townsRepository;

    public TownsService(TownsRepository townsRepository) {
        this.townsRepository = townsRepository;
    }

    public List<TbTowns> findAll() {
        return townsRepository.findAll();
    }

    public List<TbTowns> findByCitiesSystemId(String systemId) {
        return townsRepository.findByCitiesSystemId(systemId);
    }

    public List<TbTowns> findBySystemId(String systemId) {
        return townsRepository.findBySystemId(systemId);
    }
}