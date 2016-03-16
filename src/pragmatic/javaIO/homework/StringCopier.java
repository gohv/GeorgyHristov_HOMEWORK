package pragmatic.javaIO.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.out;
import static java.lang.System.err;

public class StringCopier {
	public static void main(String[] args) {

		try (FileInputStream input = new FileInputStream("file/file.txt");
				FileOutputStream output = new FileOutputStream("file/output.txt");) {

			while (true) {
				int b = input.read();
				if (b == -1) {
					break;
				}

				output.write(b);
			}
		} catch (FileNotFoundException e) {
			err.println("No file Found!");
		} catch (IOException e) {
			err.println("Troubleshoot the code!");
		}

		out.println("DONE");

	}

}
