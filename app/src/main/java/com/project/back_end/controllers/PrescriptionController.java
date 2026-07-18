
package com.project.back_end.controllers;

import com.project.back_end.models.Prescription;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @PostMapping("/{token}")
    public ResponseEntity<String> savePrescription(
            @PathVariable String token,
            @RequestBody Prescription prescription
    ) {

        return ResponseEntity.ok("Prescription saved successfully");
    }
}
