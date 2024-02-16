package org.rampup.service;

import java.util.List;

import org.rampup.dao.BookDao;
import org.rampup.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookDao;
	
	@Override
	@Transactional
	public void addBook(Book book) {
		bookDao.addBook(book);
		
	}

	@Override
	@Transactional
	public void updateBook(Book book) {
		bookDao.updateBook(book);
	}

	@Override
	public List<Book> selectAll() {
		return bookDao.selectAll();
	}

	@Override
	@Transactional
	public void deleteBook(Long id) {
		bookDao.deleteBook(id);
		
	}

	@Override
	public Book findById(Long id) {
		return bookDao.findById(id);
	}

}
