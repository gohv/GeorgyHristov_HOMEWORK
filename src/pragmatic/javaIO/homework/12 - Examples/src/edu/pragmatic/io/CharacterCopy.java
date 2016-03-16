package edu.pragmatic.io;

import java.io.*;

public class CharacterCopy {

	public static void main(String[] args) {
		
		try (FileReader reader = new FileReader("res/t.txt");
			FileWriter writer = new FileWriter("res/copy2.txt");) {
			
			while(true) {
				int ch = reader.read();
				if(ch == -1) {
					break;
				}
				
				writer.write(ch);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done");
	}
	
}
