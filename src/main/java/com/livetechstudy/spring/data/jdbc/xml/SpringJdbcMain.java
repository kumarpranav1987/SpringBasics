package com.livetechstudy.spring.data.jdbc.xml;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_template.xml");
		BookDaoImpl dao = context.getBean("bookdao", BookDaoImpl.class);
		
		String bookId="101";
		
		dao.insertBook(new Book(bookId, "XYZ", "PQR"));
		
		System.out.println("Get All Books");
		List<Book> books = dao.getAllBooks();
		for(Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("Get By BookId");
		System.out.println(dao.findBookByID(bookId));
		
		System.out.println("Find By Title");
		books = dao.findBooksByTitle("XYZ");
		for(Book book:books) {
			System.out.println(book);
		}
		
		dao.deleteBook(bookId);
		System.out.println("After deleting");
		books = dao.getAllBooks();
		for(Book book:books) {
			System.out.println(book);
		}
		((ClassPathXmlApplicationContext) context).close();
		
	}
}
