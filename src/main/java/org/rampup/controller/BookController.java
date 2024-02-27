package org.rampup.controller;

import java.util.List;

import org.rampup.model.Book;
import org.rampup.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAllBooks() {
		return bookService.selectAll();
	}

	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Book findBookById(@PathVariable Long id) {
		return bookService.findById(id);
	}

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<String> addBook(@RequestBody Book book) {
    	bookService.addBook(book);
    	return ResponseEntity.ok("Book saved");
    }
    
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ResponseEntity<String> updateBook(@RequestBody Book book) {
    	bookService.updateBook(book);
    	return ResponseEntity.ok("bOOK UPDATE");
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
    	
        bookService.deleteBook(id);
    	
    	return ResponseEntity.ok("Deleted successfully");
    }
}
	