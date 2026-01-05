# Spring Boot Basic Starter

A **Spring Boot REST API** for managing categories with full **CRUD operations**, implemented using **Spring Data JPA** and an **H2 in-memory database**.  
This project follows a clean layered architecture and demonstrates backend best practices.

---

## 🚀 Project Overview

This project is designed as a **learning + resume-ready backend application**.  
It allows admins to create, update, retrieve, and delete categories using RESTful APIs.

The application uses:
- **Spring Data JPA** for database operations
- **H2 in-memory database** for easy setup and testing

---


## 🛠️ Tech Stack

- Java  
- Spring Boot  
- Spring Web (REST APIs)
- Spring Data JPA
- H2 Database
- Maven
- Postman (API Testing)  

---

## 📂 Project Structure
```
SampleProject
│── pom.xml
│── README.md
│
└── src
    └── main
        ├── java
        │   └── com
        │       └── lectures
        │           └── SampleProject
        │               ├── SampleProjectApplication.java
        │               ├── controller
        │               │   └── CategoryController.java
        │               ├── service
        │               │   ├── CategoryService.java
        │               │   └── CategoryServiceImpl.java
        │               ├── repository
        │               │   └── CategoryRepository.java
        │               └── model
        │                   └── Category.java
        │
        └── resources
            └── application.properties

```


---

## 🚀 Features

- Create Category  
- Get All Categories  
- Get Category by ID  
- Update Category  
- Delete Category  
- Persistence using **Spring Data JPA**  
- **H2 in-memory database** integration  
- Proper HTTP status codes  
- Exception handling using `ResponseStatusException` 

---

## 📌 API Endpoints
## ➤ Get All Categories
```
GET /api/categories
```
## ➤ Get Category by ID
```
GET /api/categories/{categoryId}
```
## ➤ Create Category
```
POST /api/admin/categories
```
**Request Body:**

```json
{
  "categoryName": "Electronics"
}
```
## ➤ Update Category
```
PUT /api/admin/categories/{categoryId}
```
**Request Body:**

```json
{
  "categoryName": "Electronics"
}
```

## ➤ Delete Category

```
DELETE /api/admin/categories/{categoryID}
```

---
### 🗄️ Database Configuration

- Database:  H2 (In-Memory)

- ORM: Spring Data JPA

- Auto table creation: Enabled

## 🔍 H2 Console
http://localhost:8080/h2-console


H2 Login Details

``` 
JDBC URL : jdbc:h2:mem:testdb
Username : sa
Password : (leave empty)
```
---

## ❗ Error Handling

* `404 NOT FOUND` → Category not found
* Proper HTTP status codes returned using `ResponseStatusException`

---

## ▶️ How to Run the Project
Prerequisites
Java 8 or above

Maven

### Steps
```bash
git clone https://github.com/sanket-khavale/springboot-basic-starter.git
cd SampleProject
mvn spring-boot:run
```
Application runs at:
```
http://localhost:8080
```
### 🧪 Testing
Use Postman or a web browser to test the REST APIs.

### 📌 Future Enhancements
- MySQL / PostgreSQL integration
- DTO pattern
- Validation using @Valid
- Global exception handling using @ControllerAdvice
- Swagger / OpenAPI documentation

### 👨‍💻 Author
Sanket Khavale
Computer Engineering Student | Aspiring Java Backend Developer

⭐ This project is built for learning, practice, and backend development preparation.


---
