package com.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {



//    1. Field injection
//    @Autowired
//    OfficeHours officeHours;



//    2. Constructor Injection
    OfficeHours officeHours;

//    @Autowired --- after spring 4.3 version we dont need to put @Autowired annotation explicitly in the constructor. it will happen automatically
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours(){

        System.out.println("Weekly teaching hours : "+ (20+officeHours.getOfficeHours()));
    }
}
