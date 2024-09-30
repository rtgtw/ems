package com.employees.ems.repository;

import com.employees.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


//Extending JpaRepository gives this interface access to CRUD operations on the employee entity

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
