package com.example.pruebatecnica.service.impl;

import com.example.pruebatecnica.dto.ForestDto;
import com.example.pruebatecnica.dto.ResidentDto;
import com.example.pruebatecnica.dto.VehicleDto;
import com.example.pruebatecnica.dto.create.CreateForestDto;
import com.example.pruebatecnica.dto.create.CreateResidentDto;
import com.example.pruebatecnica.dto.create.CreateVehicleDto;
import com.example.pruebatecnica.entities.Forest;
import com.example.pruebatecnica.entities.Resident;
import com.example.pruebatecnica.entities.Vehicle;
import com.example.pruebatecnica.exceptions.ForestNotFoundException;
import com.example.pruebatecnica.exceptions.ResidentNotFoundException;
import com.example.pruebatecnica.exceptions.VehicleNotFoundException;
import com.example.pruebatecnica.repositories.ForestRepository;
import com.example.pruebatecnica.repositories.ResidentRepository;
import com.example.pruebatecnica.repositories.VehicleRepository;
import com.example.pruebatecnica.service.ClientService;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CLientServiceImpl implements ClientService {

    @Autowired
    private ForestRepository forestRepository;

    @Autowired
    private ResidentRepository residentRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Forest getForestById(Long forestId) {
        Optional<Forest> forest = forestRepository.findById(forestId);
        return forest.orElseThrow(()->new ForestNotFoundException(forestId.toString()));
    }

    @Override
    public Forest createForest(CreateForestDto createForestDto) throws  ForestNotFoundException {
        Forest forest = new Forest();
        try{
            ForestDto forestDto = new ForestDto();
            forest.setDni(createForestDto.getDni());
            forest.setPlaca(createForestDto.getPlaca());

            return forestRepository.save(forest);
        }catch (Exception e){
            throw  new ForestNotFoundException("NOT_FOUND");
        }
    }

    @Override
    public Forest updateForest( CreateForestDto createForestDto, Long ForestId)throws ForestNotFoundException {
        Optional<Forest> forest = forestRepository.findById(ForestId);
        if(!forest.isPresent()){
            throw  new ForestNotFoundException("NOT_FOUND");
        }
        try{
            Forest newForest = forest.get();
            newForest.setPlaca(createForestDto.getPlaca());
            newForest.setDni(createForestDto.getDni());
            return forestRepository.save(newForest);

        } catch (Exception e){
            throw  new ForestNotFoundException("NOT_FOUND");
        }
    }

    @Override
    public Resident getResidentById(Long residentId) {
        return null;
    }

    @Override
    public Resident createResident(CreateResidentDto createResidentDto, Long residentId)  {
        Resident resident = new Resident();
        try{
            ResidentDto residentDto = new ResidentDto();
            resident.setPlaca(createResidentDto.getPlaca());
            resident.setAddress(createResidentDto.getAddress());
            resident.setOwnerName(createResidentDto.getOwnerName());

            return residentRepository.save(resident);
        }catch (Exception e){
            throw  new ResidentNotFoundException("NOT_FOUND");
        }
    }

    @Override
    public Resident updateResident(CreateResidentDto createResidentDto, Long residentId) throws ResidentNotFoundException {
        Optional<Resident> resident = residentRepository.findById(residentId);
        if(!resident.isPresent()){
            throw  new ResidentNotFoundException("NOT_FOUND");
        }
        try{
            Resident newResident = resident.get();
            newResident.setPlaca(createResidentDto.getPlaca());
            newResident.setAddress(createResidentDto.getAddress());
            newResident.setOwnerName(createResidentDto.getOwnerName());
            return residentRepository.save(newResident);

        } catch (Exception e){
            throw  new ForestNotFoundException("NOT_FOUND");
        }
    }

    @Override
    public Vehicle getVehicleById(Long vehicleId) {
        return null;
    }

    @Override
    public Vehicle createVehicle(CreateVehicleDto createVehicleDto, Long vehicleId) throws VehicleNotFoundException {
        Vehicle vehicle = new Vehicle();
        try{
            VehicleDto vehicleDto = new VehicleDto();
            vehicle.setPlaca(createVehicleDto.getPlaca());
            vehicle.setOfficial(true);

            return vehicleRepository.save(vehicle);
        }catch (Exception e){
            throw  new VehicleNotFoundException("NOT_FOUND");
        }
    }

    @Override
    public Vehicle updateVehicle(CreateVehicleDto createVehicleDto, Long vehicleId) throws VehicleNotFoundException {
        Optional<Vehicle> vehicle = vehicleRepository.findById(vehicleId);
        if(!vehicle.isPresent()){
            throw  new VehicleNotFoundException("NOT_FOUND");
        }
        try{
            Vehicle newVehicle = vehicle.get();
            newVehicle.setPlaca(createVehicleDto.getPlaca());
            newVehicle.setOfficial(false);
            return vehicleRepository.save(newVehicle);

        } catch (Exception e){
            throw  new VehicleNotFoundException("NOT_FOUND");
        }
    }
}
