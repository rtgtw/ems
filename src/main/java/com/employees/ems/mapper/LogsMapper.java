package com.employees.ems.mapper;

import com.employees.ems.dto.LogsDto;
import com.employees.ems.entity.Logs;

public class LogsMapper {



    //Log JPA entity to log DTO
    public static LogsDto mapToLogsDto(Logs logs){
        return new LogsDto(
                logs.getId(),
                logs.getRequestUrl(),
                logs.getHttpMethod(),
                logs.getRemoteAddress(),
                logs.getCookies()
        );
    }



    //LogsDto to logs entity
    public static Logs mapToLogs(LogsDto logsDto){
        return new Logs(
                logsDto.getId(),
                logsDto.getRequestUrl(),
                logsDto.getHttpMethod(),
                logsDto.getRemoteAddress(),
                logsDto.getCookies()
        );
    }
}
