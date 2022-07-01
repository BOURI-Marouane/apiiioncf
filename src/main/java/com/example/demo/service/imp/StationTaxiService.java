package com.example.demo.service.imp;

import com.example.demo.model.Gare;
import com.example.demo.model.StationTaxi;
import com.example.demo.repository.StationTaxiRepository;
import com.example.demo.service.IStationTaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationTaxiService implements IStationTaxiService {

    @Autowired
    StationTaxiRepository stationTaxiRepository;

    @Override
    public Gare findByCode(Long code) {
        return null;
    }

    @Override
    public Gare findByName(String name) {
        return null;
    }

    @Override
    public List<StationTaxi> findAll() {
        return stationTaxiRepository.findAll();
    }

    @Override
    public List<StationTaxi> save(StationTaxi stationTaxi) {
        stationTaxiRepository.save(stationTaxi);
        return stationTaxiRepository.findAll();
    }
}
