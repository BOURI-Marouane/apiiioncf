package com.example.demo.service;

import com.example.demo.dto.StationBusDto;
import com.example.demo.model.Gare;
import com.example.demo.model.StationBus;

import java.util.List;

public interface IStationBusService {
    Gare findByCode(Long code);
    Gare findByName(String name);
    List<StationBus> findAll();
    List<StationBus> save(StationBusDto stationBusDto);

    List<StationBus> delete(Long id);
}
