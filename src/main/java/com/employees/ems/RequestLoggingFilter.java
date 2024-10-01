package com.employees.ems;

import com.employees.ems.entity.Logs;
import com.employees.ems.repository.LogsRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;


@AllArgsConstructor
@Component
public class RequestLoggingFilter implements Filter {

    //npi, create object!

    LogsRepository logsRepository;



    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        Logs logs = new Logs();
        HttpServletRequest httpRequest = (HttpServletRequest) request;

        // Log the request details

        logs.setRequestUrl(httpRequest.getRequestURL().toString()) ;
        logs.setHttpMethod(httpRequest.getRequestURL().toString());
        logs.setRemoteAddress(httpRequest.getRemoteAddr());
//        logs.setCookies(httpRequest.getCookies()[0].toString());

        logsRepository.save(logs);

        System.out.println("Client information saved into DB");

//        System.out.println("Request URL: " + httpRequest.getRequestURL());
//        System.out.println("HTTP Method: " + httpRequest.getMethod());
//        System.out.println("Remote Address: " + httpRequest.getRemoteAddr());
//        System.out.println("Headers:");



//        Enumeration<String> headerNames = httpRequest.getHeaderNames();
//        while (headerNames.hasMoreElements()) {
//            String headerName = headerNames.nextElement();
//            System.out.println(headerName + ": " + httpRequest.getHeader(headerName));
//        }

        // Continue with the next filter in the chain
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {
    }
}
