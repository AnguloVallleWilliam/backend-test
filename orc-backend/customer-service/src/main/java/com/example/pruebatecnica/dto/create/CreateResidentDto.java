package com.example.pruebatecnica.dto.create;

import com.example.pruebatecnica.entities.Client;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Calendar;
@Data
public class CreateResidentDto {

    private String placa;
    private String address;
    private String ownerName;


}
