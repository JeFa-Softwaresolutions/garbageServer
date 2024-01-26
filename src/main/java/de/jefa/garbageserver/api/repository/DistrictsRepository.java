package de.jefa.garbageserver.api.repository;

import de.jefa.garbageserver.api.model.TbDistricts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DistrictsRepository extends JpaRepository<TbDistricts, Long> {

    @Query("SELECT d FROM TbDistricts d where d.stateRef = (SELECT s.autoid FROM TbStates s WHERE s.systemId = :systemId)")
    List<TbDistricts> findByStatesSystemId(@Param("systemId") String systemId);

    List<TbDistricts> findBySystemId(String systemId);
}
