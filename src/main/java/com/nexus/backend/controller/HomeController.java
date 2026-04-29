package com.nexus.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("application", "Nexus Platform Backend");
        response.put("status", "Running");
        response.put("timestamp", LocalDateTime.now().toString());
        response.put("endpoints", Map.of(
            "users", "/api/users",
            "activities", "/api/activities",
            "events", "/api/events",
            "notifications", "/api/notifications"
        ));
        return response;
    }

    @GetMapping("/api/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
