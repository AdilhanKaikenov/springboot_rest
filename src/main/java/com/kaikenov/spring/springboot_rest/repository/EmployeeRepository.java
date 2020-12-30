package com.kaikenov.spring.springboot_rest.repository;

import com.kaikenov.spring.springboot_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByName(String name);

}
