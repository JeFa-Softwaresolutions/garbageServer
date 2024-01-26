package de.jefa.garbageserver.api.repository;

import de.jefa.garbageserver.api.model.TbTowns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TownsRepository extends JpaRepository<TbTowns, Long> {

    @Query("SELECT t FROM TbTowns t where t.cityRef = (SELECT c.autoid FROM TbCities c WHERE c.systemId = :systemId)")
    List<TbTowns> findByCitiesSystemId(@Param("systemId") String systemId);

    List<TbTowns> findBySystemId(String systemId);
}