package com.kaikenov.spring.springboot_rest.dao;

import com.kaikenov.spring.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

}
