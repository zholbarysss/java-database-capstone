# Smart Clinic Management System - Database Schema

## Users

| Column | Data Type | Constraints |
|--------|-----------|-------------|
| id | INT | PRIMARY KEY, AUTO_INCREMENT |
| username | VARCHAR(100) | NOT NULL, UNIQUE |
| password | VARCHAR(255) | NOT NULL |
| role | ENUM('admin','doctor','patient') | NOT NULL |
| email | VARCHAR(150) | NOT NULL, UNIQUE |
| created_at | DATETIME | DEFAULT CURRENT_TIMESTAMP |

---

## Doctors

| Column | Data Type | Constraints |
|--------|-----------|-------------|
| id | INT | PRIMARY KEY, AUTO_INCREMENT |
| user_id | INT | NOT NULL, FOREIGN KEY REFERENCES Users(id) |
| first_name | VARCHAR(100) | NOT NULL |
| last_name | VARCHAR(100) | NOT NULL |
| specialization | VARCHAR(100) | NOT NULL |
| phone | VARCHAR(20) | NOT NULL |

---

## Patients

| Column | Data Type | Constraints |
|--------|-----------|-------------|
| id | INT | PRIMARY KEY, AUTO_INCREMENT |
| user_id | INT | NOT NULL, FOREIGN KEY REFERENCES Users(id) |
| first_name | VARCHAR(100) | NOT NULL |
| last_name | VARCHAR(100) | NOT NULL |
| birth_date | DATE | NOT NULL |
| gender | ENUM('Male','Female') | NOT NULL |
| phone | VARCHAR(20) | NOT NULL |

---

## Appointments

| Column | Data Type | Constraints |
|--------|-----------|-------------|
| id | INT | PRIMARY KEY, AUTO_INCREMENT |
| doctor_id | INT | NOT NULL, FOREIGN KEY REFERENCES Doctors(id) |
| patient_id | INT | NOT NULL, FOREIGN KEY REFERENCES Patients(id) |
| appointment_date | DATETIME | NOT NULL |
| status | ENUM('Scheduled','Completed','Cancelled') | NOT NULL |
| notes | TEXT | NULL |

---

# Relationships

- Users (1) → Doctors (1)
- Users (1) → Patients (1)
- Doctors (1) → Appointments (Many)
- Patients (1) → Appointments (Many)

## Foreign Keys

- Doctors.user_id → Users.id
- Patients.user_id → Users.id
- Appointments.doctor_id → Doctors.id
- Appointments.patient_id → Patients.id
