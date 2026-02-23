package com.employee.employeemgmt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/employee")
public class EmployeeController {

    @GetMapping
    public String getResponse(){
        return "Welcome to spring boot app";
    }

}
