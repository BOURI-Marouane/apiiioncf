package com.example.demo.mappers;

import com.example.demo.dto.StationBusDto;
import com.example.demo.model.StationBus;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StationBusMappers {
    @Autowired
    private ModelMapper modelMapper;
    public StationBus toStationBus(StationBusDto stationBusDto)
    {
        StationBus stationBus = modelMapper.map(stationBusDto, StationBus.class);
        return stationBus;
    }
}
