package com.example.zachet_admin_oc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/health")
public class HealthCheckController {
    @GetMapping
    public ResponseEntity<String> healthCheck() {
        String message = "Health check - ok";
        return ResponseEntity.ok(message);
    }

}
