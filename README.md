User Management System using Spring Core (Layered Architecture)

Project Overview

This project is a basic backend application developed using Spring Core to demonstrate the concept of Dependency Injection (DI) and Inversion of Control (IoC). It follows a layered architecture pattern where different responsibilities are separated into Controller, Service, Repository, and Database layers.

The application simulates a simple user management system where a user can be created and stored using a database connection class. Instead of using a real database, the system uses a mock database layer to focus on understanding Spring fundamentals.

Objectives
To understand how Spring manages objects using IoC
To implement Dependency Injection across multiple layers
To learn how to structure a backend project using layered architecture
To reduce tight coupling between components
To understand how annotations simplify configuration
Technologies Used
Java
Spring Core (Annotation-based configuration)
IntelliJ IDEA
Maven (if used in your setup)
Project Structure
src/main/java
 ├── Config
 │     └── ConfigApp.java
 ├── Controllers
 │     └── UserController.java
 ├── Service
 │     └── UserService.java
 ├── Repository
 │     └── UserRepository.java
 ├── db
 │     └── DatabaseConnection.java
 └── MainApp.java
Layer-wise Explanation
1. Configuration Layer

The ConfigApp class is responsible for configuring Spring. It enables component scanning so that Spring can detect and manage all annotated classes as beans.

2. Controller Layer

The UserController acts as the entry point of the application. It receives user-related requests and delegates the work to the service layer.

Responsibilities:

Accept user input
Call appropriate service methods
Maintain separation from business logic
3. Service Layer

The UserService contains the business logic of the application. It processes data and applies rules before passing it to the repository layer.

Responsibilities:

Handle business logic
Act as a bridge between controller and repository
Ensure proper flow of data
4. Repository Layer

The UserRepository handles data operations. It communicates with the database layer to store or retrieve user information.

Responsibilities:

Interact with the database layer
Perform CRUD-like operations
Abstract database logic from upper layers
5. Database Layer

The DatabaseConnection simulates a database. It contains methods that represent saving or retrieving data.

Responsibilities:

Simulate database operations
Provide low-level data handling
6. Main Application

The MainApp class initializes the Spring ApplicationContext and retrieves the UserController bean. It then triggers methods to simulate application flow.

Working Flow
The application starts from MainApp
Spring initializes all beans using AnnotationConfigApplicationContext
UserController is retrieved from the context
createUser() method is called
Request flows as follows:
UserController → UserService → UserRepository → DatabaseConnection
The database layer prints a message simulating data storage
Key Concepts Demonstrated
1. Inversion of Control (IoC)

Spring manages the creation and lifecycle of objects instead of the developer manually creating them.

2. Dependency Injection (DI)

Dependencies between classes are automatically injected by Spring using annotations like @Autowired.

3. Loose Coupling

Each layer is independent and interacts through well-defined interfaces, making the system flexible and maintainable.

4. Component Scanning

Spring automatically detects classes annotated with @Component, @Service, @Repository, etc., and registers them as beans.

Advantages of This Design
Clear separation of concerns
Easy to maintain and extend
Scalable architecture
Follows industry-standard backend structure
Helps transition to Spring Boot and real-world applications
Limitations
No real database integration
No REST API or web layer
Console-based simulation only
Future Enhancements
Convert the project into a Spring Boot application
Add REST APIs using Spring Web
Integrate with a real database like MySQL
Implement validation and exception handling
Add logging and security
