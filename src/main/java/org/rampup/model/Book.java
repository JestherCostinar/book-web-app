package org.rampup.model;

public class Book {
	
	private int id;
	private String title;
	
	public Book() {
		super();
	}
	
	public Book(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + "]";
	}
	
	
}
