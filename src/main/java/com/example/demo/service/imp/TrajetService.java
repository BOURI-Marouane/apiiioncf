package com.example.demo.service.imp;

import com.example.demo.dto.Trajetdto;
import com.example.demo.mappers.TrajetMappers;
import com.example.demo.model.Gare;
import com.example.demo.model.Train;
import com.example.demo.model.Trajet;
import com.example.demo.repository.GareRepository;
import com.example.demo.repository.TrainRepository;
import com.example.demo.repository.TrajetRepository;
import com.example.demo.service.ITrajetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TrajetService implements ITrajetService {

    @Autowired
    TrajetRepository trajetRepository;

    @Autowired
    GareRepository gareRepository;

    @Autowired
    TrainRepository trainRepository;

    @Autowired
    TrajetMappers trajetMappers;

    @Override
    public Trajet findByCode(Long code) {
        Optional<Trajet> trajet = trajetRepository.findById(code);
        return trajet.get();
    }

    @Override
    public List<Trajet> findAll() {
        return trajetRepository.findAll();
    }



    @Override
    public List<Trajet> save(Trajetdto trajetdto){
        Trajet trajet = trajetMappers.toTrajet(trajetdto);
        Optional<Gare> gare_depart=gareRepository.findById(trajetdto.getGareDepart());
        Optional<Gare> gare_arrive=gareRepository.findById(trajetdto.getGareArrive());
        Optional<Train> train = trainRepository.findById(trajetdto.getTrain());
        trajet.setGareDepart(gare_depart.get());
        trajet.setGareArrive(gare_arrive.get());
        trajet.setTrain(train.get());
        trajetRepository.save(trajet);
        return trajetRepository.findAll();
    }



    @Override
    public List<Trajet> findByDate(Date date, Long id_gare_depart, Long id_gare_arrive)
    {
        Optional<Gare> gare_depart = gareRepository.findById(id_gare_depart);
        Optional<Gare> gare_Arrive = gareRepository.findById(id_gare_arrive);
        List<Trajet> listTrajet;
        listTrajet = trajetRepository.find(date,gare_depart.get(),gare_Arrive.get());
        return listTrajet;
    }
}
