package com.example.demo.repository;

import com.example.demo.model.Gare;
import com.example.demo.model.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


public interface TrajetRepository extends JpaRepository<Trajet,Long> {

    @Query("SELECT t FROM Trajet t where t.dateDepart = :date AND t.gareDepart = :gareDepart AND t.gareArrive = :gareArrive")
    List<Trajet> find(@Param("date") Date date, @Param("gareDepart") Gare gareDepart, @Param("gareArrive") Gare gareArrive);

}
