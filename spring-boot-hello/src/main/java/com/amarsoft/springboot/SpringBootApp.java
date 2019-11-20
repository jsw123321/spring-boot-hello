package com.amarsoft.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootApp {
      public static void main(String[] args) {
		//SpringApplication.run(SpringBootApp.class, args);
		new SpringApplicationBuilder(SpringBootApp.class).run(args);
	}
}
