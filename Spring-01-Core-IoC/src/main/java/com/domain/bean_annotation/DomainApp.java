package com.domain.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DomainApp {

    public static void main(String[] args) {
        ApplicationContext container= new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft=container.getBean(FullTimeMentor.class);

        ft.createAccount();

        String str=container.getBean(String.class);

        System.out.println(str);

        Integer number=container.getBean(Integer.class);

        System.out.println(number);

//        PartTimeMentor pt=container.getBean("p1",PartTimeMentor.class);
        PartTimeMentor pt=container.getBean(PartTimeMentor.class);

        pt.createAccount();





    }
}
