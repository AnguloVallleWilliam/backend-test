package com.example.pruebatecnica.service;

import com.example.pruebatecnica.entities.Ticket;
import com.example.pruebatecnica.entities.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle getVehicleById(Long vehicleId);
    //Forest getForest
    List<Vehicle> getVehicle();
    Vehicle createVehicle();
    Vehicle updateVehicle(Long vehicleId);
    String deleteTicket(Long vehicleId);
}
