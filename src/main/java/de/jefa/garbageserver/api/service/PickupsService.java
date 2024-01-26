package de.jefa.garbageserver.api.service;

import de.jefa.garbageserver.api.model.TbPickups;
import de.jefa.garbageserver.api.repository.PickupsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PickupsService {

    private final PickupsRepository pickupsRepository;

    public PickupsService(PickupsRepository pickupsRepository) {
        this.pickupsRepository = pickupsRepository;
    }

    public List<TbPickups> findByPickupDistrictSystemIdAndTrashTypeSystemid(String pickupDistrictRef, String trashTypeRef) {
        return pickupsRepository.findByPickupDistrictsSystemIdAndTrashTypesSystemId(pickupDistrictRef, trashTypeRef);
    }
}