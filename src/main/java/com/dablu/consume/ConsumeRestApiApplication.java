package com.dablu.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeRestApiApplication.class, args);
		System.out.println("Welcome to our new feature");
	}

}
