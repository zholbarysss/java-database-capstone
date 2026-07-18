
package com.project.back_end.controllers;

import com.project.back_end.models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @GetMapping("/{user}/{doctorId}/{date}/{token}")
    public List<String> getDoctorAvailability(
            @PathVariable String user,
            @PathVariable Long doctorId,
            @PathVariable String date,
            @PathVariable String token) {

        Doctor doctor = new Doctor();

        return doctor.getAvailableTimes();
    }
}
