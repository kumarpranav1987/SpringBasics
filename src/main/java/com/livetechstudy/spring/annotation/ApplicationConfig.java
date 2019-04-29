package com.livetechstudy.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.livetechstudy.spring.annotation")
public class ApplicationConfig {

	@Bean
	public Employee employee1() {
		return new Employee("Employee1", department());
	}

	@Bean
	public Department department() {
		return new Department("100", "Development");
	}
}
