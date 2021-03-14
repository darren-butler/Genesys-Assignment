package com.company.controller;

import com.company.model.Building;
import com.company.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BuildingController {

    @Autowired
    private BuildingRepository buildingRepository;

    @PostMapping("/api/building")
    public Building saveBuilding(@RequestBody Building building) {
        return buildingRepository.save(building);
    }

    @GetMapping("/api/building/{id}")
    public Building getBuilding(@PathVariable("id") String buildingId) {
        return buildingRepository.getBuildingById(buildingId);
    }

    @PutMapping("/api/building/{id}")
    public String updateBuilding(@PathVariable("id") String buildingId, @RequestBody Building building) {
        return buildingRepository.update(buildingId, building);
    }

    @DeleteMapping("/api/building/{id}")
    public String deleteBuilding(@PathVariable("id") String buildingId) {
        return buildingRepository.delete(buildingId);
    }
}
