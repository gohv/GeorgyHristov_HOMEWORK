package Dictionary.src.edu.pragmatic.dictionary;

import java.io.IOException;

import Dictionary.src.edu.pragmatic.dictionary.model.UserInputController;

public class Demo {

	public static void main(String[] args) {
		
		UserInputController userInputController = new UserInputController();
		try {
			userInputController.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
