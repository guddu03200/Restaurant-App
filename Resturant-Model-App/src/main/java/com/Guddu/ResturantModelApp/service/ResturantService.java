package com.Guddu.ResturantModelApp.service;

import com.Guddu.ResturantModelApp.model.ResturantModel;
import com.Guddu.ResturantModelApp.repository.ResturantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class ResturantService {
@Autowired
ResturantRepo resturantRepo;



    public  List<ResturantModel> getAllResturants() {
        return resturantRepo.getResturantModels();
    }




    public String addResturant(List<ResturantModel> resturantModels) {
        List<ResturantModel> resturantModels1 = getAllResturants();
        resturantModels1.addAll(resturantModels);
        return "product added";
    }
    public  ResturantModel fetchResturantById(Integer id) {
        List<ResturantModel> resturantModels = getAllResturants();
        for(ResturantModel R : resturantModels){
            if(id.equals(R.getUserId())){
                return R;
            }
        }
        throw new IllegalStateException("id not found");
    }



    public  String updateSpecialityById(Integer id, String speciality) {
        List<ResturantModel> resturantModels = getAllResturants();
        for(ResturantModel R : resturantModels){
            if(id.equals(R.getUserId())){
                R.setSpeciality(speciality);
                return "Resturant speciality updated";
            }
        }
        return "Resturant not found with Resturant Id "+id;
    }



    public  String deleteResturantById(Integer id) {
        List<ResturantModel> resturantModels = getAllResturants();

        for(ResturantModel R : resturantModels){
            if(id.equals(R.getUserId())){
                resturantModels.remove(R);
                return "Resturant deleted";
            }
        }
        return "Resturant Not found with the resturant Id "+id;
    }


}
