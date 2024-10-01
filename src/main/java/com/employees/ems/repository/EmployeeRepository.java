package com.employees.ems.repository;

import com.employees.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Extending JpaRepository gives this interface access to CRUD operations on the employee entity
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
