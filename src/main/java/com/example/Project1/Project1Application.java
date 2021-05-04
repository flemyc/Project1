package com.example.Project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Project1Application.class, args);
			Alien a = context.getBean(Alien.class);
			a.show();
	}

}
