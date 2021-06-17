package com.example.pruebatecnica.repositories;

import com.example.pruebatecnica.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {

}
