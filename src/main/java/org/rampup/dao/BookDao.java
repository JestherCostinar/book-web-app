package org.rampup.dao;

import java.util.List;

import org.rampup.model.Book;

public interface BookDao{
	void addBook(Book book);
	void updateBook(Book book);
	List<Book> selectAll();
	void deleteBook(Long id);
	Book findById(Long id);
}
