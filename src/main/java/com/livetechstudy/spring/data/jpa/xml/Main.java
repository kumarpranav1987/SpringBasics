package com.livetechstudy.spring.data.jpa.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Example;
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("data_jpa_hibernate.xml");
		BookRepository repository =context.getBean(BookRepository.class);
		String bookid="100";
		repository.save(new Book(bookid, "ABC", "XYZ"));
		
		System.out.println("Find All After save");
		System.out.println(repository.findAll());
		
		System.out.println("Find By ID");
		System.out.println(repository.findById(bookid).get());
		
		System.out.println("Find By Title");
		Book b = new Book();
		b.setBookTitle("ABC");
		Example<Book>example = Example.of(b);
		System.out.println(repository.findAll(example));
		
		System.out.println("Deleting ID:"+bookid);
		repository.deleteById(bookid);
		
		System.out.println("Find All After Deleting");
		System.out.println(repository.findAll());
		((ClassPathXmlApplicationContext) context).close();
	}
}
