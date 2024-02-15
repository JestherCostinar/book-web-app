package org.rampup.dao;

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
		
		Book book = new Book();
		book.setTitle("Another book");
		
		bookDao.addBook(book);
	}

}
