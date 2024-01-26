package de.jefa.garbageserver.api.repository;

import de.jefa.garbageserver.api.model.TbCities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CitiesRepository extends JpaRepository<TbCities, Long> {

    @Query("SELECT c FROM TbCities c where c.districtRef = (SELECT d.autoid FROM TbDistricts d WHERE d.systemId = :systemId)")
    List<TbCities> findByDistrictsSystemId(@Param("systemId") String systemId);

    List<TbCities> findBySystemId(String systemId);
}