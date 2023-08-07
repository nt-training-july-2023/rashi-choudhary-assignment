package com.practice.practice.Controller;

import com.practice.practice.Entity.Employee;
import com.practice.practice.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    @GetMapping("/Employees")
    public ResponseEntity<List<Employee>> getEmployees(){
        List<Employee> list=employeeService.getEmployees();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }
    @GetMapping("/Employee/{id}")

    public ResponseEntity<Employee> getEmployee(@PathVariable String id){
        Employee employee=employeeService.getEmployee(id);
        if(employee==null){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(employee));

    }
    @PostMapping("/Employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee emp=null;
        try{
            emp=employeeService.addEmployee(employee);
            return ResponseEntity.of(Optional.of(emp));
        }
        catch (Exception e){
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
    @PutMapping("/Employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee employee1=null;
        try {
            employee1= employeeService.updateEmployee(employee);
            return ResponseEntity.ok().body(employee1);
        }
        catch (Exception e){
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @DeleteMapping("/Employee/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String id){
        try {
            employeeService.deleteEmployee(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }


    }
}
