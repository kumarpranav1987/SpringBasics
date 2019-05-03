package com.livetechstudy.spring.data.jpa;

import java.util.List;

public interface BookDao {
	public List<Book>getAllBooks();
	public void insertBook(Book book);
	public Book findBookByID(String bookID);
	public int deleteBook(String bookID);
	public List<Book> findBooksByTitle(String title);
}
