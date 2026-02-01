# Spring Boot 3.5.10 + Java 21 + H2 CRUD API 🚀

[![Java 21](https://img.shields.io/badge/Java-21-blue.svg)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.10-green.svg)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-Central-yellow.svg)](https://maven.apache.org/)
[![H2 Database](https://img.shields.io/badge/H2-In--Memory-orange.svg)](https://h2database.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

A production-ready **RESTful CRUD API** built with **Spring Boot 3.5.10**, **Java 21**, **Spring Data JPA**, **H2 Database**, **Lombok**, and **Maven**. Features clean architecture, validation, global exception handling, and follows best practices.

## ✨ Features

- ✅ **Full CRUD operations** for Book management
- ✅ **Clean Architecture**: Controller → Service → Repository → Entity
- ✅ **Input Validation** with Bean Validation (Jakarta)
- ✅ **Global Exception Handling** with consistent JSON errors
- ✅ **H2 In-Memory Database** with web console access
- ✅ **Lombok** for boilerplate reduction
- ✅ **Spring Boot 3.5.10** with Java 21
- ✅ **RESTful API Design** with proper HTTP status codes
- ✅ **Transactional Services** with read-only optimizations

## 📋 API Endpoints

| Method | Endpoint                | Description                   |
|--------|-------------------------|-------------------------------|
| `GET`  | `/api/books`            | List all books                |
| `GET`  | `/api/books/{id}`       | Get book by ID                |
| `POST` | `/api/books`            | Create new book               |
| `PUT`  | `/api/books/{id}`       | Update book by ID             |
| `DELETE` | `/api/books/{id}`    | Delete book by ID             |

**Base URL**: `http://localhost:8080`

## 🛠 Quick Start

### Prerequisites
- Java 21+ (OpenJDK recommended)
- Maven 3.8+
- IDE (IntelliJ IDEA, VS Code, Eclipse)

### 1. Clone & Build
```bash
git clone https://github.com/akaPierre/springboot-h2-crud.git
cd springboot-h2-crud
mvn clean install
```

### 2. Run
```bash
mvn spring-boot:run
```
Or run `SpringbootH2CrudApplication.main()` from your IDE.

### 3. Access H2 Console
- URL: http://localhost:8080/h2-console
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (leave empty)

## 🧪 Test the API
Using `curl` (or Postman/Insomnia):

### List all books
```bash
curl -X GET http://localhost:8080/api/books
```

### Create a book
```bash
curl -X POST http://localhost:8080/api/books \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Clean Code",
    "author": "Robert C. Martin",
    "isbn": "9780132350884",
    "price": 120.0
  }'
```

### Get book by ID
```bash
curl -X GET http://localhost:8080/api/books/1
```

### Update book
```bash
curl -X PUT http://localhost:8080/api/books/1 \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Clean Code (Updated)",
    "author": "Robert C. Martin", 
    "isbn": "9780132350884",
    "price": 125.0
  }'
```

### Delete book
```bash
curl -X DELETE http://localhost:8080/api/books/1
```

## 🏗 Project Structure
```text
springboot-h2-crud/
├── pom.xml                    # Maven dependencies
├── src/
│   ├── main/
│   │   ├── java/com/example/springbooth2crud/
│   │   │   ├── SpringbootH2CrudApplication.java  # Main class
│   │   │   ├── controller/     # REST controllers
│   │   │   ├── dto/            # Data Transfer Objects
│   │   │   ├── model/          # JPA Entities
│   │   │   ├── repository/     # Spring Data JPA
│   │   │   └── service/        # Business logic
│   │   └── resources/
│   │       ├── application.properties  # Config
│   │       └── data.sql        # Initial data
│   └── test/                   # Unit & Integration tests
```

## 🔧 Configuration
`application.properties` configures:

- H2 in-memory database (`testdb`)
- JPA/Hibernate DDL auto-update
- SQL formatting and logging
- H2 web console (`/h2-console`)

## 🧑‍💻 Tech Stack
| **Component**      | **Version** | **Purpose**           |
|--------------------|-------------|-----------------------|
| Java               | 21          | Language              |
| Spring Boot        | 3.5.10      | Framework             |
| Spring Data JPA    | 3.5.10      | ORM                   |
| H2 Database        | Latest      | In-memory DB          |
| Lombok             | Latest      | Boilerplate reduction |
| Maven              | 3.8+        | Build tool            |
| Jakarta Validation | 3.0+        | Bean validation       |

## 🎯 Clean Code Practices Applied
- Layered Architecture (Controller → Service → Repository)
- DTOs for request/response isolation
- Constructor Injection (`@RequiredArgsConstructor`)
- Validation at API boundaries
- Global Exception Handling (`@RestControllerAdvice`)
- Transactional Services with read-only optimization
- RESTful Design with proper HTTP status codes
- Immutable-like entities with `@Builder`

## 🚀 Production Deployment
1. Replace H2 with PostgreSQL/MySQL in `pom.xml` and `application.properties`
2. Add Spring Security for authentication
3. Dockerize the application
4. Add health checks (`/actuator/health`)
5. Monitoring with Micrometer/Prometheus

## 🐛 Troubleshooting
| **Issue**             | **Solution**                                          |
|-----------------------|-------------------------------------------------------|
| Lombok not working    | Install Lombok plugin + enable annotation processing  |
| H2 console 404        | Ensure `spring.h2.console.enabled=true`               |
| Port already in use   | Change `server.port=8081` in `application.properties` |
| Java version mismatch | Set `JAVA_HOME` to Java 21                            |

## 📄 License
This project is licensed under the MIT License - see the [LICENSE](https://github.com/akaPierre/springboot-h2-crud/blob/main/LICENSE) file for details.

## 🙏 Acknowledgments
Built with ❤️ using Spring Boot ecosystem!

### ⭐ Star this repo if it helped you!
### 🐛 Found a bug? Open an issue.
