package org.rampup.dao;

import java.util.List;

import org.rampup.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookDao bookDao = (BookDao) applicationContext.getBean("bookDaoImpl");
		
//		Book book = new Book();
//		book.setTitle("Book 1");
//		Book book1 = new Book();
//		book1.setTitle("Book 2");
//		
//		
//		bookDao.addBook(book);
//		bookDao.addBook(book1);
		

		
//		Book book = new Book(1, "Update Title");
//		bookDao.updateBook(book);
//		
//		Book book1 = bookDao.findById(1L);
//		System.out.println(book1);
		
		List<Book> books = bookDao.selectAll();
		System.out.println(books);
	}

}
