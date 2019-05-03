package com.livetechstudy.spring.data.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, String> {
	public List<Book> getAllBooks();

	public void insertBook(Book book);

	public Book findBookByID(String bookID);

	public int deleteBook(String bookID);

	public List<Book> findBooksByTitle(String title);
}
