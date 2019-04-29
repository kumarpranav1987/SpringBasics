package com.livetechstudy.spring.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//Basic Java Code		
		/*HelloWorld obj = new HelloWorld("Hello World!");
		System.out.println(obj.getMessage());*/
		
		//Using Spring
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj.getMessage());
		((ClassPathXmlApplicationContext) context).close();
	}

}
