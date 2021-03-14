package com.company.controller;

import com.company.model.Building;
import com.company.model.Elevator;
import com.company.model.ElevatorState;
import com.company.model.User;
import com.company.repository.UserRepository;
import com.company.service.OperationService;
import com.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private OperationService buildingService;

    // Add User
    @PostMapping("/api/user")
    public User saveUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    // Update User
    @PutMapping("/api/user/{id}")
    public String updateUser(@PathVariable("id") String userId, @RequestBody User user) {
        return userService.updateUser(userId, user);
    }

    // Find a building for a user
    @GetMapping("/api/user/building/{buildingId}")
    public Building getBuilding(@PathVariable("buildingId") String buildingId) {
        return buildingService.getUserBuilding(buildingId);
    }

    // Get states of all elevators for a user
    @GetMapping("/api/user/elevatorStates/{buildingId}")
    public List<ElevatorState> getElevatorStates(@PathVariable("buildingId") String buildingId) {
        return buildingService.getAllElevatorStates(buildingId);
    }

    // Summon an Elevator
    @GetMapping("/api/user/elevator/{elevatorId}")
    public Elevator summonElevator(@PathVariable("elevatorId") String elevatorId) {
        return buildingService.summonElevator(elevatorId);
    }

    // User selects floor
    @PutMapping("/api/user/elevator/{elevatorId}")
    public Elevator setFloor(@PathVariable("elevatorId") String elevatorId, @RequestParam(value="floor") int floor) {
        return buildingService.setFloor(elevatorId, floor);
    }


//    THESE ENDPOINTS WERE JUST SETUP INITIALLY TO POPULATE THE DB

//    @GetMapping("/api/user/{id}")
//    public User getUser(@PathVariable("id") String userId) {
//        return  userRepository.getUserById(userId);
//    }
//
//    @DeleteMapping("/api/user/{id}")
//    public String deleteUser(@PathVariable("id") String userId) {
//        return userRepository.delete(userId);
//    }
//
//    @GetMapping("/api/user/{id}/buildings")
//    public List<Building> getUserBuildings(@PathVariable("id") String userId) {
//        return buildingService.getAllUserBuildings(userId);
//    }

}
