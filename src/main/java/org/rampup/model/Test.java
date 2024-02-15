package org.rampup.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("book_pu");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Book book = new Book();
		book.setTitle("Title");
		
		entityManager.persist(book);
		entityManager.getTransaction().commit();
		System.out.println(book.toString());
	}

}
