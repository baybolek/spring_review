package com.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DomainApp {


    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigApp.class);

       Java java= container.getBean(Java.class);
       java.getTeachingHours();

       Selenium selenium=container.getBean(Selenium.class);
       selenium.getTeachingHours();

    }
}
