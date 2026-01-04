# 🏨 RoomMate – Hostel & Room Booking System

RoomMate is a Spring Boot–based hostel and room booking web application that allows users to browse hostels and rooms, register and log in securely, and access a personalized dashboard.

The project follows a clean MVC architecture and is built without Lombok for better understanding of core Java and Spring concepts.

---

## 🚀 Features

### 👤 User Features
- User registration and login
- Secure authentication using Spring Security
- View available hostels and rooms
- User dashboard after login

### 🏢 Owner / Admin Features (Planned)
- Add and manage hostels
- Add rooms under hostels
- Manage room availability
- View bookings

### 🔐 Security Features
- Custom login page
- Protected routes using Spring Security
- Role-based access (USER / OWNER / ADMIN)
- Secure logout

---

## 🛠 Tech Stack

- Backend: Spring Boot 4
- Security: Spring Security 7
- Frontend: Thymeleaf, HTML, CSS
- Database: MySQL
- ORM: Spring Data JPA (Hibernate)
- Build Tool: Maven
- Java Version: Java 21

---

## 📂 Project Structure

src/main/java/com/example/demo
│
├── config
│   ├── SecurityConfig.java
│   └── AppConfig.java
│
├── controller
│   ├── HomeController.java
│   ├── AuthController.java
│   └── UserController.java
│
├── service
├── repository
├── model
├── dto
├── exception
├── util
│
└── RoomMateApplication.java

---

## 📁 Templates Structure

src/main/resources/templates
│
├── auth
│   ├── login.html
│   ├── register.html
│   └── forgot-password.html
│
├── user
│   └── user-dashboard.html
│
└── fragments
    ├── header.html
    └── footer.html

---

## ▶️ How to Run the Project

1. Install Java 21 and MySQL
2. Configure database in application.properties
3. Run Maven Update
4. Start Spring Boot Application
5. Open http://localhost:8080/

---

## 👨‍💻 Author

Tushar Verma  
Java | Spring Boot | MERN Stack
