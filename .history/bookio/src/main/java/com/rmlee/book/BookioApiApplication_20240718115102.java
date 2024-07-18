package com.rmlee.bookio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookioApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookioApiApplication.class, args);
	}

}