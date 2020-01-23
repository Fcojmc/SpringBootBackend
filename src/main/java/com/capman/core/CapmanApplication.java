package com.capman.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.capman")
@ComponentScan(basePackages = "com.capman")
@EntityScan("com.capman.entity")
@EnableJpaRepositories("com.capman.repository")
public class CapmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapmanApplication.class, args);
	}

}
