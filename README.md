# Java-project-VITyarthi-
# Virtual Classroom

A virtual classroom application developed during the COVID-19 lockdown for remote teaching.

## Features

- Create and manage online meetings (classes)
- List all scheduled meetings

## Technology Stack

- Java 11
- Spring Boot
- Spring Data JPA
- H2 Database (in-memory)

## Setup Instructions

1. Clone the repository.
2. Make sure you have Java 11 and Maven installed.
3. Run `mvn spring-boot:run` to start the application.
4. The application will be available at `http://localhost:8080`.

## API Endpoints

- `GET /api/meetings` - Get all meetings
- `POST /api/meetings` - Create a new meeting

## H2 Database Console

When the application is running, you can access the H2 console at `http://localhost:8080/h2-console`.
