package com.employees.ems.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// you make a class as a JPA entity by using JPA annotations
    //@entity specifies a JPA entity


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ems")
public class Employee {

    //Configure the primary keys, specify @Id to do this
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Map columns
    @Column(name = "first_name")
    //if we dont give a name, its the same name by default
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id", nullable = false, unique = true)
    private String email;


    //Constructor
    //Annotations added it

    //Getters
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

    //Setters
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

//JPA automatically creates this table inside of the database and maps things to here
//makes sense


