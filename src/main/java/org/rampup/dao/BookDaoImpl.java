package org.rampup.dao;

import java.util.List;

import org.rampup.model.Book;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
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

	@Override
	@Transactional
	public void updateBook(Book newBook) {
		Book existingBook = entityManager.find(Book.class, newBook.getId());
		
		existingBook.setTitle(newBook.getTitle());
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> selectAll() {
		TypedQuery<Book> query = entityManager.createQuery("SELECT b FROM Book b", Book.class);
		List<Book> books = query.getResultList();
		return books;
		
	}

	@Override
	@Transactional
	public void deleteBook(Long id) {
		Book existingBook = entityManager.find(Book.class, id);

		entityManager.remove(existingBook);
		
	}

	@Override
	public Book findById(Long id) {
		return entityManager.find(Book.class, id);
		
	}

}
