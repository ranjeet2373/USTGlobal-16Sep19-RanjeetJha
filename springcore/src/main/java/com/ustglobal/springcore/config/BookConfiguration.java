package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

@Configuration
public class BookConfiguration {
	
	@Bean(name="book")
	public Book getBook() {
		Book book = new Book();
		book.setName("Ranjeet");
		book.setPrice(20);
		return book;
	}
	
	@Bean(name="author")
	public Author getauthor() {
		Author author = new Author();
		author.setName("Rahul");
		author.setPenName("cello");
		return author;
	}
	
	

}
