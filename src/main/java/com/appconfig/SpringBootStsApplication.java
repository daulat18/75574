package com.appconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan("com.controller")
@EntityScan("com.model")
@Configuration
@EnableJpaRepositories("com.repository")
@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootStsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStsApplication.class, args);
	}
}
