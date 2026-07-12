package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestHelloApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringRestHelloApplication.class, args);

        System.out.println("Spring REST Hello World Started");
    }
}
