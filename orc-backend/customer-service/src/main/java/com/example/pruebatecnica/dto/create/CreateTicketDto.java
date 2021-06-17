package com.example.pruebatecnica.dto.create;

import lombok.Data;

import java.util.Calendar;
@Data
public class CreateTicketDto {


    private String description;

    private Calendar registDate;

    private Calendar finishDate;

    private Double amount;

    private Long  clientId;
}
