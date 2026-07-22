package com.sunitech.learningdeployment01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping("/employee")
    public String fetchEmployee(){
        return "Fetching all the employee details..";
    }

    @PostMapping("/create")
    public String createEmployee(){
        return "Employee created successfully";
    }

}
