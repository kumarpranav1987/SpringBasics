package com.livetechstudy.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.livetechstudy.spring.aop")
public class ApplicationConfiguration {
	
	@Bean
	public Calculator calculator() {
		return new Calculator();
	}
}
