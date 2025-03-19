## Backend Description

The backend of this portfolio is built with **Spring Boot**, providing a simple RESTful API to manage records. It offers two main endpoints for handling data:

- **POST** `/api/v1/add`:
    - This endpoint accepts data to create a new record and stores it in the database.
    - It expects the record's details to be sent in the request body (usually in JSON format).
    - Once the record is added, a success response is returned indicating that the record has been successfully captured.

- **GET** `/api/v1/add`:
    - This endpoint is used to retrieve all records from the database.
    - It sends back a list of all records stored in the system in JSON format.
    - This endpoint is useful for displaying or processing the records in the frontend.

The backend is designed using **Spring Boot** to handle the API logic, manage database interactions, and ensure smooth communication with the frontend. The database can be configured to store the records, and the endpoints are built to follow RESTful conventions for easy integration and scalability.

Additionally, Spring Boot’s auto-configuration features make it easy to set up and customize the backend with minimal effort, while also providing built-in support for error handling, logging, and security (though security features are minimal for now).

## How to Clone the Repository

To get started with the backend, follow these steps:

1. **Clone the repository**:
    ```bash
    https://github.com/Th-Sagar/Portfolio-Backend-.git ```

2. **Navigate to the project directory**:
    ```bash
    cd Portfolio-Backend-
    ```

3. **Build the project**:
    ```bash
    ./mvnw clean install
    ```

4. **Run the application**:
    ```bash
    ./mvnw spring-boot:run
    ```

This will start the Spring Boot application, and the API will be available at `http://localhost:9090`.

Once the backend is running, you can use tools like Postman or your frontend application to interact with the API.
