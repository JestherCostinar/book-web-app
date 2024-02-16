package org.rampup.service;

import java.util.List;

import org.rampup.model.Book;

public interface BookService {
	void addBook(Book book);
	void updateBook(Book book);
	List<Book> selectAll();
	void deleteBook(Long id);
	Book findById(Long id);
}
