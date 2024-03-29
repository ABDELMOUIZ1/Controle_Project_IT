package com.demo30.dao;

import com.demo30.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    void createEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
}
