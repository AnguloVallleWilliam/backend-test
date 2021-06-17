package com.example.pruebatecnica.exceptions;

public class VehicleNotFoundException extends RuntimeException {
    public VehicleNotFoundException(String message){
        super(message);
    }
}
