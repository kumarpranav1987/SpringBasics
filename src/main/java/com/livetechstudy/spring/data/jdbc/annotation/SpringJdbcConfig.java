package com.livetechstudy.spring.data.jdbc.annotation;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.livetechstudy.spring.data.jdbc.annotation")
public class SpringJdbcConfig {
	@Bean
	public DataSource mysqlDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.hibernate.dialect.MySQL5Dialect");
		dataSource.setUrl("jdbc:mysql://10.101.160.237/library_hibernate?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		return dataSource;
	}
}
