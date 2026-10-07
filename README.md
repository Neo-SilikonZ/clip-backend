# Clip - QR Payment Backend API

Clip is a RESTful backend API designed to manage digital wallets for a QR payment system. It is built using Java and Spring Boot to demonstrate enterprise architecture, clean code principles, and relational data persistence.

## 🚀 Features
* Create digital wallets for users with a zero balance.
* Retrieve wallet details securely using the User ID.
* In-memory H2 database for rapid development and testing.
* Visual H2 Console to inspect the database in real-time.

## 🛠️ Tech Stack
* **Language:** Java 21
* **Framework:** Spring Boot 4.1.1
* **Database:** H2 (In-Memory)
* **ORM:** Spring Data JPA / Hibernate
* **Build Tool:** Maven
* **Testing:** Postman

## ️ Architecture
The application follows a standard **Layered Architecture** to ensure separation of concerns and maintainability:
* **Controller Layer:** Handles incoming HTTP requests and returns JSON responses.
* **Service Layer:** Contains the core business logic and rules.
* **Repository Layer:** Manages data persistence and communication with the database.
* **Entity Layer:** Defines the data models and maps them to database tables.

## 🏃‍♂️ How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/YOUR_USERNAME/clip-backend.git
   cd clip-backend
