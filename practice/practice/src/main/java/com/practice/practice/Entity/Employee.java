package com.practice.practice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Builder
@Entity
public class Employee {
    @Id
    String empId;
    String name;
    String address;
    String role;
    String email;
    double salary;
    public Employee(){

    }
    public Employee(String empId,String name,String address,String role,String email,double salary){
        this.empId=empId;
        this.address=address;
        this.email=email;
        this.role=role;
        this.name=name;
        this.salary=salary;
    }



}
