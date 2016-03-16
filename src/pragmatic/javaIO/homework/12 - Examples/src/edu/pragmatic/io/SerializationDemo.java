package edu.pragmatic.io;

import java.io.*;
import java.util.*;

public class SerializationDemo {

	public static void main(String[] args) {
		
		try (FileOutputStream outputStream = new FileOutputStream("res/book");
			 ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
			
			/*
			Book b = new Book("java", "<author>", 2016);
			objectOutputStream.writeObject(b);
			
			System.out.println("Original book is: " + b);
			*/
			
			List<Book> books = new ArrayList<>();
			books.add(new Book("java", "author1", 2016));
			books.add(new Book("java2", "author2", 2006));
			books.add(new Book("java3", "author3", 2010));
			
			objectOutputStream.writeObject(books);
			
		} catch (IOException e) {
			System.out.println("Error");
		}
	
		
		try (FileInputStream inputStream = new FileInputStream("res/book");
			 ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
			
			/*
			Book b = (Book)objectInputStream.readObject();
			System.out.println("Deserialized books is: " + b);
			*/
			
			Object books = objectInputStream.readObject();
			System.out.println("Deserialized books: " + books);
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error");
		}
	}
	
}
