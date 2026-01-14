# 🧑‍💻 Job Application Tracker – Fullstack

Aplicación **Fullstack** para gestionar postulaciones laborales de forma organizada, permitiendo registrar empresas, estados del proceso, fechas, notas y estadísticas.

> Proyecto orientado a demostrar habilidades reales en **Backend + Frontend**, buenas prácticas y arquitectura profesional.

---

## 🚀 Funcionalidades principales
- Crear, editar y eliminar postulaciones laborales
- Estados del proceso: Applied, Interview, Offer, Rejected
- Filtros por estado, fecha y empresa
- Dashboard con estadísticas
- Autenticación con JWT
- Comunicación REST entre frontend y backend

---

## 🛠️ Tecnologías utilizadas

### 🖥️ Backend
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Spring Security + JWT
- Swagger / OpenAPI
- JUnit & Mockito

### 🌐 Frontend
- Angular (standalone components)
- TypeScript
- Bootstrap
- RxJS

### ⚙️ Infraestructura
- Docker
- Docker Compose
- GitHub Actions (CI)

---

## 🧠 Arquitectura
- Backend desacoplado por capas (Controller, Service, Repository)
- DTOs + Mapper
- Manejo global de excepciones
- Frontend con servicios HTTP, guards e interceptors

---

## ▶️ Cómo ejecutar el proyecto

### 🔹 Opción 1: Docker
```bash
docker-compose up --build
```
### 🔹 Opción 2:
  -Backend:
```bash
mvn spring-boot:run
```
  -Frontend:
```bash
npm install
ng serve
```

---

## 📑 Documentación API
  -Swagger disponible en:
  http://localhost:8080/swagger-ui.html
  
---

##📸 Screenshots
  -(Próximamente)
  
---

##📌 Roadmap
  -CRUD completo
  -Autenticacion JWT
  -Dashboard con metricas
  -Test de integracion
  -CI/CD
  -Deploy
  
---

##👨‍💻 Autor
- Nahuel Gallardo
- Analista en Programacion y Desarrollo de Aplicaciones.

---
