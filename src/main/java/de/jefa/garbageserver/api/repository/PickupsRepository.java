package de.jefa.garbageserver.api.repository;

import de.jefa.garbageserver.api.model.TbPickups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PickupsRepository extends JpaRepository<TbPickups, Long> {

    @Query("SELECT p FROM TbPickups p where p.pickupDistrictRef = (SELECT pd.autoid FROM TbPickupDistricts pd WHERE pd.systemId = :pickupDistrictsSystemId) AND p.trashTypeRef = (SELECT tt.autoid FROM TbTrashTypes tt WHERE tt.systemId = :trashTypesSystemId)")
    List<TbPickups> findByPickupDistrictsSystemIdAndTrashTypesSystemId(@Param("pickupDistrictsSystemId") String pickupDistrictsSystemId, @Param("trashTypesSystemId") String trashTypesSystemId);
}