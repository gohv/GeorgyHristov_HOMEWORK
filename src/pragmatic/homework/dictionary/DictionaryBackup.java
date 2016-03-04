package pragmatic.homework.dictionary;

import java.util.Scanner;
import static java.lang.System.out;

public class DictionaryBackup {

	public static void main(String[] args) {

		DatabaseOfWords database = new DatabaseOfWords();
		int choice;
		boolean doWhile = true;
		Index index = new Index();
		Scanner keyboard = new Scanner(System.in);

		out.println("|--------------------------|");
		out.println("|Welcome to the dictionary |");
		out.println("|--------------------------|");
		out.println(" ");
		do {
			out.println(" ");
			out.println("Type 1 to add a new word");
			out.println(" ");
			out.println("Type 2 to search for a word");
			out.println(" ");
			out.println("Type 3 to exit the Dictionary");
			out.println(" ");

			DatabaseOfWords.dictionary.put("Dog", "a domesticated animal");
			DatabaseOfWords.dictionary.put("Cat", "a domesticated animal");

			choice = keyboard.nextInt();
			if (choice == 1) {

				database.addNewWord();
			} else if (choice == 2) {

				index.search();
			} else if (choice == 3) {

				index.close();
			}
		} while (doWhile);
	}

}
