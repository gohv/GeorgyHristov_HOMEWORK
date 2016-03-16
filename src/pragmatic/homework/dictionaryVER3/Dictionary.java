package pragmatic.homework.dictionaryVER3;

import static java.lang.System.out;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {

	private TreeMap<String, WordContainer> dictionary = new TreeMap();

	public void addWord(WordContainer container) {
		dictionary.put(container.getWord(), container);
	}

	public String search(String search) {
		WordContainer container = dictionary.get(search);
		if (container == null) {
			System.out.println("Nothing found");
		}
		return container.getTranslation();
	}

}
