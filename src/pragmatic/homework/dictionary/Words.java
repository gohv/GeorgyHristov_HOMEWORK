package pragmatic.homework.dictionary;

/**
 * 
 * This class have the methods that add new words
 *
 */


public class Words {
	DatabaseOfWords database = new DatabaseOfWords();
	
	public void addWord(String key, String value){
		key = (String) database.dictionary.put(key, value);		
		
		}
	
	
}
