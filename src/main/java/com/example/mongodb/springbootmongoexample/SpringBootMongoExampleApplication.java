package com.example.mongodb.springbootmongoexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.mongodb.springbootmongoexample.controller",
        "com.example.mongodb.springbootmongoexample.service",
        "com.example.mongodb.springbootmongoexample.serviceImpl"})
@SpringBootApplication
public class SpringBootMongoExampleApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoExampleApplication.class, args);
    }

}
