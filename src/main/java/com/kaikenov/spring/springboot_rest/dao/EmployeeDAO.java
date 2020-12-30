package com.kaikenov.spring.springboot_rest.dao;

import com.kaikenov.spring.springboot_rest.entity.Employee;

import java.util.List;

@Deprecated
public interface EmployeeDAO {

    public Employee getEmployee(int id);

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public void deleteEmployee(int id);

}
