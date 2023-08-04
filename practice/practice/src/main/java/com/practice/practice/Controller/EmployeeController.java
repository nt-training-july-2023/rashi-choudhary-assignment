package com.practice.practice.Controller;

import com.practice.practice.Entity.Employee;
import com.practice.practice.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    @GetMapping("/Employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }
    @GetMapping("/Employee/{id}")

    public Employee getEmployee(@PathVariable String id){
        return employeeService.getEmployee(id);

    }
    @PostMapping("/Employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    @PutMapping("/Employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/Employee/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);
        return  new ResponseEntity<>(HttpStatus.OK);


    }
}
