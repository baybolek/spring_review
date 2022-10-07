package com.domain.bean_annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }


//    @Bean(name = "p1")
    @Bean
    @Primary
    PartTimeMentor partTimeMentor(){
        System.out.println("this one is primary");
        return new PartTimeMentor();
    }

//    @Bean(name = "p2")
    @Bean
    PartTimeMentor partTimeMentor2(){
        System.out.println("this is not primary");
        return new PartTimeMentor();
    }
}
