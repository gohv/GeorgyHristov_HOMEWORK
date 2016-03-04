package pragmatic.homework.dictionary;

import static java.lang.System.out;
import java.util.Scanner;

/**
 * 
 * This is the search part of the Dictionary Methods here provide search options
 *
 */

public class Index {
	private String EXIT = "exit";
	DatabaseOfWords search = new DatabaseOfWords();
	Scanner keyboard = new Scanner(System.in);

	public void search() {
		out.print("Search for: ");
		String find = keyboard.next();
		out.println(DatabaseOfWords.dictionary.get(find));

	}

	public void close() {
		out.println("Exit?: ");
		EXIT = keyboard.next();
		if (EXIT.equals(EXIT)) {
			out.println("Okay bye!");

		}
		System.exit(0);
	}

}
