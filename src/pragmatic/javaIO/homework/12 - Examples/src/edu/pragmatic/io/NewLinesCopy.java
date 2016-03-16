package edu.pragmatic.io;

import java.io.*;
import java.util.Scanner;

public class NewLinesCopy {

	public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream("res/t.txt")));
			 PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("res/copy4.txt")))) {
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				printWriter.println(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		System.out.println("Done");
	}
	
}
