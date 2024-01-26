package de.jefa.garbageserver.api.repository;

import de.jefa.garbageserver.api.model.TbStreets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StreetsRepository extends JpaRepository<TbStreets, Long> {

    @Query("SELECT s FROM TbStreets s where s.townRef = (SELECT t.autoid FROM TbTowns t WHERE t.systemId = :systemId)")
    List<TbStreets> findByTownsSystemId(@Param("systemId") String systemId);

    List<TbStreets> findBySystemId(String systemId);
}