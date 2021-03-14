package com.company.controller;

import com.company.model.Elevator;
import com.company.model.User;
import com.company.repository.ElevatorRepository;
import com.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ElevatorController {

    @Autowired
    private ElevatorRepository elevatorRepository;

    @PostMapping("/api/elevator")
    public Elevator saveElevator(@RequestBody Elevator elevator) {
        return elevatorRepository.save(elevator);
    }

    @GetMapping("/api/elevator/{id}")
    public Elevator getElevator(@PathVariable("id") String elevatorId) {
        return  elevatorRepository.getElevatorById(elevatorId);
    }

    @PutMapping("/api/elevator/{id}")
    public String updateElevator(@PathVariable("id") String elevatorId, @RequestBody Elevator elevator) {
        return elevatorRepository.update(elevatorId, elevator);
    }

    @DeleteMapping("/api/elevator/{id}")
    public String deleteElevator(@PathVariable("id") String elevatorId) {
        return elevatorRepository.delete(elevatorId);
    }
}
