package pragmatic.javaIO.homework;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileString {

	public static void main(String[] args) {
		
		
		PrintWriter writer;
		try {
			writer = new PrintWriter("file/file2.txt");
			writer.println("test");
			writer.println("test2");
			writer.println("test3");
			writer.println("test4");
			writer.close();
			
		} catch (FileNotFoundException e) {
			
			System.err.println("File not found!");
		}
		
		System.out.println("Its done! Check File!");
		
	}

}
