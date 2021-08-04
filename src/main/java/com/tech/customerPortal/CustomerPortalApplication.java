package com.tech.customerPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class CustomerPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerPortalApplication.class, args);
	}

}
