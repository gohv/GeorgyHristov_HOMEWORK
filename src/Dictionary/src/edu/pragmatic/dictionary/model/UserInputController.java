package Dictionary.src.edu.pragmatic.dictionary.model;

import java.util.Scanner;

public class UserInputController {

	private Scanner scanner;
	private Dictionary dictionary;
	
	enum MenuOption {
		ADD,
		SEARCH,
		EXIT,
		INVALID
	}
	
	public UserInputController() {
		scanner = new Scanner(System.in);
		dictionary = new Dictionary();
	}
	
	public void start() {
		
		boolean shouldExit = false;
		do {
			
			MenuOption selectedOption = showMenu();
			switch(selectedOption) {
			case ADD:
				addWord();
				break;
			case SEARCH:
				search();
				break;
			case EXIT:
				shouldExit = true;
				break;
			case INVALID:
				System.out.println("Option is not valid!!!");
				break;
			}
		} while(shouldExit == false);
		
		System.out.println("Bye!!!");
	}
	
	private MenuOption showMenu() {
		System.out.println("--- MENU ---");
		System.out.println("1. Enter new word <-> translation");
		System.out.println("2. Search for translation");
		System.out.println("3. Exit");
		System.out.println();
		System.out.print("Your choice: ");
		
		int choice = scanner.nextInt();
		scanner.nextLine();
		switch(choice) {
		case 1: return MenuOption.ADD;
		case 2: return MenuOption.SEARCH;
		case 3: return MenuOption.EXIT;
		default: return MenuOption.INVALID;
		}
	}
	
	private void addWord() {
		System.out.print("Enter <word> = <translation>: ");
		String result = scanner.nextLine();
		String[] tokens = result.split("=");
		if(tokens.length == 2) {
			String word = tokens[0].trim();
			String translation = tokens[1].trim();
			
			WordEntity entity = new WordEntity(word, translation);
			dictionary.addWord(entity);
		}
	}
	
	private void search() {
		System.out.println("Enter a word: ");
		String word = scanner.nextLine();
		String translation = dictionary.search(word);
		if(translation != null) {
			System.out.println("Translation is: " + translation);
		} else {
			System.out.println("No such word exists");
		}
	}
}
