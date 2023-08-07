package com.practice.practice.Service;

import com.practice.practice.Entity.Employee;
import com.practice.practice.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
     private EmployeeRepository employeeRepository;
    public void deleteEmployee(String id) {
        Employee employee= employeeRepository.getOne(id);
//        if(employee==null){
//            ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//
//        }
//        else{
        employeeRepository.delete(employee);
//        ResponseEntity.ok();
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(String id) {
        Employee employee=null;
        try {
            employee=employeeRepository.findById(id).get();

        }
        catch (Exception e){
            System.out.println(e);

        }
        return employee;
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
