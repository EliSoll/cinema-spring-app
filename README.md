
[![LinkedIn][linkedin-shield]][linkedin-url]

<div align="center"><h1><img src="https://cdn-icons-png.flaticon.com/512/1183/1183669.png" alt="Logo" width="140" height="90">Cinema Spring App</h1></div>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a></li>
 <li><a href="#technologies">Technologies</a></li>
    <li><a href="#models-and-relations">Models and relations</a></li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#structure">Structure</a></li>
    <li><a href="#features">Features</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>

## About The Project

This web application supports authentication, registration, and the logic of ordering tickets for a booking service. It is built with Hibernate and Spring frameworks, following general REST principles. Project was developed according to SOLID principles with possibility of user's authentication.
The project follows a Three-Tier Architecture:
1. Presentation layer (Controllers): Accepts requests from clients and sends results back to them.
2. Application logic layer (Service): Provides logic to operate on the data sent to and from the DAO and the client.
3. Data access layer (DAO): Represents a bridge between the database and the application.

Plus, you can use my Postman request collection for testing this app: [Postman](https://www.postman.com/docking-module-specialist-85625215/workspace/cinema-app/collection/26634662-f980a27d-562a-4f22-b94d-bdc51761d173?action=share&creator=26634662)

Video presentation of this application: [video](https://www.loom.com/share/27f78048552a4c328c5c1b77982c01ae)
### 🔨Technologies

* Java  ```v.17.0.5 ```
* Maven ```v.3.8.0```
* Spring Core ```v.5.3.20```
* Hibernate Core ```v.5.6.14.Final```
* Hibernate Validator ```v.6.1.6 Final```
* MySql ```v.8.0.22```
* Java Servlets API ```v.4.0.1```
* Jackson core ```v.2.14.1```
* Javax annotation ```v.1.3.2```
* Tomcat ```v.9.0.73```

## Models and relations
<div align="center"><a href="https://i.ibb.co/N9RWb12/model-relations.png"><img src="https://i.ibb.co/N9RWb12/model-relations.png" alt="demo-app-screen-readme-git" border="0"></a></div>

## Getting Started
To get a local copy up and running follow these simple steps:
1. Clone this repository.
2. Install MySQL and create an empty database.
4. Open db.properties file and write information about your database. Configure ```URL```, ```USERNAME```, ```PASSWORD```, ```DRIVER``` and ```DIALECT```properties with the corresponding values for your DB's connection.
5. Build the project using Maven:
 ```sh
  mvn clean install
  ```
6. Deploy the WAR file to Tomcat. Configure Apache Tomcat version 9.0.73 Artifact: war-exploded artifact, Application context: "/";

## Structure

* config: classes with app's configuration
* controller: basic controllers that handle HTTP requests and responses
   1. AuthenticationController - POST ```/register``` - register new user
   2. CinemaHallController - POST ```/cinema-halls``` - add cinema-hall
   3. CinemaHallController - GET ```/cinema-halls``` - get all cinema-halls
   4. MovieController - POST ```/movies``` - add movie
   5. MovieController - GET ```/movies``` - get all movies
   6. MovieSessionController - POST ```/movie-sessions``` - add movie-session
   7. MovieSessionController - GET ```/movie-sessions/available``` - get available movie-session
   8. MovieSessionController - PUT ```/movie-sessions/{id}``` - update movie-session
   9. MovieSessionController - DELETE ```/movie-sessions/{id}``` - delete movie-session
  10. UserController - GET ```/users/by-email``` - get user by username
  11. ShoppingCartController - GET ```/shopping-carts/by-user``` - get all movie-session in current user shopping cart
  12. ShoppingCartController - PUT ```/shopping-carts/movie-sessions``` - add movie-session to current user shopping cart
  13. OrderController - POST ```/orders/complete``` - complete user order
  14. OrderController - GET ```/orders``` - show all order history for current user
* dao: Data Access Object interfaces and their implementations
* dto: Data Transfer Object
* exception: custom data exceptions
* lib: email and password validation
* model: all data models
* service: services with ther implementations
* security: security service CustomUserDetailService
* util: utility class DateTimePatternUtil

## Features
For registered users with the USER role:

1. Find movies and cinema halls 
2. Find available movie sessions 
3. Create shopping cart 
4. Add tickets to shopping cart 
5. View shopping cart 
6. Make an order 
7. View order history 

For registered users with the ADMIN role:

1. Create and find movies and cinema halls
2. Create and find available movie sessions
3. Find user by email


## Contact

Elvira Solnyshkina - elvira.solnyshkina@gmail.com

LinkedIn: [linkedin.com/in/elvira-solnyshkina](https://www.linkedin.com/in/elvira-solnyshkina-232958117/)
<div align="right"><img src="https://i.ibb.co/cJyzyTZ/629b7b077c5cd817694c3233.png" alt="Logo" width="180" height="60">

Project Link: [EliSoll/cinema-spring-app](https://github.com/EliSoll/cinema-spring-app)</div>

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/elvira-solnyshkina-232958117/
