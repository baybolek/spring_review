package com.domain.stereotype_annotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.domain")  -  to specify which packages need to be scanned
@ComponentScan
public class ConfigCourse {
}
