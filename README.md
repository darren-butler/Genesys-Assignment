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
* [Add a user] (https://github.com/dnbutler64/Genesys-Assignment/blob/master/README.md#1) : `POST /api/user`
* Update a user : `PUT /api/user/{id}`
* Find a building : `GET /api/user/building/{buildingId}`
* Get status of all elevators in a building : `GET /api/user/elevatorStates/{buildingId}`
* User summons an elevator : `GET /api/user/elevator/{elevatorId}`
* User selects a floor : `PUT /api/user/elevator/{elevatorId}`

### Add a user <a name="1"></a>

**URL** : `/api/user/`

**Method** : `POST`

**Content** : In this example, the User can see three Accounts as AccountAdmin
`AA`, Viewer `VV`, and Owner `OO` - in that order:

```json
{
    "userName": "John",
    "buildingIds": [
        "1234",
        "5678"
    ]
}
```
