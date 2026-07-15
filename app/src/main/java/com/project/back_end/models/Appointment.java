
package com.project.back_end.models;

import java.time.LocalDateTime;

public class Appointment {

    private Long id;
    private Long doctorId;
    private Long patientId;
    private LocalDateTime appointmentDate;

    public Appointment() {
    }

    public Appointment(Long id, Long doctorId, Long patientId, LocalDateTime appointmentDate) {
        this.id = id;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.appointmentDate = appointmentDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}
