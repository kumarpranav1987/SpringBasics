package com.livetechstudy.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotaionExampleMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Employee e = ctx.getBean("employee1", Employee.class);
		System.out.println(e);
		((AnnotationConfigApplicationContext)ctx).close();
	}
}
