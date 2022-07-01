package com.example.demo.service.imp;

import com.example.demo.dto.StationBusDto;
import com.example.demo.mappers.StationBusMappers;
import com.example.demo.model.Gare;
import com.example.demo.model.StationBus;
import com.example.demo.repository.GareRepository;
import com.example.demo.repository.StationBusRepository;
import com.example.demo.service.IStationBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StationBusService implements IStationBusService {

    @Autowired
    StationBusRepository stationBusRepository;

    @Autowired
    StationBusMappers stationBusMappers;

    @Autowired
    GareRepository gareRepository;

    @Override
    public Gare findByCode(Long code) {
        return null;
    }

    @Override
    public Gare findByName(String name) {
        return null;
    }


    @Override
    public List<StationBus> findAll() {
        return stationBusRepository.findAll();
    }

    @Override
    public List<StationBus> save(StationBusDto stationBusDto) {
        StationBus stationBus = stationBusMappers.toStationBus(stationBusDto);
         Optional<Gare> gare =  gareRepository.findById(stationBusDto.getGare_id());
         stationBus.setGare_id(gare.get());
         stationBusRepository.save(stationBus);
        return stationBusRepository.findAll();
    }

    @Override
    public List<StationBus> delete(Long id) {
        Optional<StationBus> stationBus = stationBusRepository.findById(id);
        stationBusRepository.delete(stationBus.get());
        return stationBusRepository.findAll();
    }
}
