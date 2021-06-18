package com.example.pruebatecnica.util;

import com.example.pruebatecnica.dto.ForestDto;
import com.example.pruebatecnica.dto.ResidentDto;
import com.example.pruebatecnica.dto.VehicleDto;
import com.example.pruebatecnica.dto.create.CreateForestDto;
import com.example.pruebatecnica.entities.Forest;
import com.example.pruebatecnica.entities.Resident;
import com.example.pruebatecnica.entities.Vehicle;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EntityConverter {
    @Autowired
    private ModelMapper modelMapper;

    public ForestDto convertForestToDto(Forest forest) {
        return modelMapper.map(forest,ForestDto.class);
    }
    public ResidentDto convertResidentToDto(Resident resident) {
        return modelMapper.map(resident,ResidentDto.class);
    }
    public VehicleDto convertVehicleToDto(Vehicle vehicle) {
        return modelMapper.map(vehicle,VehicleDto.class);
    }
    public Forest convertForestToEntity(ForestDto forestDto) {
        return modelMapper.map(forestDto,Forest.class);
    }
    public Forest convertCreateForestToEntity(CreateForestDto createForestDto) {
        return modelMapper.map(createForestDto, Forest.class);
    }

    public List<ForestDto> convertForestToDto(List<Forest> forests) {
        return forests.stream()
                .map(forest -> modelMapper.map(forest,ForestDto.class))
                .collect(Collectors.toList());
    }


    public List<ResidentDto> convertResidentToDto(List<Resident> residents) {
        return residents.stream()
                .map(resident -> modelMapper.map(resident,ResidentDto.class))
                .collect(Collectors.toList());
    }


    public List<VehicleDto> convertVehicleToDto(List<Vehicle> vehicles) {
        return vehicles.stream()
                .map(vehicle -> modelMapper.map(vehicle,VehicleDto.class))
                .collect(Collectors.toList());
    }

}
