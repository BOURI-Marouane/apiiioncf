package com.example.demo.repository;

import com.example.demo.model.StationTram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationTramRepository extends JpaRepository<StationTram,Long> {
}
