package com.example.pruebatecnica.client;

import com.example.pruebatecnica.config.CustomerServiceConfig;
import com.example.pruebatecnica.dto.EmployeeDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Slf4j
@Component
public class ServiceServiceClient {

    private RestTemplate restTemplate;

    @Autowired
    private CustomerServiceConfig customerServiceConfig;

    public  ServiceServiceClient(RestTemplateBuilder builder){
        restTemplate = builder.build();
    }

    public Optional<EmployeeDto> findEmployeById(Long employeeId) {
        Optional<EmployeeDto> result = Optional.empty();
        try {
            result = Optional.ofNullable(restTemplate.getForObject(customerServiceConfig.getServiceServiceUrl() + "employee/{id}", EmployeeDto.class, employeeId ));

        } catch (HttpClientErrorException ex) {
            if (ex.getStatusCode() != HttpStatus.NOT_FOUND) {
                throw ex;
            }
        }
        return result;
    }

}
