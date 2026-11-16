# Employee Management System

A simple **Employee Management System** developed using Java, Spring Boot MVC, Spring Data JPA, Hibernate, JSP, and MySQL.

This project demonstrates how to build a web application using the MVC architecture and perform database operations using Spring Data JPA.

## 🚀 Technologies Used

- Java 21
- Spring Boot 4.1.2
- Spring MVC
- Spring Data JPA
- Hibernate ORM
- MySQL 8.0
- JSP (Java Server Pages)
- HTML
- CSS
- Maven
- Eclipse / Spring Tool Suite

## 📌 Features

- Add new employee details
- Save employee information into MySQL database
- Retrieve and display all employees
- Automatic employee ID generation
- MVC architecture implementation
- Layered architecture using Controller, Service, Repository, and Model

## 📂 Project Structure

```text
springboot_mvc/
│
├── src/main/java/
│   ├── com.example.demo/
│   │   └── SpringbootMvcApplication.java
│   │
│   └── com.SpringBootMvc/
│       ├── controller/
│       │   └── EmployeeController.java
│       │
│       ├── model/
│       │   └── Employee.java
│       │
│       ├── repository/
│       │   └── EmployeeRepo.java
│       │
│       └── service/
│           └── EmployeeService.java
│
├── src/main/resources/
│   └── application.properties
│
├── src/main/webapp/
│   └── WEB-INF/
│       └── views/
│           ├── addEmployee.jsp
│           └── employeelist.jsp
│
└── pom.xml
```

## 🗄️ Database Configuration

Database: `springbootmvc`

Configure your MySQL connection in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/springbootmvc?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp

server.port=8080
```

Update the username and password according to your MySQL configuration.

## ⚙️ How to Run the Project

1. Clone or download this repository.
2. Import the project into Eclipse or Spring Tool Suite as an existing Maven project.
3. Make sure MySQL is running.
4. Configure the database username and password.
5. Update Maven dependencies.
6. Run `SpringbootMvcApplication.java` as a Spring Boot application.
7. Open your browser and access the application.

## 🌐 Application URLs

| Functionality | URL | Method |
|---|---|---|
| Add Employee | `/employees/addEmp` | GET |
| Save Employee | `/employees/saveEmp` | POST |
| View Employees | `/employees/getEmp` | GET |

Base URL: `http://localhost:8080`

## 🏗️ Architecture

The application follows the MVC and layered architecture:

1. **Controller Layer:** Handles incoming HTTP requests.
2. **Service Layer:** Contains business logic.
3. **Repository Layer:** Performs database operations using JpaRepository.
4. **Model Layer:** Represents employee data using JPA entity mapping.
5. **View Layer:** JSP pages display employee information.

## 👨‍💻 Author

Developed as a Java Full Stack Development learning project.

## 📚 Learning Outcomes

- Understanding Spring Boot MVC architecture
- Implementing Dependency Injection
- Working with Spring Data JPA
- Connecting Spring Boot with MySQL
- Performing database CRUD operations using JpaRepository
- Integrating JSP with Spring Boot MVC
