# JDBC Student Management System

## Overview

This is a Java-based Student Management System that uses JDBC (Java Database Connectivity) to perform CRUD (Create, Read, Update, Delete) operations on student records stored in a MySQL database. The application provides a command-line interface for managing student information.

## Features

- **Database Connection Management**: Secure connection to MySQL using properties file
- **CRUD Operations**:
  - Add new students with ID, name, email, and marks
  - View individual student details by ID
  - Display all students in the database
  - Update existing student information
  - Delete student records
- **User-friendly Menu**: Simple text-based interface with clear options
- **Error Handling**: Proper exception handling for database operations

## Prerequisites

- Java JDK 8 or higher
- MySQL Database
- MySQL JDBC Driver

## Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/MrAdi149/Full_Stack_Developer.git
   ```

2. **Database Configuration**:
   - Create a MySQL database for the application
   - Create a `config.properties` file in your project directory with the following content:
     ```
     url=jdbc:mysql://localhost:3306/your_database_name
     user=your_mysql_username
     password=your_mysql_password
     ```

3. **Database Table Setup**:
   Run the following SQL command to create the student table:
   ```sql
   CREATE TABLE student (
       studentId INT PRIMARY KEY,
       studentName VARCHAR(50) NOT NULL,
       studentEmail VARCHAR(50) NOT NULL,
       studentMarks INT NOT NULL
   );
   ```

4. **Add MySQL JDBC Driver**:
   - Download the MySQL Connector/J driver
   - Add it to your project's classpath

## How to Run

1. Compile the Java files:
   ```bash
   javac com/project/jdbc/student/App.java
   ```

2. Run the application:
   ```bash
   java com.project.jdbc.student.App
   ```

## Usage Guide

When you run the application, you'll see a menu with these options:

1. **Add New Student**: Enter student details to add to the database
2. **View Student by ID**: View details of a specific student
3. **View All Students**: Display all students in the database
4. **Update Student Information**: Modify existing student records
5. **Delete Student**: Remove a student from the database
6. **Exit**: Close the application

## Code Structure

- `StudentDao.java`: Contains all database operations and connection logic
  - `buildConnection()`: Establishes database connection
  - CRUD methods: `addStudentToDB()`, `getStudentById()`, `showAllStudentFromDB()`, `updateStudentInDB()`, `deleteStudentFromDB()`
  
- `App.java`: Main application class with user interface

## Best Practices Implemented

- Using PreparedStatement to prevent SQL injection
- Proper resource management (closing connections)
- Input validation
- Clean separation of concerns (DAO pattern)
- Configuration externalization (properties file)

## Troubleshooting

- **Connection issues**: Verify your database credentials in config.properties
- **Driver not found**: Ensure MySQL JDBC driver is in classpath
- **Table errors**: Confirm the student table exists with correct schema

## License

This project is licensed under the MIT License.

## Acknowledgments

Inspired by the tutorial from "Learn Code with Durgesh" YouTube channel.
