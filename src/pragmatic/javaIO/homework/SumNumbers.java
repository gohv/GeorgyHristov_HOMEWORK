package pragmatic.javaIO.homework;

import java.io.*;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.err;

public class SumNumbers {

	public static void main(String[] args) {

		File numbers = new File("file/numbers.txt");
		int total = 0;
		
		
		try {

			Scanner fileReader = new Scanner(numbers);

			while (fileReader.hasNextInt()) {

				total += fileReader.nextInt();

			}
			out.println("Total is: " + total);

			fileReader.close();
		} catch (IOException e) {
			err.println("File is not there!");

		}
	}
}
