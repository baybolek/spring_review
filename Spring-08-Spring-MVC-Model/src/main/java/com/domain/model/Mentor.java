package com.domain.model;

import com.domain.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Mentor {


    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

}
