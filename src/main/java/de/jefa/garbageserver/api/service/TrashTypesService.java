package de.jefa.garbageserver.api.service;

import de.jefa.garbageserver.api.model.TbTrashTypes;
import de.jefa.garbageserver.api.repository.TrashTypesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrashTypesService {

    private final TrashTypesRepository trashTypesRepository;

    public TrashTypesService(TrashTypesRepository trashTypesRepository) {
        this.trashTypesRepository = trashTypesRepository;
    }

    public List<TbTrashTypes> findAll() {
        return trashTypesRepository.findAll();
    }

    public List<TbTrashTypes> findByCitiesSystemId(String systemId) {
        return trashTypesRepository.findByCitiesSystemId(systemId);
    }

    public List<TbTrashTypes> findBySystemId(String systemId) {
        return trashTypesRepository.findBySystemId(systemId);
    }
}