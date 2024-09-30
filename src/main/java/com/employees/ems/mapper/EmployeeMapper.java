package com.employees.ems.mapper;

import com.employees.ems.dto.EmployeeDto;
import com.employees.ems.entity.Employee;

public class EmployeeMapper {


//Employee JPA entity to employee DTO
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail());
    }

    //EmployeeDTO to employee entity

    public static Employee maptoEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }




}
