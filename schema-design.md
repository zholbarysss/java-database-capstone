# Database Schema

## Users
- id (PK)
- name
- email
- password
- role

## Doctors
- id (PK)
- user_id (FK)
- specialization

## Patients
- id (PK)
- user_id (FK)
- date_of_birth

## Appointments
- id (PK)
- doctor_id (FK)
- patient_id (FK)
- appointment_date
- status
