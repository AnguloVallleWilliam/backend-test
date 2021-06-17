package com.example.pruebatecnica.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Resident")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resident extends Client {

    private String address;
    private String ownerName;

}
