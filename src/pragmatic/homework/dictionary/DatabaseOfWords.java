package pragmatic.homework.dictionary;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * This is where all the words are stored and called upon Methods here provide
 * the words and their explanation
 *
 */

public class DatabaseOfWords {
	private final String DONE = "done";
	// Hashtable Must be static or it returns NULL on search !!!!!
	static Hashtable<String, Object> dictionary = new Hashtable<>();

	Scanner keyboard = new Scanner(System.in);
	private String word;
	private String explanation;

	public void addNewWord() {
		
		while (true) {
			out.println("Type a word or type   'done'  to exit: ");
			word = keyboard.nextLine();
			if (DONE.equals(word)) {
				break;
			}
			out.println("Type explanation: ");
			explanation = keyboard.nextLine();
			if (DONE.equals(explanation)) {
				break;
			}
			dictionary.put(word, explanation);
		}

	}


}
