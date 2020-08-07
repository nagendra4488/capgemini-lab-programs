package com.capg.demo.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Labbook3Application {

	public static void main(String[] args) {
		SpringApplication.run(Labbook3Application.class, args);
	}

	
	@Bean
	public RestTemplate getRestTemplateBean() {
		return new RestTemplate();
		}
	
}
