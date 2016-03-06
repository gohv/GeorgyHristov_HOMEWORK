package pragmatic.homework.dictionaryVER2;

public class Index {

	public void addWord(String word, String explanation) {
		Dictionary.dictionary.put(word, explanation);
	}
	public void search(String find){
		Dictionary.dictionary.get(find);
	}

}
