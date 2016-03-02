package pragmatic.homework.dictionary;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Hashtable;

/**
 * 
 * This is the search part of the Dictionary Methods here provide search options
 *
 */

public class Index {
	DatabaseOfWords search = new DatabaseOfWords();
	Scanner keyboard = new Scanner(System.in);

	public void search() {
		out.print("Search for: ");
		String find = keyboard.next();
		
		out.println(search.dictionary.get(find));
	}

}
