package com.kusandriadi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class SpringSecurityReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityReactiveApplication.class, args);
	}

}
