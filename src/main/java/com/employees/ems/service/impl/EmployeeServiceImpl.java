package com.employees.ems.service.impl;

import com.employees.ems.dto.EmployeeDto;
import com.employees.ems.entity.Employee;
import com.employees.ems.mapper.EmployeeMapper;
import com.employees.ems.repository.EmployeeRepository;
import com.employees.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


//Lets spring know to create a spring bean for this class
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {


    private EmployeeRepository employeeRepository;

    //The client does a request to create employee, so it comes in as DTO, then we
    //convert it to JPA to talk with DB then convert it back after to send back to client

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        //First employeeDTO -> JPA entity, store into database

        Employee employee = EmployeeMapper.maptoEmployee(employeeDto);

       Employee savedEmployee =  employeeRepository.save(employee);

       //Now we need to send the saved employee back to the client
        //convert employee back to DTO

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
