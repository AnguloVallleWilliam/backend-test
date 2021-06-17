package com.example.pruebatecnica.repositories;

import com.example.pruebatecnica.entities.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<Resident,Long> {
}
