## Intro
This repository is my submission for a Genesys code challenge

## Build & Run
```sh
git clone https://github.com/dnbutler64/Genesys-Assignment.git
cd Genesys-Assignment
mvn clean install
mvn spring-boot:run
```

## API Endpoints
* Add a user : `POST /api/user`
* Update a user : `PUT /api/user/{id}`
* Find a building : `GET /api/user/building/{buildingId}`
* Get status of all elevators in a building : `GET /api/user/elevatorStates/{buildingId}`
* User summons an elevator : `GET /api/user/elevator/{elevatorId}`
* User selects a floor : `PUT /api/user/elevator/{elevatorId}`
