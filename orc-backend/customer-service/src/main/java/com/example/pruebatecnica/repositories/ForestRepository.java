package com.example.pruebatecnica.repositories;

import com.example.pruebatecnica.entities.Forest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForestRepository extends JpaRepository<Forest,Long> {

}
