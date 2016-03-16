package edu.pragmatic.io;

import java.io.*;

public class BinaryCopy {

	public static void main(String[] args) {
		
		try (FileInputStream inputStream = new FileInputStream("res/t.txt");
			 FileOutputStream outputStream = new FileOutputStream("res/copy.txt");) {
			
			while(true) {
				int b = inputStream.read();
				if(b == -1) {
					break;
				}
				
				outputStream.write(b);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File does not exist");
		} catch (IOException e) {			
			System.err.println("IO error occured");
		}
		
		
		System.out.println("DONE");
	}
	
}
