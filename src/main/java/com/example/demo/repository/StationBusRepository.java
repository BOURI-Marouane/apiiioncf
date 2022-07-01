package com.example.demo.repository;

import com.example.demo.model.StationBus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationBusRepository extends JpaRepository<StationBus,Long> {
}
