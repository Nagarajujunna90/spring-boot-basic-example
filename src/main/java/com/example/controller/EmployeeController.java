package com.example.controller;

import com.example.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public ResponseEntity<?> getEmployee() {
        return new ResponseEntity<>("Latest version  working", HttpStatus.CREATED);
    }


    @GetMapping("/employee/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Integer id) {
        return new ResponseEntity<>("I am from get API" + id, HttpStatus.CREATED);
    }

    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>("I am from get API" + employee, HttpStatus.CREATED);
    }
}


