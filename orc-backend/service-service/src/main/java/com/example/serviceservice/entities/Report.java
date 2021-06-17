package com.example.serviceservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "reports")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",unique = true,nullable = false)
    private Long id;
    @Column(name="description",nullable = false)
    private String description;
    //Ticket

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "service")
    private List<UserRapiService> userRapiServices;

}
