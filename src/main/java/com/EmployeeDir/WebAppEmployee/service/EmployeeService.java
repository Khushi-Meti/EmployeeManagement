package com.EmployeeDir.WebAppEmployee.service;

import com.EmployeeDir.WebAppEmployee.model.Employee;
import com.EmployeeDir.WebAppEmployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public List<Employee> displayAll(){
        return employeeRepository.findAll();
    }
    public void deleteEmployee(long id){
        employeeRepository.deleteById(id);
    }

    public Employee UpdateEmployee(Long id, Employee updatedEmployee){
        return employeeRepository.findById(id).map(
                emp-> {
                    emp.setName(updatedEmployee.getName());
                    emp.setDepartment(updatedEmployee.getDepartment());
                    emp.setEmail(updatedEmployee.getEmail());
                    return employeeRepository.save(emp);
                })
                .orElseThrow(()-> new RuntimeException("Employee not found"));
    }

    public Employee getEmployeeById(long id){
        return employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee Not Found"));
    }
}
