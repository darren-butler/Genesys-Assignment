package com.company.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.company.model.Elevator;
import com.company.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.stereotype.Repository;

@Repository
public class ElevatorRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Elevator save(Elevator elevator) {
        dynamoDBMapper.save(elevator);
        return elevator;
    }

    public Elevator getElevatorById(String elevatorId) {

        return dynamoDBMapper.load(Elevator.class, elevatorId);
    }

    public String update(String elevatorId, Elevator elevator) {
        dynamoDBMapper.save(elevator,
                new DynamoDBSaveExpression()
                        .withExpectedEntry("elevatorId",
                                new ExpectedAttributeValue(
                                        new AttributeValue()
                                                .withS(elevatorId)
                                )));
        return elevatorId;
    }

    public String delete(String elevatorId) {
        Elevator elevator = dynamoDBMapper.load(Elevator.class, elevatorId);
        dynamoDBMapper.delete(elevator);
        return "Elevator Deleted";
    }
}
