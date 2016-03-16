package pragmatic.javaIO.homework;

import static java.lang.System.err;
import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CutFile {

	public static void main(String[] args) {
		try (FileInputStream input = new FileInputStream("file/file.txt");
				FileOutputStream output = new FileOutputStream("newFolder/output.txt");) {

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
