package com.example.pruebatecnica.service;

import com.example.pruebatecnica.dto.create.CreateForestDto;
import com.example.pruebatecnica.dto.create.CreateResidentDto;
import com.example.pruebatecnica.dto.create.CreateVehicleDto;
import com.example.pruebatecnica.entities.Forest;
import com.example.pruebatecnica.entities.Resident;
import com.example.pruebatecnica.entities.Ticket;
import com.example.pruebatecnica.entities.Vehicle;
import com.example.pruebatecnica.exceptions.ForestNotFoundException;
import com.example.pruebatecnica.exceptions.ResidentNotFoundException;
import com.example.pruebatecnica.exceptions.VehicleNotFoundException;

import java.util.List;

public interface ClientService  {
    Forest getForestById(Long fatherId);
    //Forest getForest
    //List<Forest> getForest();
    Forest createForest(CreateForestDto createForestDto) throws ForestNotFoundException;
    Forest updateForest(CreateForestDto forestDto,Long ForestId) throws ForestNotFoundException;
    //String deleteForest(Long ForestId);

    Resident getResidentById(Long residentId);
    //Forest getForest
    //List<Resident> getResident();
    Resident createResident(CreateResidentDto createResidentDto, Long ResidentId) throws ResidentNotFoundException;
    Resident updateResident(CreateResidentDto createResidentDto, Long residentId) throws ResidentNotFoundException;

    Vehicle getVehicleById(Long vehicleId);
    //Forest getForest
    //List<Vehicle> getVehicle();
    Vehicle createVehicle(CreateVehicleDto createVehicleDto, Long VehicleId) throws VehicleNotFoundException;
    Vehicle updateVehicle(Long vehicleId);
    //String deleteTicket(Long vehicleId);
}
