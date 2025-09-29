# Employee Management REST API

A simple Employee Management REST API built with **Spring Boot**, featuring CRUD operations and secured with **Spring Security** using HTTP Basic Authentication.

---

## Features

- Add, update, and view employees
- Secure endpoints with roles (USER, ADMIN)
- In-memory user store for demo purposes
- JSON responses for all endpoints

---

## Technologies Used

- Java 17+
- Spring Boot 3
- Spring Security 6
- Maven

---

## Endpoints

| Method | Endpoint                | Description                  | Roles         |
|--------|------------------------|------------------------------|---------------|
| GET    | `/api/employee`        | List all employees           | USER, ADMIN   |
| GET    | `/api/employee/{id}`   | Get employee by ID           | USER, ADMIN   |
| POST   | `/api/employee`        | Add a new employee           | ADMIN         |
| POST   | `/api/employee/{id}`   | Update an existing employee  | ADMIN         |

---

## Authentication

- **In-memory users** (for demo):

| Username | Password   | Roles        |
|----------|-----------|-------------|
| admin    | admin123  | USER, ADMIN |

- Use **HTTP Basic Auth** to access secured endpoints.  
  Example with curl:

```bash
curl -u admin:admin123 http://localhost:8080/api/employee
````

---

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/<your-username>/employee-rest-api.git
```

2. Navigate to the project directory:

```bash
cd employee-rest-api
```

3. Build and run with Maven:

```bash
mvn clean install
mvn spring-boot:run
```

4. Access endpoints at:

```
http://localhost:8080/api/employee
```

---

## Notes

* CSRF is disabled since this is a REST API.
* Passwords are stored in-memory using **BCryptPasswordEncoder**.
* For production, consider database-backed users and JWT authentication.

---

## License

This project is open source and free to use.
