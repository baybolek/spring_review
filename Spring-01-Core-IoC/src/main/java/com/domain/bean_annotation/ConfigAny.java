package com.domain.bean_annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAny {


    @Bean
    String str(){
        return "Java Developer";
    }

    @Bean
    Integer number(){
        return 100;
    }
}
