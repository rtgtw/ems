package com.employees.ems.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


//We use Dto class to transfer between client and server
//Create employee mapper class to map DTO to entity
//Convert DTO -> JPA entity and back
//Mapper class is created to convert both
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    //Getters and setters
    public Long getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }


    public void setFirstName(String firstName){
        this.firstName = firstName;

    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }

}




