# Student Management System - Spring Boot, PostgreSQL, and AngularJS

This application provides a RESTful API for managing student information using Spring Boot for the backend, PostgreSQL for the database, and AngularJS for the frontend (placeholder for now, frontend implementation is not included in this example).

## Backend (Spring Boot)

The backend is built using Spring Boot and exposes various endpoints for managing student data.

* **`Student.java`:** Defines the Student entity with attributes like id, name, roll number, department, semester, email, and phone number.
* **`StudentRepository.java`:** Extends Spring Data JPA's `JpaRepository` to provide database operations for the `Student` entity. Includes custom queries for finding students by roll number, department, semester, and a combination of department and semester.
* **`StudentController.java`:** REST controller exposing API endpoints for retrieving all students, getting a student by ID, creating a student, updating a student, deleting a student, and searching by roll number, department, and semester.
* **`StudentService.java`:** Service layer implementing business logic related to student management. Interacts with the `StudentRepository` for data access.
* **`StudentServiceApplication.java`:** Main application class that bootstraps the Spring Boot application.


## Database (PostgreSQL)

The application uses PostgreSQL as the database.  The `Student` entity is automatically mapped to a table named "students". Ensure that a PostgreSQL database is running and configured correctly.

**Database setup (example):**

1. Create a database named `studentdb` (or any name you prefer).
2. Configure the database connection in `application.properties` (see Configuration below).

## Frontend (AngularJS - Placeholder)

(This example focuses on the backend. A full AngularJS frontend implementation can be added later).


## Configuration

**`application.properties` (Create this file in `src/main/resources`):**

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/studentdb  # Replace with your database URL
spring.datasource.username=your_db_username  # Replace with your database username
spring.datasource.password=your_db_password  # Replace with your database password
spring.jpa.hibernate.ddl-auto=update # Creates/updates tables automatically. Use "create" with caution!
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
server.port=8080 # Port the backend runs on
content_copy
Use code with caution.
Markdown
Build and Run

Ensure you have Java 21 and Maven installed.

Navigate to the project root directory in the terminal.

Run mvn spring-boot:run.

The application will start on port 8080 (or the port you configured).

API Endpoints

GET /api/students: Get all students.

GET /api/students/{id}: Get student by ID.

POST /api/students: Create a new student.

PUT /api/students/{id}: Update an existing student.

DELETE /api/students/{id}: Delete a student.

GET /api/students/roll/{rollNumber}: Get student by roll number.

GET /api/students/department/{department}: Get students by department.

GET /api/students/semester/{semester}: Get students by semester.

GET /api/students/department/{department}/semester/{semester}: Get students by department and semester.

Example Request (POST /api/students):**
{
  "name": "John Doe",
  "rollNumber": "12345",
  "department": "Computer Science",
  "semester": 5,
  "email": "john.doe@example.com",
  "phoneNumber": "123-456-7890"
}
content_copy
Use code with caution.
Json
Further Development

Implement a complete AngularJS frontend to interact with the API.

Add more features like course management, attendance tracking, etc.

Implement robust error handling and input validation.

Secure the API using Spring Security.

This README provides a starting point for understanding and running the application. Expand upon it as you develop the application further.

content_copy
Use code with caution.
