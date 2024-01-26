package de.jefa.garbageserver.api.controller;

import de.jefa.garbageserver.api.model.TbTrashTypes;
import de.jefa.garbageserver.api.service.TrashTypesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trash_types")
public class TrashTypesController {

    private final TrashTypesService trashTypesService;

    public TrashTypesController(TrashTypesService trashTypesService) {
        this.trashTypesService = trashTypesService;
    }

    @GetMapping
    public List<TbTrashTypes> getAllDistricts() {
        return trashTypesService.findAll();
    }

    @GetMapping("/city/{systemId}")
    public List<TbTrashTypes> getTrashTypesByCitiesSystemId(@PathVariable String systemId) {
        return trashTypesService.findByCitiesSystemId(systemId);
    }

    @GetMapping("/{systemId}")
    public List<TbTrashTypes> getTrashTypeBySystemId(@PathVariable String systemId) {
        return trashTypesService.findBySystemId(systemId);
    }
}
