package com.livetechstudy.spring.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AOP_AnnotationMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Calculator calculator = context.getBean("calculator", Calculator.class);
		System.out.println(calculator.add(1,8));
		//System.out.println(calculator.divide(16,2));
		((AnnotationConfigApplicationContext) context).close();
	}
}
