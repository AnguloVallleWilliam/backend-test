package com.example.pruebatecnica.service;

import com.example.pruebatecnica.entities.Forest;
import com.example.pruebatecnica.entities.Ticket;

import java.util.List;

public interface TicketService {
    Ticket getTicketById(Long ticketId);
    //Forest getForest
    List<Ticket> getTicket();
    Ticket createTicket();
    Ticket updateTicket(Long ticketId);
    String deleteTicket(Long ticketId);
}
