package com.sam.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class BasicAuthenticationSBootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicAuthenticationSBootSecurityApplication.class, args);
	}

}
