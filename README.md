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
* [Add a user](https://github.com/dnbutler64/Genesys-Assignment/blob/master/README.md#1) : `POST /api/user`
* [Update a user](https://github.com/dnbutler64/Genesys-Assignment/blob/master/README.md#2) : `PUT /api/user/{id}`
* [Find a building](https://github.com/dnbutler64/Genesys-Assignment/blob/master/README.md#3) : `GET /api/user/building/{buildingId}`
* [Get status of all elevators in a building](https://github.com/dnbutler64/Genesys-Assignment/blob/master/README.md#4) : `GET /api/user/elevatorStates/{buildingId}`
* [User summons an elevator](https://github.com/dnbutler64/Genesys-Assignment/blob/master/README.md#5) : `GET /api/user/elevator/{elevatorId}`
* [User selects a floor](https://github.com/dnbutler64/Genesys-Assignment/blob/master/README.md#6) : `PUT /api/user/elevator/{elevatorId}`

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
### Update a user <a name="2"></a>

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
### Find a building <a name="3"></a>

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
### Get status of all elevators in a building <a name="4"></a>

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
### User summons an elevator <a name="5"></a>

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
### User selects a floor <a name="6"></a>

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
