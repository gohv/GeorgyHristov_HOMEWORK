package pragmatic.homework.teamGenerator;

import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class People {

	private int numberOfPeople;
	Scanner keyboard = new Scanner(System.in);
	private String[] namesOfPeople;

	public void numberOfPeople() {

		out.print("How many people are in this class?: ");
		numberOfPeople = keyboard.nextInt();
		while (numberOfPeople > 30 || numberOfPeople < 1) {
			out.println("I highly dount there are " + numberOfPeople + " in this classroom");
			out.print("Re-enter the number of people: ");
			numberOfPeople = keyboard.nextInt();
		}
	}

	/**
	 * 
	 * Below method will take the number of ppl and store the names in a String
	 * array - hopefully - IT ALIVEEEEE!!!!!!!!
	 * 
	 */
	public void namePeople() {
		out.println("Enter the names of the " + numberOfPeople + " people");
		namesOfPeople = new String[numberOfPeople];
		for (int i = 0; i < numberOfPeople; i++) {
			namesOfPeople[i] = keyboard.next();

		}
	}

	/**
	 * 
	 * This is a test method below :)
	 * 
	 */
	public void printNames() {

		System.out.println("Names are printed below:  ");
		for (int i = 0; i < numberOfPeople; i++) {
			System.out.println(namesOfPeople[i]);
		}
	}

	// below code is not mine - its called the Fisher–Yates shuffle, I only
	// implemented it here:
	public void shuffle() {
		// If running on Java 6 or older, use `new Random()` on RHS here
		Random rnd = new Random();
		for (int i = namesOfPeople.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			String a = namesOfPeople[index];
			namesOfPeople[index] = namesOfPeople[i];
			namesOfPeople[i] = a;
		}
	}
// print ppl from the array / if there are 3 ppl left - make a little check and group the 3 of them
	public void sortNames() {
		Arrays.sort(namesOfPeople);
	}
}
