package com.company.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.company.model.Building;
import com.company.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BuildingRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Building save(Building building) {
        dynamoDBMapper.save(building);
        return building;
    }

    public Building getBuildingById(String buildingId) {
        return dynamoDBMapper.load(Building.class, buildingId);
    }

    public String update(String buildingId, Building building) {
        dynamoDBMapper.save(building,
                new DynamoDBSaveExpression()
                    .withExpectedEntry("buildingId",
                            new ExpectedAttributeValue(
                                    new AttributeValue()
                                            .withS(buildingId)
                            )));
        return buildingId;
    }

    public String delete(String buildingId) {
        Building building = dynamoDBMapper.load(Building.class, buildingId);
        dynamoDBMapper.delete(building);
        return "Building Deleted";
    }
}
