package com.EmployeeDir.WebAppEmployee.repository;

import com.EmployeeDir.WebAppEmployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
