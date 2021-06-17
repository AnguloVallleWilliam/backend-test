package com.example.pruebatecnica.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Foreing")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Forest extends Client {

    private String dni;

}
