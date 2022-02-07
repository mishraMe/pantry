package com.homemaker.pantry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication()
@EnableConfigurationProperties
public class PantryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PantryApplication.class, args);
    }

}
