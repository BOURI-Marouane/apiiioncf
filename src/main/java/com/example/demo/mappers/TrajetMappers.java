package com.example.demo.mappers;

import com.example.demo.dto.Trajetdto;
import com.example.demo.model.Trajet;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrajetMappers {

    @Autowired
    private ModelMapper modelMapper;

    public Trajet toTrajet(Trajetdto trajetdto)
    {
        Trajet trajet = modelMapper.map(trajetdto,Trajet.class);
        return trajet;
    }
}
