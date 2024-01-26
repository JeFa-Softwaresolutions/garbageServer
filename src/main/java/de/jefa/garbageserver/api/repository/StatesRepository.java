package de.jefa.garbageserver.api.repository;

import de.jefa.garbageserver.api.model.TbStates;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatesRepository extends JpaRepository<TbStates, Long> {

    List<TbStates> findBySystemId(String systemId);
}
