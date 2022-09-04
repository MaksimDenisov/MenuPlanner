package com.github.maksimdenisov.menuplanner;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MenuPlannerApplication {

	@Bean
	ModelMapper getModelMapper(){
		return  new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(MenuPlannerApplication.class, args);
	}

}
