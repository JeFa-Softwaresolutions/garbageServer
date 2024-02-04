package de.jefa.garbageserver.api.service;

import de.jefa.garbageserver.api.model.TbStreets;
import de.jefa.garbageserver.api.repository.StreetsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetsService {

    private final StreetsRepository streetsRepository;

    public StreetsService(StreetsRepository streetsRepository) {
        this.streetsRepository = streetsRepository;
    }

    public List<TbStreets> findAll() {
        return streetsRepository.findAll();
    }

    public List<TbStreets> findByCitiesSystemId(String systemId) {
        return streetsRepository.findByCitiesSystemId(systemId);
    }

    public List<TbStreets> findBySystemId(String systemId) {
        return streetsRepository.findBySystemId(systemId);
    }
}