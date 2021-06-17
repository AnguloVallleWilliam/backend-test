package com.example.pruebatecnica.service;

import com.example.pruebatecnica.entities.Forest;

import java.util.List;

public interface ForestService {
    Forest getForestById(Long fatherId);
    //Forest getForest
    List<Forest> getForest();
    Forest createForest();
    Forest updateForest(Long ForestId);
    String deleteForest(Long ForestId);



}
