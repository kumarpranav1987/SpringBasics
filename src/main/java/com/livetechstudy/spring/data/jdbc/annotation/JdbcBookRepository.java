package com.livetechstudy.spring.data.jdbc.annotation;

public interface JdbcBookRepository {
	 Iterable<Book> findAll();
}
