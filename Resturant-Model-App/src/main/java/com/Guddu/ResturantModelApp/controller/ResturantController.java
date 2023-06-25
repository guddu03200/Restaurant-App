package com.Guddu.ResturantModelApp.controller;

import com.Guddu.ResturantModelApp.model.ResturantModel;
import com.Guddu.ResturantModelApp.service.ResturantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResturantController {

    @Autowired
    ResturantService resturantService;

    @GetMapping("resturant")
    public List<ResturantModel> getAllResturants(){
        return resturantService.getAllResturants();
    }

    @PostMapping("resturant/add")
        public String addResturant(@RequestBody List<ResturantModel> resturantModels){
        return resturantService.addResturant(resturantModels);
        }
    @GetMapping("resturant/get/{id}")
    public ResturantModel ftechResturantById(@PathVariable Integer id){

        return resturantService.fetchResturantById(id);
    }

    @PutMapping("resturant/{Id}/{speciality}")
    public String updateSpeciality(@PathVariable Integer Id, @PathVariable String speciality){
        return resturantService.updateSpecialityById(Id, speciality);
    }

    @DeleteMapping("Resturant/delete/{Id}")
    public String deleteResturant(@PathVariable Integer Id){
        return resturantService.deleteResturantById(Id);
    }
}
