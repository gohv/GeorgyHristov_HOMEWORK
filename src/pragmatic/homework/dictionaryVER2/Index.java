package pragmatic.homework.dictionaryVER2;

import static java.lang.System.out;

import pragmatic.homework.dictionary.DatabaseOfWords;

public class Index {
	private String EXIT = "EXIT";
	Dictionary Dictionary = new Dictionary();
	
	public void addWord(String word, String explanation) {
		Dictionary.dictionary.put(word, explanation);
	}

	public void search(String find) {
		Dictionary.dictionary.get(find);
		if (Dictionary.dictionary.get(find) == null) {
			out.println("Nothing found! Search is Case sensitive!");
		}
		System.out.println(Dictionary.dictionary.get(find));
	}

	public void exit(String exit) {
		this.EXIT = exit;
		if (exit.equalsIgnoreCase("EXIT")) {
			System.out.println("Bye Bye!");
			System.exit(0);
		}
	}

}
