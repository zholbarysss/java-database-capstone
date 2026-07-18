# User Stories

## Doctor

### US-1: View Patient Records
**Priority:** High  
**Story Points:** 5

**User Story:**
As a doctor, I want to view patient records so that I can review a patient's medical history before treatment.

**Acceptance Criteria:**
- Doctor must be logged in.
- Doctor can search patients by name or ID.
- Patient medical history is displayed.
- Unauthorized users cannot access patient records.

---

### US-2: Update Patient Diagnosis
**Priority:** High  
**Story Points:** 8

**User Story:**
As a doctor, I want to update patient diagnoses so that medical records remain accurate.

**Acceptance Criteria:**
- Doctor can edit diagnosis information.
- Changes are saved successfully.
- Updated information is visible immediately.
- Invalid data cannot be saved.

---

### US-3: Prescribe Medication
**Priority:** Medium  
**Story Points:** 5

**User Story:**
As a doctor, I want to prescribe medications so that patients receive proper treatment.

**Acceptance Criteria:**
- Doctor selects a patient.
- Medication can be added.
- Prescription is saved.
- Patient can view the prescription.

---

## Patient

### US-4: Register Account
**Priority:** High  
**Story Points:** 5

**User Story:**
As a patient, I want to register an account so that I can use the clinic system.

**Acceptance Criteria:**
- User enters valid information.
- Email must be unique.
- Registration succeeds.
- User can log in afterward.

---

### US-5: Book Appointment
**Priority:** High  
**Story Points:** 8

**User Story:**
As a patient, I want to book an appointment so that I can visit a doctor.

**Acceptance Criteria:**
- Patient selects a doctor.
- Patient selects an available date.
- Appointment is saved.
- Confirmation is displayed.

---

### US-6: View Medical History
**Priority:** Medium  
**Story Points:** 3

**User Story:**
As a patient, I want to view my medical history so that I can track previous treatments.

**Acceptance Criteria:**
- Patient is authenticated.
- Medical history is displayed.
- Prescriptions are visible.
- Unauthorized access is denied.

---

## Admin

### US-7: Manage Users
**Priority:** High  
**Story Points:** 5

**User Story:**
As an admin, I want to manage user accounts so that the system remains organized.

**Acceptance Criteria:**
- Admin can create users.
- Admin can update users.
- Admin can delete users.
- Changes are stored successfully.

---

### US-8: Manage Doctors
**Priority:** High  
**Story Points:** 8

**User Story:**
As an admin, I want to manage doctors so that clinic information stays updated.

**Acceptance Criteria:**
- Admin can add doctors.
- Admin can edit doctor information.
- Admin can delete doctors.
- Doctor list updates correctly.

---

### US-9: Manage Appointments
**Priority:** Medium  
**Story Points:** 5

**User Story:**
As an admin, I want to manage appointments so that schedules remain accurate.

**Acceptance Criteria:**
- Admin can view appointments.
- Admin can update appointments.
- Admin can cancel appointments.
- Appointment changes are saved.
