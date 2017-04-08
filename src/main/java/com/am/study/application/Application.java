package com.am.study.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * Created by augustomarinho on 26/03/17.
 */
@SpringBootApplication
public class Application {

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}