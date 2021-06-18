package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.dto.ForestDto;
import com.example.pruebatecnica.dto.create.CreateForestDto;
import com.example.pruebatecnica.entities.Forest;
import com.example.pruebatecnica.service.ClientService;
import com.example.pruebatecnica.util.EntityConverter;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
public class ClientController {
    @Autowired
    ClientService clientService;

    @Autowired
    private EntityConverter converter;

    @ApiOperation(value = "Creates a teacher", notes = "This Operation creates a new teacher.")
    @PostMapping(value = "/forest")
    public ResponseEntity<ForestDto> createForest(@RequestBody @Valid CreateForestDto createForestDto){
             Forest forest = clientService.createForest(createForestDto);
             return new ResponseEntity<>(converter.convertForestToDto(forest), HttpStatus.CREATED);

    }
}
