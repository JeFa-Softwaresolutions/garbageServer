package de.jefa.garbageserver.api.repository;

import de.jefa.garbageserver.api.model.TbPickupDistricts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PickupDistrictsRepository extends JpaRepository<TbPickupDistricts, Long> {

    @Query("SELECT pd FROM TbPickupDistricts pd where pd.autoid = (SELECT t.pickupDistrictRef FROM TbTowns t WHERE t.systemId = :systemId)")
    List<TbPickupDistricts> findByTownsSystemId(@Param("systemId") String systemId);

    @Query("SELECT pd FROM TbPickupDistricts pd where pd.autoid = (SELECT s.pickupDistrictRef FROM TbStreets s WHERE s.systemId = :systemId)")
    List<TbPickupDistricts> findByStreetsSystemId(@Param("systemId") String systemId);

    List<TbPickupDistricts> findBySystemId(String systemId);
}
