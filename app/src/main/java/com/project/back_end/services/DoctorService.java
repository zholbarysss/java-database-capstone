
package com.project.back_end.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class DoctorService {

    public List<String> getAvailableTimeSlots(Long doctorId, LocalDate date) {

        return Arrays.asList(
                "09:00",
                "10:00",
                "11:00",
                "14:00",
                "15:00"
        );
    }

    public ResponseEntity<String> validateDoctorLogin(
            String email,
            String password
    ) {

        if ("doctor@test.com".equals(email)
                && "password".equals(password)) {

            return ResponseEntity.ok("Login successful");
        }

        return ResponseEntity.badRequest().body("Invalid credentials");
    }

}
