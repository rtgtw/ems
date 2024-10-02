package com.employees.ems.controller;

import com.employees.ems.dto.EmployeeDto;
import com.employees.ems.mapper.EmployeeMapper;
import com.employees.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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


     //Get employee REST API
    //This REST Api being exposed by this back end java is just going to call the service
    //and return the value
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@RequestBody @PathVariable("id") Long employeeId){



        return new ResponseEntity<>(employeeService.getEmployeeById(employeeId), HttpStatus.ACCEPTED);

    }

    @GetMapping("help")
    public ResponseEntity<String> getHelp(){
        String help = "Create Employee: \n" +
                "{firstName: fName, \n" +
                "lastName : lName, \n" +
                "email: emailAddr}";


        return new ResponseEntity<>(help, HttpStatus.ACCEPTED);
    }

    @GetMapping
    //Build get all employees rest api
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employees = employeeService.getAllEmployees();


        return ResponseEntity.ok(employees);
    }


    //Build update employee rest api
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId, @RequestBody EmployeeDto updatedEmployee){
       EmployeeDto employeeDto =  employeeService.updateEmployee(employeeId, updatedEmployee);
        return ResponseEntity.ok(employeeDto);
    }


    //Build delete employee rest api
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);

        return ResponseEntity.ok("Employee deleted successfully");
    }
}
