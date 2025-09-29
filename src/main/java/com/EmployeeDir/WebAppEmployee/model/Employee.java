package com.EmployeeDir.WebAppEmployee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String name;
    private String department;
    private String email;

    public Employee(){}

    public Employee(long id, String name, String department, String email) {
        Id = id;
        this.name = name;
        this.department = department;
        this.email = email;
    }
}
