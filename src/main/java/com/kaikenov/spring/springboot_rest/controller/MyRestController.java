package com.kaikenov.spring.springboot_rest.controller;

import com.kaikenov.spring.springboot_rest.entity.Employee;
import com.kaikenov.spring.springboot_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployee() {
        List<Employee> allEmployees = employeeService.getAllEmployees();

        return allEmployees;
    }
}
