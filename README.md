# Simple E-Commerce Backend

A simple e-commerce backend built with **Kotlin**, **Spring Boot**, and **H2 Database**. This project provides RESTful APIs for managing products in an e-commerce system.

---

## Features
- **Product Management**:
  - Create, read, update, and delete products.
  - Retrieve a list of all products or a single product by ID.
- **In-Memory Database**:
  - Uses **H2 Database** for fast and easy development.
  - Access the H2 Console to view and manage data.
- **RESTful APIs**:
  - Built with **Spring Boot** and **Kotlin** for clean and efficient code.

---

## Technologies Used
- **Kotlin**: The primary programming language.
- **Spring Boot**: Framework for building the backend.
- **H2 Database**: In-memory database for development.
- **Gradle**: Build tool for managing dependencies and tasks.

---

## Getting Started

### Prerequisites
- **Java 17**: Ensure you have Java 17 installed.
- **Gradle**: Ensure you have Gradle installed (or use the Gradle Wrapper).

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/simple-ecommerce-backend.git

### Run the application
1. Direct into the root directory
2. run `gradle wrapper`
3. run `./gradlew build`
4. run `./gradlew bootRun`

### Test endpoints
1. Get all products
   ```bash
   GET /api/products
2. Get a product by ID
   ``` bash
   GET /api/products/{id}
3. Create a product
   ```bash
   curl -X POST http://localhost:8080/api/products \
    -H "Content-Type: application/json" \
    -d '{"name": "Tablet", "price": 299.99, "description": "A lightweight tablet"}'
4. Update a product
   ```bash
   PUT /api/products/{id}
5. Delete a product
   ```bash
   DELETE /api/products/{id}
