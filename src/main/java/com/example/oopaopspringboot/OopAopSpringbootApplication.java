package com.example.oopaopspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAspectAutoProxy
@SpringBootApplication
public class OopAopSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(OopAopSpringbootApplication.class, args);
    }

}
