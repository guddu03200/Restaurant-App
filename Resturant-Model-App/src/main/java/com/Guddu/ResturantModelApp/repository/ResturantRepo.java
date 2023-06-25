package com.Guddu.ResturantModelApp.repository;

import com.Guddu.ResturantModelApp.model.ResturantModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ResturantRepo {

    @Autowired
    List<ResturantModel> resturantModels;

    public List<ResturantModel> getResturantModels(){
        return resturantModels;
    }
}
