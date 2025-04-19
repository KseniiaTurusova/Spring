package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

public class Person_Controller {

    @RestController
@RequestMapping("/api/person")
public class PersonController {

    @PostMapping
    public ResponseEntity<String> valid(@Valid @RequestBody PersonDTO personDTO) {
        return ResponseEntity.ok("valid");
    }

}
}
