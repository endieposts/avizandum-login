package com.endie.avizandum.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.endie.avizandum.login.controller"})
@ComponentScan(basePackages = {"com.endie.avizandum.login.service"})
@ComponentScan(basePackages = {"com.endie.avizandum.login.configuration"})
@EntityScan(basePackages = {"com.endie.avizandum.login.model"})
@EnableJpaRepositories(basePackages = {"com.endie.avizandum.login.repository"})
public class LoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }

}
