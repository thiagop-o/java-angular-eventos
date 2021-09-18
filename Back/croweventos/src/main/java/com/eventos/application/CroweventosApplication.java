package com.eventos.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.EntityListeners;

@SpringBootApplication
@EntityScan("com.eventos.models")
@EnableJpaRepositories("com.eventos.repositories")
@ComponentScan("com.eventos")
@EnableJpaAuditing
public class CroweventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CroweventosApplication.class, args);
	}

}
