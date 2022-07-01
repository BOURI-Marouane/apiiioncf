package com.example.demo.dto;

import com.example.demo.model.Gare;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChercheTrajet {

    private Gare gareDepart;
    private Gare gareDarrive;

}
