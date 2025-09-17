# TotoApp - Spring Boot Todo Application

A simple Todo application built with Spring Boot, allowing users to manage tasks via a web interface.

## Features

- Create, read, update, and delete (CRUD) tasks
- Web-based UI using Thymeleaf templates
- In-memory H2 database for data persistence
- RESTful API endpoints for task management
- Validation for task inputs

## Prerequisites

- Java 21 or higher
- Maven 3.6+ (or use the included Maven wrapper)

## Installation

1. Clone the repository:
   ```
   git clone https://github.com/PriyankaCoder1/Todo-application.git
   cd Todo-application
   ```

2. Build the project:
   ```
   ./mvnw clean install
   ```

## Running the Application

Start the application using the Maven wrapper:
```
./mvnw spring-boot:run
```

The application will start on `http://localhost:8081`.

## Usage

- Open your browser and navigate to `http://localhost:8081/tasks`.
- Use the web interface to add, edit, mark as completed, or delete tasks.

## API Endpoints

- `GET /tasks` - List all tasks
- `GET /tasks/new` - Show form to create a new task
- `POST /tasks` - Create a new task
- `GET /tasks/{id}/edit` - Show form to edit a task
- `POST /tasks/{id}` - Update a task
- `POST /tasks/{id}/delete` - Delete a task

## Technologies Used

- **Backend:** Spring Boot, Spring MVC, Spring Data JPA
- **Frontend:** Thymeleaf, HTML, CSS
- **Database:** H2 (in-memory)
- **Build Tool:** Maven

## Project Structure

- `src/main/java/com/app/totoapp/` - Main application code
  - `controller/` - REST controllers
  - `models/` - Entity classes
  - `repositories/` - Data access layer
  - `services/` - Business logic
- `src/main/resources/` - Configuration and templates
- `src/test/` - Unit tests

## Contributing

1. Fork the repository.
2. Create a feature branch: `git checkout -b feature-name`.
3. Commit your changes: `git commit -am 'Add feature'`.
4. Push to the branch: `git push origin feature-name`.
5. Submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
