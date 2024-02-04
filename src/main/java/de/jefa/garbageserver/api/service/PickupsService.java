package de.jefa.garbageserver.api.service;

import de.jefa.garbageserver.api.model.TbPickups;
import de.jefa.garbageserver.api.repository.PickupsRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PickupsService {

    private final PickupsRepository pickupsRepository;

    public PickupsService(PickupsRepository pickupsRepository) {
        this.pickupsRepository = pickupsRepository;
    }

    public List<TbPickups> findByPickupDistrictSystemIdAndTrashTypeSystemid(String pickupDistrictRef, String trashTypeRef) {
        return pickupsRepository.findByPickupDistrictsSystemIdAndTrashTypesSystemId(pickupDistrictRef, trashTypeRef);
    }

    public TbPickups findNextByPickupDistrictSystemIdAndTrashTypeSystemid(String pickupDistrictRef, String trashTypeRef) {
        final Date now = new Date();
        final List<TbPickups> pickups = pickupsRepository.findByPickupDistrictsSystemIdAndTrashTypesSystemId(pickupDistrictRef, trashTypeRef);
        final List<Date> dates = pickups.stream().map(TbPickups::getDate).collect(Collectors.toList());
        final Date nextDate = dates.stream().filter(date -> date.after(now)).min(Comparator.naturalOrder()).orElse(null);
        return pickups.stream().filter(e -> e.getDate().equals(nextDate)).toList().get(0);
    }
}