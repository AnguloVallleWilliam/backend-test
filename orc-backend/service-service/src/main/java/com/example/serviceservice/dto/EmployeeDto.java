package com.example.serviceservice.dto;

import lombok.Data;

import javax.persistence.Column;
@Data
public class EmployeeDto {
    private Long id;

    private String name;

    private String dni;
}
