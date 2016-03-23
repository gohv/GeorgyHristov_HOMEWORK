package Dictionary.src.edu.pragmatic.dictionary.model;

import java.io.IOException;
import java.util.*;

public class Dictionary {

	private Map<String, WordEntity> words;
	
	public Dictionary() {
		words = new HashMap<>();
	}
	
	public void addWord(WordEntity entity) throws IOException{
		words.put(entity.getWord(), entity);
		save();
		
	}
	
	public String search(String word) throws IOException{	
		WordEntity wordEntity = words.get(word);
		FileService.load("file/word.txt");
		if(wordEntity == null) {
			return null;
		}
		
		return wordEntity.getTranslation();
	}	
	
	private void save() throws IOException{
		FileService.save(words.values(), "words.txt");
	}
	
}
