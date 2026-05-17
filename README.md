# Vehicle-Web-Application
A Java EE-based web application for managing vehicle records, enabling users to perform CRUD operations. Built using Servlets, JSP, JPA, and JPQL with a MySQL database, and deployed on GlassFish Server, it provides a dynamic and efficient interface for vehicle data management.
🚗 Vehicle Web Application
📌 Project Overview
The Vehicle Web Application is a Java EE-based web system designed to manage vehicle information efficiently. It allows users to perform CRUD (Create, Read, Update, Delete) operations through an interactive web interface.
The application runs locally on GlassFish Server and can be accessed via:
http://localhost:8080/VehicleWebApplication/


🛠️ Technologies Used
🔹 Backend

Java EE (Enterprise Edition)
Servlets (handles requests & responses)
JSP (JavaServer Pages) (dynamic web pages)
JPA (Java Persistence API) (database interaction)
JPQL (Java Persistence Query Language) (database queries)

🔹 Frontend

HTML5
CSS3
Basic JavaScript

🔹 Database

MySQL (Relational Database Management System)

🔹 Server

GlassFish Server

🔹 Development Tool

NetBeans IDE


⚙️ Features

✅ Add new vehicle records
✅ View all vehicles
✅ Update vehicle details
✅ Delete vehicle records
✅ Dynamic content using JSP
✅ Database interaction using JPA & JPQL


📂 Project Structure
VehicleWebApplication/
│── src/java/
│   ├── servlet/           (Handling HTTP requests)
│   ├── entity/            (JPA Entities)
│   ├── dao/               (Database operations with JPA)
│
│── web/
│   ├── index.jsp
│   ├── addVehicle.jsp
│   ├── viewVehicles.jsp
│   └── css/
│
│── WEB-INF/
│   └── web.xml


🚀 How to Run the Project
✅ Step 1: Requirements
Make sure you have:

Java JDK 8+
NetBeans IDE
GlassFish Server
MySQL Database


✅ Step 2: Database Setup

Create a MySQL database:

SQLCREATE DATABASE vehicle_db;Show more lines

Update database connection details in your project:


Username
Password
Database URL


✅ Step 3: Configure GlassFish

Open NetBeans
Add GlassFish Server
Deploy the project to the server


✅ Step 4: Run Application

Right-click project → Run
Open browser:

http://localhost:8080/VehicleWebApplication/


🔍 How It Works (Architecture)

User interacts with HTML/JSP pages
Requests are handled by Servlets
Servlets communicate with JPA entities
JPA uses JPQL to query MySQL database
Results are returned and displayed on JSP pages


📈 Future Improvements

🔐 User authentication (Login & Registration)
📊 Search and filtering functionality
🌐 REST API integration
📱 Responsive design (mobile-friendly)
☁️ Deploy to cloud (Azure / AWS)


👨‍💻 Author
L Mnisi

📄 License
This project is for educational purposes and can be freely modified.
