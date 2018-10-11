package com.kodilla.kodillam1p6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaM1p6Application {

    public static void main(String[] args) {
        SpringApplication.run(KodillaM1p6Application.class, args);

        Plant tree = new Plant("green");
        Plant flower = new Plant("red");

        System.out.println(tree.hashCode());
        System.out.println(flower.hashCode());
    }
}

class Plant {

    String colour;

    public Plant(String colour) {
        this.colour = colour;
    }
}