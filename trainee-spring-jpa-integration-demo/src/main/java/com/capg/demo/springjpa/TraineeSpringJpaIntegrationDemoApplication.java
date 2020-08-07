package com.capg.demo.springjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages="com.capg.demo.springjpa.service")
public class TraineeSpringJpaIntegrationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraineeSpringJpaIntegrationDemoApplication.class, args);
	}
	
	
}
