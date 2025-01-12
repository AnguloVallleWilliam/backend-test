package com.example.serviceservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",unique = true,nullable = false)
    private Long id;
    @Column(name="name",nullable = false)
    private String name;
    @Column(name="dni",nullable = false)
    private String dni;

}
