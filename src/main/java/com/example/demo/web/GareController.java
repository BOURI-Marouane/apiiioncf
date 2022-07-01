package com.example.demo.web;

import com.example.demo.dto.StationBusDto;
import com.example.demo.model.Gare;
import com.example.demo.model.StationBus;
import com.example.demo.model.StationTaxi;
import com.example.demo.model.StationTram;
import com.example.demo.service.imp.GareService;
import com.example.demo.service.imp.StationBusService;
import com.example.demo.service.imp.StationTaxiService;
import com.example.demo.service.imp.StationTramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/oncf")
public class GareController {

    @Autowired
    private GareService gareService;

    @Autowired
    private StationTramService stationTramService;

    @Autowired
    private StationBusService stationBusService;

    @Autowired
    private StationTaxiService stationTaxiService;

    ///////////// Web gare /////////////////////////////////////////////////

    @PostMapping("/gare/save")
    private List<Gare> savegare(@RequestBody Gare gare)
    {
        return gareService.save(gare);
    }

    @PostMapping("/gare/all")
    private List<Gare> findAllGare()
    {
        return gareService.findAll();
    }

    ///////////// Web Station Tram /////////////////////////////////////////////////

    @PostMapping("/StationTram/save")
    private List<StationTram> saveStationTram(@RequestBody StationTram stationTram)
    {
        return stationTramService.save(stationTram);
    }

    @PostMapping("/StationTram/all")
    private List<StationTram> findAllStationTram()
    {
        return stationTramService.findAll();
    }

    ///////////// Web Station bus /////////////////////////////////////////////////

    @PostMapping("/StationBus/save")
    private List<StationBus> saveStationBus(@RequestBody StationBusDto stationBusDto)
    {
        return stationBusService.save(stationBusDto);
    }

    @PostMapping("/StationBus/all")
    private List<StationBus> findAllStationBus()
    {
        return stationBusService.findAll();
    }

    @PostMapping("/StationBus/delete")
    private List<StationBus> delete(@RequestBody Long code)
    {
        return stationBusService.delete(code);
    }

    ///////////// Web Station Taxi /////////////////////////////////////////////////

    @PostMapping("/StationTaxi/save")
    private List<StationTaxi> saveStationTaxi(@RequestBody StationTaxi stationTaxi)
    {
        return stationTaxiService.save(stationTaxi);
    }

    @PostMapping("/StationTaxi/all")
    private List<StationTaxi> findAllStationTaxi()
    {
        return stationTaxiService.findAll();
    }
}
