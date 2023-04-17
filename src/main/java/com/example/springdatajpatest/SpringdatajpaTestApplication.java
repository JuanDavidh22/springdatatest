package com.example.springdatajpatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdatajpaTestApplication {
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringdatajpaTestApplication.class, args);
		CocheRepository cocheRepository = context.getBean(CocheRepository.class);
		System.out.println("find");
		System.out.println(cocheRepository.count());
	}


}
