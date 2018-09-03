package com.cg.plp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.plp")
public class CommonFeedbackFrontEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonFeedbackFrontEndApplication.class, args);
	}
}
