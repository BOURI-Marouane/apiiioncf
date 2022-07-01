package com.example.demo.repository;

import com.example.demo.model.StationTaxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationTaxiRepository extends JpaRepository<StationTaxi,Long> {
}
