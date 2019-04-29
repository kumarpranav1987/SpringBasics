package com.livetechstudy.spring.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionExampleMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collection_example.xml");
		CollectionExample obj = context.getBean("collectionExample",CollectionExample.class);
		
		System.out.println("Country List");
		for(String s:obj.getCountryList()) {
			System.out.println(s);
		}
		
		System.out.println("Country Set");
		for(String s:obj.getCountrySet()) {
			System.out.println(s);
		}
		
		System.out.println("Country Map");
		for(Integer key : obj.getCountryMap().keySet()) {
			System.out.println("Key="+key+" Value="+obj.getCountryMap().get(key));
		}
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
