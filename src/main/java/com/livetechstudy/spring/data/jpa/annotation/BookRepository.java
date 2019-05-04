package com.livetechstudy.spring.data.jpa.annotation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
	
}
