package de.jefa.garbageserver.api.repository;

import de.jefa.garbageserver.api.model.TbTrashTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrashTypesRepository extends JpaRepository<TbTrashTypes, Long> {

    @Query("SELECT tt FROM TbTrashTypes tt where tt.cityRef = (SELECT c.autoid FROM TbCities c WHERE c.systemId = :systemId)")
    List<TbTrashTypes> findByCitiesSystemId(@Param("systemId") String systemId);

    List<TbTrashTypes> findBySystemId(String systemId);
}