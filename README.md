# SpringBootAplication

### 📌 **Application Summary**  
This application is a **user, book, and sales management system**, built on **Spring Boot**. Its purpose is to enable **user authentication**, **resource management based on roles and permissions**, and **interaction with a database** for storing book and transaction information. Users with different access levels can **add, modify, or delete books and sales** according to the permissions assigned to their roles.

---

### 🛠 **Concepts & Architecture**  
✅ **Layered Architecture** → The application is structured into layers:  
- **Controller Layer** → Exposes the APIs  
- **Service Layer** → Contains the business logic  
- **Repository Layer** → Interacts with the database  

✅ **SOLID Principles** → The application follows best practices to ensure scalability and maintainability.  
✅ **Dependency Injection (DI)** → Object instance management is handled by Spring, ensuring **loosely coupled components**.  
✅ **Design Patterns** →  
- **Builder Pattern** → Used in DTOs for object creation  
- **Repository Pattern** → Separates database logic from application logic  

✅ **Role-based security system** → Using **Spring Security**, each user has a role with specific permissions.  
✅ **SQL Database** → A relational database is used for data persistence.  

---

### 🚀 **Technologies Used**  
- **Backend**: Java, Spring Boot  
- **Security**: Spring Security (authentication, authorization, password hashing)  
- **Persistence**: Spring Data JPA, Hibernate  
- **Database**: MySQL  
- **Frontend (minimal integration)**: Thymeleaf for server-side rendering  
- **Version Control**: Git  
- **Deployment**: Railway (cloud hosting for Spring Boot applications)  

This application provides **secure user and permission management**, a **scalable REST API interface**, and can be easily extended to include new functionalities.
