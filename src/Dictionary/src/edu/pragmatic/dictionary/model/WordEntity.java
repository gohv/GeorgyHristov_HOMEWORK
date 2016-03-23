package Dictionary.src.edu.pragmatic.dictionary.model;

public class WordEntity {
	
	private String word;
	private String translation;
	private String trans;
	public WordEntity(String word, String translation, String trans) {
		super();
		this.word = word;
		this.translation = translation;
		this.trans = trans;
	}
	
	public String getWord() {
		return word;
	}
	
	public String getTranslation() {
		return translation;
	}
	
	public String getTrans(){
		return trans;
	}
}
