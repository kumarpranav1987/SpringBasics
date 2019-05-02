package com.livetechstudy.spring.data.jdbc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJdbcMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
		
		((AnnotationConfigApplicationContext) context).close();
	}
}
