package com.livetechstudy.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NoAutoWireMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("emp_dep_no_autowire.xml");
		Employee obj = (Employee) context.getBean("employee1");
		System.out.println(obj);
		((ClassPathXmlApplicationContext) context).close();

	}

}
