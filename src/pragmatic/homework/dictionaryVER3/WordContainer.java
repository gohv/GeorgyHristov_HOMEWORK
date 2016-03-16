package pragmatic.homework.dictionaryVER3;

public class WordContainer {
	private String word;
	private String translation;
	
	public WordContainer(String addWord, String addTranslation) {
		super();
		this.word = addWord;
		this.translation = addTranslation;
	}
	public String getTranslation(){
		return translation;
	}
	public String getWord(){
		return word;
	}
}
