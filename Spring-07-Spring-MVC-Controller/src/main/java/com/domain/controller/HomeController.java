package com.domain.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // annotate the class with the @Controller stereotype annotation
public class HomeController {


    @RequestMapping("/home")  // use @RequestMapping annotation to associate the action with HTTP request path
    public String home(){
        return "/home.html";  //return the HTML document name that contains the details we want the browser to display
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "/welcome.html";
    }

    @RequestMapping("/")
    public String home3(){
        return "/welcome.html";
    }
}
