package com.domain.controller;


import com.domain.enums.Gender;
import com.domain.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {


    @RequestMapping("/list")  // localhost:8080/mentor/list
    public String homePage(Model model){

        List<Mentor> mentorList=new ArrayList<>();
        mentorList.add(new Mentor("Mike","Smith", 45, Gender.MALE));
        mentorList.add(new Mentor("Tom","Hanks", 65, Gender.MALE));
        mentorList.add(new Mentor("Ammy","Bryan", 25, Gender.FEMALE));

        model.addAttribute("mentors",mentorList);



        return "/mentor/mentor.html";
    }
}
