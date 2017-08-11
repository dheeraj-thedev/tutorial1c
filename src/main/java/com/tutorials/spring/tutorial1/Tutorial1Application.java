package com.tutorials.spring.tutorial1;

import com.tutorials.spring.tutorial1.services.DummyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Tutorial1Application {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Tutorial1Application.class, args);
        System.out.println(" Spring Tutorial 1: Hello World with Spring Boot. ");
        //DummyService dummyService = new DummyServiceImpl();
        DummyService dummyService = context.getBean(DummyService.class);
        System.out.println(" DummyService returned: "+dummyService.test());
	}
}
