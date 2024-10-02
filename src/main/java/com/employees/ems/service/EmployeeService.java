package com.employees.ems.service;

import com.employees.ems.dto.EmployeeDto;

import java.util.List;

//Create a EmployeeServiceImpl to implement these services on the interface
public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}
