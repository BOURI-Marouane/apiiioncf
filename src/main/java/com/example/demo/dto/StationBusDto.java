package com.example.demo.dto;

import com.example.demo.model.Gare;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StationBusDto {

    private Long gare_id;

    private double longitude;

    private double latitude;

    private String designation;
}
