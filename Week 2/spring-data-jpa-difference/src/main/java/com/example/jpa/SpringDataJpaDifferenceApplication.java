package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaDifferenceApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringDataJpaDifferenceApplication.class, args);

        System.out.println("Difference between JPA, Hibernate and Spring Data JPA");
    }
}