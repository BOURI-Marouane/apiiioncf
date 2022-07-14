package com.example.demo.dto;

import com.example.demo.model.Gare;
import com.example.demo.model.Train;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Trajetdto {
    private Date dateDepart;
    private Date dateArrive;
    private String heureDepart;
    private String heureArrive;
    private int retardMinutes;
    private long gareDepart;
    private long gareArrive;
    private long train;
}
