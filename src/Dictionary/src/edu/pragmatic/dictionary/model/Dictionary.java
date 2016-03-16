package Dictionary.src.edu.pragmatic.dictionary.model;

import java.util.*;

public class Dictionary {

	private Map<String, WordEntity> words;
	
	public Dictionary() {
		words = new HashMap<>();
	}
	
	public void addWord(WordEntity entity) {
		words.put(entity.getWord(), entity);
	}
	
	public String search(String word) {	
		WordEntity wordEntity = words.get(word);
		if(wordEntity == null) {
			return null;
		}
		
		return wordEntity.getTranslation();
	}
	
}
