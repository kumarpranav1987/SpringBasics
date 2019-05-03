package com.livetechstudy.spring.data.jpa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao {

	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Book> getAllBooks() {
		return jdbcTemplate.query("select * from books", this::mapRowToBook);
	}

	private Book mapRowToBook(ResultSet rs, int rowNum) throws SQLException {
		return new Book(rs.getString("bookId"), rs.getString("bookTitle"), rs.getString("author"));
	}

	@Override
	public void insertBook(Book book) {
		jdbcTemplate.update("insert into books values('"+book.getBookId()+"','"+book.getBookTitle()+"','"+book.getAuthor()+"')");		
	}

	@Override
	public Book findBookByID(String bookID) {
		return jdbcTemplate.queryForObject("select * from books where bookId=?", new Object[] {bookID}, this::mapRowToBook);
		
	}

	@Override
	public int deleteBook(String bookID) {
		return jdbcTemplate.update("delete from books where bookId="+"'"+bookID+"'");
	}

	@Override
	public List<Book> findBooksByTitle(String title) {
		return jdbcTemplate.query("select * from books where bookTitle=?", new Object[] {title}, this::mapRowToBook);
	}
	
}
