package com.ms.email.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping
    public ResponseEntity<Object> home() {
        return ResponseEntity.ok("{\"message\": \"Hello World!\"}");
    }

}