# Inventory Management System (Spring Boot)

## 📌 Overview

The **Inventory Management System** is a Spring Boot–based backend application designed to manage inventory operations such as products, categories, suppliers, users, and transactions in an organized and efficient manner.

The system follows a clean layered architecture and exposes RESTful APIs for inventory management.

---

## 🛠 Tech Stack

* Java
* Spring Boot
* Spring Data JPA (Hibernate)
* Spring Security (JWT)
* MySQL / PostgreSQL
* Maven

---

## 🧱 Architecture

The project follows a standard layered architecture:

```
controller → service → repository → database
```

---

## 📦 Core Entities

* **User** – System users with role-based access
* **Category** – Classification of products
* **Product** – Inventory items linked to categories and suppliers
* **Supplier** – Provides products to the inventory
* **Transaction** – Records inventory movements (stock in / stock out)

---

## 🔗 Entity Relationships (High Level)

* Category → Product (One-to-Many)
* Supplier ↔ Product (Many-to-Many)
* User → Transaction (One-to-Many)
* Product → Transaction (One-to-Many)

---

## ⚙️ Setup

1. Configure database in `application.properties`
2. Build and run the project:

```bash
mvn clean install
mvn spring-boot:run
```

---

## 🚀 Features

* Product & category management
* Supplier-product relationship handling
* Inventory transactions tracking
* Role-based authentication & authorization
* RESTful API design

---

## 👩‍💻 Author

**Humera Akmal**

---

## 📄 License

For educational and learning purposes only.

