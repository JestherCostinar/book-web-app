package org.rampup.dao;

import org.rampup.model.Book;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class BookDaoImpl implements BookDao{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	@Transactional
	public void addBook(Book book) {
		entityManager.persist(book);
		System.out.println(book.toString());

	}

}
