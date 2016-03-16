package edu.pragmatic.io;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String title;
	private String author;
	private int year;
	
	public Book(String title, String author, int year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return "title: " + title + ", author: " + author + ", year: " + year;
	}
	
	
}
