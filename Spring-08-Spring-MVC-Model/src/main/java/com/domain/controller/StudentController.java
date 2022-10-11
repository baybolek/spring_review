package com.domain.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Domain");
        model.addAttribute("course","Spring-MVC");

        String subject="Collections";
        model.addAttribute("subject",subject);

//        create a random studentId(0-1000) and show it in your UI

        Random rand = new Random();
        int studentId = 0 + rand.nextInt(1000);
        model.addAttribute("studentId",studentId);

        List<Integer> numbers=new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(54);
        numbers.add(21);
        numbers.add(87);

        model.addAttribute("numbers",numbers);

        return "/student/welcome.html";
    }
}
