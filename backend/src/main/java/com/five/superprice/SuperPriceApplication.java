package com.five.superprice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.five.superprice.controller", "com.five.superprice.services"})
@EntityScan("com.five.superprice.entity")
@EnableJpaRepositories("com.five.superprice.repository")
@SpringBootApplication
public class SuperPriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperPriceApplication.class, args);
    }

}
