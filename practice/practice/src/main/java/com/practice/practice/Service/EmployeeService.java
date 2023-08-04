package com.practice.practice.Service;

import com.practice.practice.Entity.Employee;
import com.practice.practice.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
     private EmployeeRepository employeeRepository;
    public  void deleteEmployee(String id) {
        Employee employee= employeeRepository.getOne(id);
        employeeRepository.delete(employee);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(String id) {
        return employeeRepository.findById(id).get();
    }

    public Employee addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    public Employee updateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }
}
