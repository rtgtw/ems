package com.employees.ems.controller;

import com.employees.ems.dto.EmployeeDto;
import com.employees.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//RequestMapping defines the base URL
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;


    //Build add employee rest api
    @PostMapping()
     public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
         EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);

         return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
     }


}
