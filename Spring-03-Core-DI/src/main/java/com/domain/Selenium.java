package com.domain;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Selenium {

    OfficeHours officeHours;

    public void getTeachingHours(){

        System.out.println("Weekly teaching hours : " + (15+officeHours.getOfficeHours()));
    }
}
