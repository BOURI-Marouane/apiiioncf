package com.example.demo.service;

import com.example.demo.model.Gare;
import com.example.demo.model.StationBus;
import com.example.demo.model.StationTaxi;

import java.util.List;

public interface IStationTaxiService {
    Gare findByCode(Long code);
    Gare findByName(String name);
    List<StationTaxi> findAll();
    List<StationTaxi> save(StationTaxi stationTaxi);
}
