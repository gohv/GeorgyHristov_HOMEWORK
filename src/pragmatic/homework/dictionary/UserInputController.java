package pragmatic.homework.dictionary;

import static java.lang.System.out;

import java.util.Scanner;

public class UserInputController {
	
	private int choice;
	private boolean doWhile = true;
	DatabaseOfWords database = new DatabaseOfWords();
	Scanner keyboard = new Scanner(System.in);
	Index index = new Index();
	
	public void welcome(){
		out.println("|--------------------------|");
		out.println("|Welcome to the dictionary |");
		out.println("|--------------------------|");
		out.println(" ");
	}
	
	public void controller(){
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
