package com.employees.ems.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LogsDto {


    private Long id;


    private String requestUrl;

    private String httpMethod;


    private String remoteAddress;


    private String cookies;



}