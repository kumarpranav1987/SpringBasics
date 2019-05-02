package com.livetechstudy.spring.data.jdbc.annotation;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class JdbcBookRepositoryImpl implements JdbcBookRepository {
	
	private JdbcTemplate jdbc;
	
	@Autowired
	public JdbcBookRepositoryImpl(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}



	@Override
	public Iterable<Book> findAll() {
		return jdbc.query("select * from book", this::mapRowToBook);
	}

	private Book mapRowToBook(ResultSet rs, int rowNum) throws SQLException {
		return new Book(rs.getString("bookId"), rs.getString("bookTitle"), rs.getString("author"));
	}
}
