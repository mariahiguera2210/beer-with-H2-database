# Database connection with H2

This project is a simple example of how to connect to a database with H2 using Spring Boot JPA. The project creates a database of  beers. 

### 1. Start the application:
mvn spring-boot:run
The application will start on port 8080. You can access the API at http://localhost:8080/api/v1/beer


### 2. Database:
The database is a H2 database in memory. The database schema is created automatically when the application starts.
Example requests:

* Create a beer:

#### `POST http://localhost:8080/api/v1/beer/beers`
```json
{
    "name": "Corona",
    "alcoholGrade": 3.5,
    "type": "Light"
} 
