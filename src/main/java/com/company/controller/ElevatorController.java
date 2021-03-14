package com.company.controller;

import com.company.model.Elevator;
import com.company.repository.ElevatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Deprecated
@RestController
public class ElevatorController {

    @Autowired
    private ElevatorRepository elevatorRepository;

//    THESE ENDPOINTS WERE JUST SETUP INITIALLY TO POPULATE THE DB

    @Deprecated
    @PostMapping("/api/elevator")
    public Elevator saveElevator(@RequestBody Elevator elevator) {
        return elevatorRepository.save(elevator);
    }

    @Deprecated
    @GetMapping("/api/elevator/{id}")
    public Elevator getElevator(@PathVariable("id") String elevatorId) {
        return  elevatorRepository.getElevatorById(elevatorId);
    }

    @Deprecated
    @PutMapping("/api/elevator/{id}")
    public String updateElevator(@PathVariable("id") String elevatorId, @RequestBody Elevator elevator) {
        return elevatorRepository.update(elevatorId, elevator);
    }

    @Deprecated
    @DeleteMapping("/api/elevator/{id}")
    public String deleteElevator(@PathVariable("id") String elevatorId) {
        return elevatorRepository.delete(elevatorId);
    }
}
