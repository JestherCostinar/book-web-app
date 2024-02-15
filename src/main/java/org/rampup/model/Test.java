package org.rampup.model;

public class Test {

	public static void main(String[] args) {
		Book book = new Book();
		book.setId(1);
		book.setTitle("Title");
		
		System.out.println(book.toString());
	}

}
