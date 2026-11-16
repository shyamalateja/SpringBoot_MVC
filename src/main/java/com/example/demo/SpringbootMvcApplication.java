package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.SpringBootMvc.controller")
@ComponentScan("com.SpringBootMvc.service")
@EnableJpaRepositories(basePackages="com.SpringBootMvc.repository")

@EntityScan(basePackages="com.SpringBootMvc.model")

public class SpringbootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcApplication.class, args);
		System.out.println("start ");
	}

}
