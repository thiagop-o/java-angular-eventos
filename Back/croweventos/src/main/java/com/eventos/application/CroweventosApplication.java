package com.eventos.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.eventos.controllers")
@SpringBootApplication
public class CroweventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CroweventosApplication.class, args);
	}

}
