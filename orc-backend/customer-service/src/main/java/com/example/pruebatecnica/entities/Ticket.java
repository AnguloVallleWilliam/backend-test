package com.example.pruebatecnica.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String description;

    //El tiempo de registro
    @Column(name = "REGIST_DATE", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar registDate;

    @Column(name = "FINISH_DATE", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar finishDate;

    @Column(name="amount", nullable = false)
    private Double amount;

    //manytoone with clients
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id",nullable = false)
    private Client client;


}
