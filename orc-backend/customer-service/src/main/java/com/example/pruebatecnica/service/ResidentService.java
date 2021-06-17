package com.example.pruebatecnica.service;

import com.example.pruebatecnica.entities.Forest;
import com.example.pruebatecnica.entities.Resident;

import java.util.List;

public interface ResidentService {
    Resident getResidentById(Long residentId);
    //Forest getForest
    List<Resident> getResident();
    Resident createResident();
    Resident updateResident(Long residentId);
    String deleteForest(Long residentId);

}
