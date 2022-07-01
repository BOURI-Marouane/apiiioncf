package com.example.demo.service;

import com.example.demo.model.Gare;
import com.example.demo.model.StationTaxi;
import com.example.demo.model.StationTram;

import java.util.List;

public interface IStationTramService {
    Gare findByCode(Long code);
    Gare findByName(String name);
    List<StationTram> findAll();
    List<StationTram> save(StationTram stationTram);
}
