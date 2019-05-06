package com.livetechstudy.spring.data.jpa.xml;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, String> {
	
}
