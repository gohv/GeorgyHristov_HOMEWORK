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
	// the KEY is going to be the word:
	Hashtable<String, String> dictionary = new Hashtable<>();
	Scanner keyboard = new Scanner(System.in);
	private String word;
	private String explanation;

	public void addNewWord() {
		
		while (keyboard.hasNext()) {
			out.print("Type a word: ");
			word = keyboard.next();
			if (DONE.equals(word)) {
				break;
			}
			
			out.print("Type explanation: ");
			explanation = keyboard.next();
			if (DONE.equals(explanation)) {
				break;
			}
			// I tried placing dictionary.put(word, explanation); here - it did not work!
		}
		dictionary.put(word, explanation);

	}
	public void printer(){
		out.println(dictionary);
	}

}
