package com.kyrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("In order to go to the site, use the link: http://localhost:8080/index");
        SpringApplication.run(App.class, args);
    }
}
