package com.domain.entity;

import com.domain.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;

    @Column(name = "studentFirstName")
    private String firstName;

    @Column(name = "studentLastName")
    private String lastName;
    private String email;

//    below annotation will m ake sure that this field is not created in db table as column
    @Transient
    private String city;

    @Column(name = "DATE")
    private LocalDate birthdate;
    @Column(name = "TIME")
    private LocalTime birthtime;
    @Column(name = "TIMESTAMP")
    private LocalDateTime birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;



}
