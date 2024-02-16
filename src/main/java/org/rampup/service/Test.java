package org.rampup.service;

import java.util.List;

import org.rampup.dao.BookDao;
import org.rampup.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService bookService = (BookService) applicationContext.getBean("bookServiceImpl");
		
		Book book = new Book();
		book.setTitle("Added book");
//		Book book1 = new Book();
//		book1.setTitle("Book 2");
//		
//		
		bookService.addBook(book);
//		bookDao.addBook(book1);
		
//		List<Book> books = bookService.selectAll();
//		System.out.println(books);
		
//		Book book = new Book(2, "Also Update Title");
//		bookService.updateBook(book);
//		
//		Book book1 = bookService.findById(2L);
//		System.out.println(book1);
		
//		bookService.deleteBook(5L);
	}

}
