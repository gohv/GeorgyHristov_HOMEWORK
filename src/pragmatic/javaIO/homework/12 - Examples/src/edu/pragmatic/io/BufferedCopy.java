package edu.pragmatic.io;

import java.io.*;

public class BufferedCopy {

	public static void main(String[] args) {
		
		try (FileInputStream inputStream = new FileInputStream("res/t.txt");
			 FileOutputStream outputStream = new FileOutputStream("res/copy3.txt");
			 BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
			 BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);) {
			
			while(true) {
				int b = bufferedInputStream.read();
				if(b == -1) {
					break;
				}
				
				bufferedOutputStream.write(b);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File does not exist");
		} catch (IOException e) {			
			System.err.println("IO error occured");
		}
		
		
		System.out.println("DONE");
	}
	
}