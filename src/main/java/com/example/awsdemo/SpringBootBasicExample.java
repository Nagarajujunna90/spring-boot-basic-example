package com.example.awsdemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
@OpenAPIDefinition(info = @Info(title = "Spring Boot Basic Application",description = "Spring boot example with out any DB"))
@SpringBootApplication
public class SpringBootBasicExample {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicExample.class, args);
    }

}
