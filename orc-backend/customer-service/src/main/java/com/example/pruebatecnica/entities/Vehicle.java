package com.example.pruebatecnica.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="vehicle")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle extends Client{

    private Boolean official;


}
