package de.jefa.garbageserver.api.service;

import de.jefa.garbageserver.api.model.TbStates;
import de.jefa.garbageserver.api.repository.StatesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatesService {

    private final StatesRepository statesRepository;

    public StatesService(StatesRepository statesRepository) {
        this.statesRepository = statesRepository;
    }

    public List<TbStates> findAll() {
        return statesRepository.findAll();
    }

    public List<TbStates> findBySystemId(String systemId) {
        return statesRepository.findBySystemId(systemId);
    }
}