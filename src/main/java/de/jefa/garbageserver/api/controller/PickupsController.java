package de.jefa.garbageserver.api.controller;

import de.jefa.garbageserver.api.model.TbPickups;
import de.jefa.garbageserver.api.service.PickupsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pickups")
public class PickupsController {

    private final PickupsService pickupsService;

    public PickupsController(PickupsService pickupsService) {
        this.pickupsService = pickupsService;
    }

    @GetMapping("/pickup_district_trash_type/{pickupDistrictRef}&{trashTypeRef}")
    public List<TbPickups> getPickupsByPickupDistrictsSystemIdAndTrashTypesSystemId(@PathVariable String pickupDistrictRef, @PathVariable String trashTypeRef) {
        return pickupsService.findByPickupDistrictSystemIdAndTrashTypeSystemid(pickupDistrictRef, trashTypeRef);
    }

    @GetMapping("/pickup_district_trash_type/next/{pickupDistrictRef}&{trashTypeRef}")
    public TbPickups getNextPickupByPickupDistrictsSystemIdAndTrashTypesSystemId(@PathVariable String pickupDistrictRef, @PathVariable String trashTypeRef) {
        return pickupsService.findNextByPickupDistrictSystemIdAndTrashTypeSystemid(pickupDistrictRef, trashTypeRef);
    }
}
