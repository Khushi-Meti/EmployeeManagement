package com.EmployeeDir.WebAppEmployee.controller;

import com.EmployeeDir.WebAppEmployee.model.Employee;
import com.EmployeeDir.WebAppEmployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public List<Employee> addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return employeeService.displayAll();
    }

    @GetMapping
    public List<Employee> display(){
        return employeeService.displayAll();
    }

    @GetMapping("/{id}")
    public Employee empById(@RequestBody long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/{id}")
    public List<Employee> update(@RequestBody long id, @RequestBody Employee employee){
        employeeService.UpdateEmployee(id, employee);
        return employeeService.displayAll();
    }
}
