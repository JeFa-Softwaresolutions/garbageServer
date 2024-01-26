package de.jefa.garbageserver.api.controller;

import de.jefa.garbageserver.api.model.TbStates;
import de.jefa.garbageserver.api.service.StatesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/states")
public class StatesController {

    private final StatesService statesService;

    public StatesController(StatesService statesService) {
        this.statesService = statesService;
    }

    @GetMapping
    public List<TbStates> getAllStates() {
        return statesService.findAll();
    }

    @GetMapping("/{systemId}")
    public List<TbStates> getStatesBySystemId(@PathVariable String systemId) {
        return statesService.findBySystemId(systemId);
    }
}
