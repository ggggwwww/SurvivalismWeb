package com.example.survivalismweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SurvivalismWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SurvivalismWebApplication.class, args);
    }

}
