package com.example.pruebatecnica.exceptions;

public class ResidentNotFoundException extends RuntimeException{
    public ResidentNotFoundException(String message){
        super(message);
    }
}
