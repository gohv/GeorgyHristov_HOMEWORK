package pragmatic.homework.dictionary;

import static java.lang.System.out;
import java.util.Scanner;

/**
 * 
 * This is the search part of the Dictionary Methods here provide search options
 *
 */

public class Index {
<<<<<<< HEAD
	
	DatabaseOfWords search = new DatabaseOfWords();
=======

	DatabaseOfWords index = new DatabaseOfWords();
>>>>>>> origin/master
	Scanner keyboard = new Scanner(System.in);

	public void search() {
		out.print("Search for: ");
		String find = keyboard.next();
		out.println(DatabaseOfWords.dictionary.get(find));
		if (DatabaseOfWords.dictionary.get(find) == null) {
			out.println("Nothing found! Search is Case sensitive!");
		}
	}

	public void close() {

		out.println("Okay bye!");
		System.exit(0);

	}

}
