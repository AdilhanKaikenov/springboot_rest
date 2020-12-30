package com.kaikenov.spring.springboot_rest.service;

import com.kaikenov.spring.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee getEmployee(int id);

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public void deleteEmployee(int id);
}
