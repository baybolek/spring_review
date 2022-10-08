package com.domain.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.domain")
@ComponentScan(basePackages = {"com.domain.proxy","com.domain.service", "com.domain.repository"})
public class ProjectConfig {



}
