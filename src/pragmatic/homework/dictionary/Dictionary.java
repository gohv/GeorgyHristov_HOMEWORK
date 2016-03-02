package pragmatic.homework.dictionary;

import java.util.Hashtable;

import javax.print.attribute.HashAttributeSet;

public class Dictionary {

	public static void main(String[] args) {
		DatabaseOfWords test = new DatabaseOfWords();
		Index search = new Index();
	//	test.addNewWord();
		// test.printer();
		test.dictionary.put("Dog", "a domesticated animal");
		test.dictionary.put("Cat", "a domesticated animal");
		search.search();
	}

}
