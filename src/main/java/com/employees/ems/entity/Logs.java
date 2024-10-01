package com.employees.ems.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "logs")
public class Logs {

    //Configure the primary key @ID
    @Id
    @GeneratedValue
    private Long id;


    //Columns

    @Column(name = "request_url")
    private String requestUrl;

    @Column(name = "http_method")
    private String httpMethod;

    @Column(name = "remote_address")
    private String remoteAddress;

    @Column(name = "cookies")
    private String cookies;



}
