package com.example.demo.service.imp;

import com.example.demo.model.Gare;
import com.example.demo.model.StationTaxi;
import com.example.demo.model.StationTram;
import com.example.demo.repository.StationTramRepository;
import com.example.demo.service.IStationTramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationTramService implements IStationTramService {
    @Autowired
    StationTramRepository stationTramRepository;
    @Override
    public Gare findByCode(Long code) {
        return null;
    }

    @Override
    public Gare findByName(String name) {
        return null;
    }

    @Override
    public List<StationTram> findAll() {
        return stationTramRepository.findAll();
    }

    @Override
    public List<StationTram> save(StationTram stationTram) {
        stationTramRepository.save(stationTram);
        return stationTramRepository.findAll();
    }
}
