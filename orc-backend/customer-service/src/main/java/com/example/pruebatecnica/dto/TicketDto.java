package com.example.pruebatecnica.dto;

import com.example.pruebatecnica.entities.Client;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Calendar;

public class TicketDto {
    private Long id;


    private String description;

    //El tiempo de registro

    private Calendar registDate;


    private Calendar finishDate;


    private Double amount;

    private Long clientId;


}
