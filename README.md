# Helmes App
Java Case Study – Helmes App

# Task
1. The API should expose a “/v1/helmes” endpoint to retrieve the weather forecast information.
2. The “/v1/helmes” endpoint should return a JSON object that gives the below information:
    * Name
    * Sectors List
    * acceptedTerms

# Tools Used

Spring Boot 2.

Java 11.

Swagger.

Lombok

Mapstruct

H2
## 

Import into your IDE as a gradle project and run.
In order to check entries in DB, login to http://localhost:8080/h2, with datasource url, jdbc:h2:~/helmes and check the tables.

# Documentation

Documentation can be found [here Swagger-UI](http://localhost:8081/swagger-ui.html) while the project is running

# Example of usage
```
curl -X POST "http://localhost:8080/v1/helmes" -H "accept: */*" -H "language: eng" -H "Content-Type: application/json" -d "{ \"acceptedTerms\": true, \"name\": \"Vineet\", \"sector\": [ { \"label\": \"Manufacturing\", \"value\": \"1\" } ]}"
``` 
This is a POST request.

On running the above URL with POST method on Swagger or any other rest client of your choice, the API will generate a result as below :

`{
"name": "Vineet",
"sector": [
{
"label": "Manufacturing",
"value": "1"
}
],
"acceptedTerms": true
}
`
