package com.Guddu.ResturantModelApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResturantModel {
    private String resName;
    private String resAddress;
    private String contactNum;
    private String speciality;
    private Integer totalStaff;
    private Integer rating;
    private Integer userId;

}
