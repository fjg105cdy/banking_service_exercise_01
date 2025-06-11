package com.yian.exercise_0301;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Exercise0301Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercise0301Application.class, args);
    }

}
