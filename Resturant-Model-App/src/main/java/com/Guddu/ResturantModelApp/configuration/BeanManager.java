package com.Guddu.ResturantModelApp.configuration;

import com.Guddu.ResturantModelApp.model.ResturantModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
    @Bean
    public List<ResturantModel> getResturant(){
        return new ArrayList<>();
    }
}
