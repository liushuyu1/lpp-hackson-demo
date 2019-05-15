package com.hackson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.hackson"})
public class LppHacksonDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LppHacksonDemoApplication.class, args);
	}

}
