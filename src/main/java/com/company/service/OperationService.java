package com.company.service;

import com.company.model.Building;
import com.company.model.Elevator;
import com.company.model.ElevatorState;
import com.company.model.User;
import com.company.repository.BuildingRepository;
import com.company.repository.ElevatorRepository;
import com.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class OperationService {

    @Autowired
    private BuildingRepository buildingRepository;

    @Autowired
    private ElevatorRepository elevatorRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Building> getAllUserBuildings(String userId) {
        User user = userRepository.getUserById(userId);
        List<Building> buildings = new ArrayList<>();

        for (String buildingId: user.getBuildingIds()) {
            buildings.add(buildingRepository.getBuildingById(buildingId));
        }

        return buildings;
    }

    public Building getUserBuilding(String buildingId) {
        return buildingRepository.getBuildingById(buildingId);
    }

    public List<ElevatorState> getAllElevatorStates(String buildingId) {
        List<String> elevatorIds = buildingRepository.getBuildingById(buildingId).getElevatorIds();
        List<ElevatorState> states = new ArrayList<>();

        for(String elevatorId: elevatorIds) {
            states.add(elevatorRepository.getElevatorById(elevatorId).getElevatorState());
        }

        return states;
    }

    public Elevator summonElevator(String elevatorId) {
        Elevator elevator = elevatorRepository.getElevatorById(elevatorId);
        // do some additional logic here to get if the elevator needs to go up/down based on users current floor?
        elevator.setElevatorState(ElevatorState.DOWN);
        return  elevator;
    }

    public Elevator setFloor(String elevatorId, int floor) {
        // Tell the elevator to start moving towards the users floor?
        Elevator elevator = elevatorRepository.getElevatorById(elevatorId);
        elevator.setCurrentFloor(floor);

        return elevator;
    }
}
